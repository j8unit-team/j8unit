package org.j8unit.util;

import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.invoke.MethodHandles.lookup;
import static java.lang.invoke.MethodHandles.Lookup.PACKAGE;
import static java.lang.invoke.MethodHandles.Lookup.PRIVATE;
import static java.lang.invoke.MethodHandles.Lookup.PROTECTED;
import static java.lang.invoke.MethodHandles.Lookup.PUBLIC;
import static java.lang.invoke.MethodType.methodType;
import static java.lang.reflect.Modifier.isPrivate;
import static java.lang.reflect.Modifier.isProtected;
import static java.lang.reflect.Modifier.isPublic;
import static java.lang.reflect.Modifier.isStatic;
import static java.lang.reflect.Proxy.newProxyInstance;
import static java.util.function.Function.identity;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isA;
import static org.j8unit.util.Reflection.vicariousLookup;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.internal.matchers.ThrowableMessageMatcher.hasMessage;
import static org.junit.rules.ExpectedException.none;
// import static sun.invoke.util.VerifyAccess.isSamePackage;
// import static sun.invoke.util.VerifyAccess.isSamePackageMember;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Function;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LookupTests
extends EmptyClass {

    public static abstract interface SomeNestedInterface {

        public abstract String someAbstractMethod();

        public default String someDefaultMethod() {
            return "someFoobarReturnValue";
        };

        public abstract void someAbstractVoidMethod();

    }

    @Rule
    public ExpectedException thrown = none();

    /*
     * Some simple proof:
     */

    @Test
    public void verify_lookupIn_null_fails()
    throws Exception {
        this.thrown.expect(NullPointerException.class);

        lookup().in(null);
    }

    @Test
    public void verify_returning_some_value_does_not_matter_for_proxied_void_method()
    throws Exception {
        final Method method = SomeNestedInterface.class.getMethod("someAbstractVoidMethod");
        assertEquals(Void.TYPE, method.getReturnType());
        final InvocationHandler handler = ($1, $2, $3) -> new Object();
        final SomeNestedInterface proxy = (SomeNestedInterface) newProxyInstance(getSystemClassLoader(), new Class<?>[] { SomeNestedInterface.class }, handler);
        proxy.someAbstractVoidMethod(); // no exception is thrown
    }

    /*
     * Testing the invocation of the specified handler:
     */

    private static final SomeNestedInterface createProxiedFoobarInstance() {
        return (SomeNestedInterface) newProxyInstance(getSystemClassLoader(), new Class<?>[] { SomeNestedInterface.class }, ($1, $2, $3) -> {
            throw new RuntimeException("Marker exception indicating handler invocation.");
        });
    }

    @Test
    public void execute_handler_when_calling_proxied_abstract_method()
    throws Exception {
        this.thrown.expect(RuntimeException.class);
        this.thrown.expectMessage("Marker exception indicating handler invocation.");

        final SomeNestedInterface proxy = createProxiedFoobarInstance();
        proxy.someAbstractMethod();
    }

    @Test
    public void execute_handler_when_calling_proxied_default_method()
    throws Exception {
        this.thrown.expect(RuntimeException.class);
        this.thrown.expectMessage("Marker exception indicating handler invocation.");

        final SomeNestedInterface proxy = createProxiedFoobarInstance();
        proxy.someDefaultMethod();
    }

    @Test
    public void execute_handler_when_invoking_proxied_default_method()
    throws Exception {
        this.thrown.expect(InvocationTargetException.class);
        this.thrown.expectCause(isA(RuntimeException.class));
        this.thrown.expectCause(hasMessage(equalTo("Marker exception indicating handler invocation.")));

        final Method method = SomeNestedInterface.class.getMethod("someDefaultMethod");
        final SomeNestedInterface proxy = createProxiedFoobarInstance();
        method.invoke(proxy);
    }

    @Test
    public void execute_handler_when_invoking_proxied_default_method_by_handle()
    throws Throwable {
        this.thrown.expect(RuntimeException.class);
        this.thrown.expectMessage("Marker exception indicating handler invocation.");

        final Lookup lookup = lookup();
        final MethodHandle handle = lookup.findVirtual(SomeNestedInterface.class, "someDefaultMethod", methodType(String.class));
        final SomeNestedInterface proxy = createProxiedFoobarInstance();
        handle.bindTo(proxy).invoke();
    }

    /*
     * Testing {@link Lookup#unreflectSpecial(Method, Class)}:
     */

    @Test
    public void fail_when_creating_foreign_unreflectSpecial_methodHandle()
    throws Throwable {
        this.thrown.expect(IllegalAccessException.class);
        this.thrown.expectMessage("no private access for invokespecial: interface org.j8unit.util.LookupTests$SomeNestedInterface, from org.j8unit.util.LookupTests");

        final Lookup lookup = lookup();
        assertEquals(LookupTests.class, lookup.lookupClass());
        verifyAllModes(lookup);

        final Method method = SomeNestedInterface.class.getMethod("someDefaultMethod");
        lookup.unreflectSpecial(method, SomeNestedInterface.class);
    }

    @Test
    public void succeed_when_creating_unreflectSpecial_handle_for_nested_type_via_lookupIn_nested_type()
    throws Throwable {
        final Lookup lookup = lookup().in(SomeNestedInterface.class);
        assertEquals(SomeNestedInterface.class, lookup.lookupClass());
        verifyNoProtectedMode(lookup);

        final Method method = SomeNestedInterface.class.getMethod("someDefaultMethod");
        final MethodHandle handle = lookup.unreflectSpecial(method, SomeNestedInterface.class);

        final SomeNestedInterface proxy = createProxiedFoobarInstance();
        final Object result = handle.bindTo(proxy).invoke();
        assertEquals("someFoobarReturnValue", result);
    }

    @Test
    public void succeed_when_creating_unreflectSpecial_handle_for_nested_type_via_vicariousLookup()
    throws Throwable {
        final Lookup lookup = vicariousLookup(SomeNestedInterface.class);
        assertEquals(SomeNestedInterface.class, lookup.lookupClass());
        verifyAllModes(lookup);

        final Method method = SomeNestedInterface.class.getMethod("someDefaultMethod");
        final MethodHandle handle = lookup.unreflectSpecial(method, SomeNestedInterface.class);

        final SomeNestedInterface proxy = createProxiedFoobarInstance();
        final Object result = handle.bindTo(proxy).invoke();
        assertEquals("someFoobarReturnValue", result);
    }

    /**
     * Similar to {@link #succeed_when_creating_unreflectSpecial_handle_for_nested_type_via_vicariousLookup()} but uses
     * {@link Lookup#unreflect(Method)}.
     *
     * In result, it does not invoke the {@code default} behaviour but the handler.
     */
    @Test
    public void succeed_when_creating_unreflect_handle_for_nested_type_via_vicariousLookup()
    throws Throwable {
        this.thrown.expect(RuntimeException.class);
        this.thrown.expectMessage("Marker exception indicating handler invocation.");

        final Lookup lookup = vicariousLookup(SomeNestedInterface.class);
        assertEquals(SomeNestedInterface.class, lookup.lookupClass());
        verifyAllModes(lookup);

        final Method method = SomeNestedInterface.class.getMethod("someDefaultMethod");
        final MethodHandle handle = lookup.unreflect(method);

        final SomeNestedInterface proxy = createProxiedFoobarInstance();
        handle.bindTo(proxy).invoke();
    }

    @Test
    public void fail_when_creating_unreflectSpecial_handle_for_foreign_type_via_lookupIn()
    throws Throwable {
        this.thrown.expect(IllegalAccessException.class);
        this.thrown.expectMessage("no private access for invokespecial: interface java.util.function.Function, from java.util.function.Function/public");

        final Lookup lookup = lookup().in(Function.class);
        assertEquals(Function.class, lookup.lookupClass());
        verifyPublicOnlyMode(lookup);

        final Method method = Function.class.getMethod("andThen", Function.class);
        lookup.unreflectSpecial(method, Function.class);
    }

    @Test
    public void succeed_when_creating_unreflectSpecial_handle_for_foreign_type_via_vicariousLookup()
    throws Throwable {
        final Lookup lookup = vicariousLookup(Function.class);
        assertEquals(Function.class, lookup.lookupClass());
        verifyAllModes(lookup);

        final Method method = Function.class.getMethod("andThen", Function.class);
        final MethodHandle handle = lookup.unreflectSpecial(method, Function.class);

        final Function<?, ?> proxy = (Function<?, ?>) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Function.class }, ($1, $2, $3) -> {
            throw new RuntimeException("Marker exception indicating handler invocation.");
        });
        final Function<?, ?> arg = identity();
        final Object result = handle.bindTo(proxy).invoke(arg);
        assertNotNull(result);
        assertTrue(Function.class.isInstance(result));
    }

    /*
     * Testing {@code lookup()}, {@code lookup().in(...)}, and {@code vicariousLookup(...)}:
     */

    // @Test
    // public void proof_lookup_in_super_class_looses_private_and_protected_access()
    // throws Exception {
    // final Lookup myLookup = lookup();
    // assertEquals(LookupTests.class, myLookup.lookupClass());
    // verifyAllModes(myLookup);
    //
    // assertEquals(EmptyClass.class, this.getClass().getSuperclass());
    // assertTrue(isSamePackage(LookupTests.class, EmptyClass.class));
    // assertFalse(isSamePackageMember(LookupTests.class, EmptyClass.class));
    //
    // final Lookup lookup = myLookup.in(EmptyClass.class);
    // assertTrue(isPublic(lookup.lookupModes()));
    // assertFalse(isProtected(lookup.lookupModes()));
    // assertTrue(isPackage(lookup.lookupModes()));
    // assertFalse(isPrivate(lookup.lookupModes()));
    // }

    @Test
    public void proof_vicarious_lookup_without_explicit_modes()
    throws Exception {
        final Lookup lookup = vicariousLookup(Object.class);
        verifyAllModes(lookup);
    }

    @Test
    public void proof_vicarious_lookup_with_public_mode()
    throws Exception {
        final Lookup lookup = vicariousLookup(Object.class, PUBLIC);
        verifyPublicOnlyMode(lookup);
    }

    /*
     *
     */

    public static final int ALL_MODES = PUBLIC | PROTECTED | PACKAGE | PRIVATE;

    public static boolean isPackage(final int mod) {
        assert PACKAGE == Modifier.STATIC;
        return isStatic(mod);
    }

    public static void verifyAllModes(final Lookup lookup) {
        // lookup has PUBLIC mode
        assertEquals(PUBLIC, lookup.lookupModes() & PUBLIC);
        assertTrue(isPublic(lookup.lookupModes()));
        // lookup has PACKAGE mode
        assertEquals(PACKAGE, lookup.lookupModes() & PACKAGE);
        assertTrue(isStatic(lookup.lookupModes()));
        // lookup has _not_ PROTECTED mode
        assertEquals(PROTECTED, lookup.lookupModes() & PROTECTED);
        assertTrue(isProtected(lookup.lookupModes()));
        // lookup has PRIVATE mode
        assertEquals(PRIVATE, lookup.lookupModes() & PRIVATE);
        assertTrue(isPrivate(lookup.lookupModes()));
        // lookup has _not_ ALL_MODES mode
        assertEquals(ALL_MODES, lookup.lookupModes());
    }

    public static void verifyPublicAndPackageModes(final Lookup lookup) {
        // lookup has PUBLIC mode
        assertEquals(PUBLIC, lookup.lookupModes() & PUBLIC);
        assertTrue(isPublic(lookup.lookupModes()));
        // lookup has PACKAGE mode
        assertEquals(PACKAGE, lookup.lookupModes() & PACKAGE);
        assertTrue(isStatic(lookup.lookupModes()));
        // lookup has _not_ PROTECTED mode
        assertNotEquals(PROTECTED, lookup.lookupModes() & PROTECTED);
        assertFalse(isProtected(lookup.lookupModes()));
        // lookup has PRIVATE mode
        assertNotEquals(PRIVATE, lookup.lookupModes() & PRIVATE);
        assertFalse(isPrivate(lookup.lookupModes()));
        // lookup has _not_ ALL_MODES mode
        assertNotEquals(ALL_MODES, lookup.lookupModes());
    }

    public static void verifyNoProtectedMode(final Lookup lookup) {
        // lookup has PUBLIC mode
        assertEquals(PUBLIC, lookup.lookupModes() & PUBLIC);
        assertTrue(isPublic(lookup.lookupModes()));
        // lookup has PACKAGE mode
        assertEquals(PACKAGE, lookup.lookupModes() & PACKAGE);
        assertTrue(isStatic(lookup.lookupModes()));
        // lookup has _not_ PROTECTED mode
        assertNotEquals(PROTECTED, lookup.lookupModes() & PROTECTED);
        assertFalse(isProtected(lookup.lookupModes()));
        // lookup has PRIVATE mode
        assertEquals(PRIVATE, lookup.lookupModes() & PRIVATE);
        assertTrue(isPrivate(lookup.lookupModes()));
        // lookup has _not_ ALL_MODES mode
        assertNotEquals(ALL_MODES, lookup.lookupModes());
    }

    public static void verifyPublicOnlyMode(final Lookup lookup) {
        // lookup has PUBLIC mode
        assertEquals(PUBLIC, lookup.lookupModes() & PUBLIC);
        assertTrue(isPublic(lookup.lookupModes()));
        // lookup has PACKAGE mode
        assertNotEquals(PACKAGE, lookup.lookupModes() & PACKAGE);
        assertFalse(isStatic(lookup.lookupModes()));
        // lookup has _not_ PROTECTED mode
        assertNotEquals(PROTECTED, lookup.lookupModes() & PROTECTED);
        assertFalse(isProtected(lookup.lookupModes()));
        // lookup has _not_ PRIVATE mode
        assertNotEquals(PRIVATE, lookup.lookupModes() & PRIVATE);
        assertFalse(isPrivate(lookup.lookupModes()));
        // lookup has _not_ ALL_MODES mode
        assertNotEquals(ALL_MODES, lookup.lookupModes());
    }

    @Test
    public void verifyLookupInOtherClassHasNotAllModesAssumption()
    throws Exception {
        Lookup lookup = lookup();
        assertEquals(LookupTests.class, lookup.lookupClass());
        lookup = lookup.in(Foo.class);
        assertEquals(Foo.class, lookup.lookupClass());

        verifyPublicAndPackageModes(lookup);
    }

    // @Test
    // public void verifyLookupInSuperClassHasNotAllModesAssumption()
    // throws Exception {
    // final Class<Bar> baseClass = Bar.class;
    // final Class<Foo> superClass = Foo.class;
    //
    // assertTrue(isSamePackage(baseClass, superClass));
    // assertFalse(isSamePackageMember(baseClass, superClass));
    // Lookup lookup = Bar.getLookupInSuperClass();
    // assertEquals(baseClass, lookup.lookupClass());
    // lookup = lookup.in(baseClass.getSuperclass());
    // assertEquals(superClass, lookup.lookupClass());
    //
    // verifyPublicAndPackageModes(lookup);
    // }

    // /**
    // * TODO: What is the difference between {@code isSamePackage(...)} and {@code isSamePackageMember(...)}?
    // */
    // @Test
    // public void verifyLookupInSuperClassHasNotAllModesAssumption2()
    // throws Exception {
    // final Class<?> baseClass = LookupTests.class;
    // final Class<?> superClass = EmptyClass.class;
    //
    // assertTrue(isSamePackage(baseClass, superClass));
    // assertFalse(isSamePackageMember(baseClass, superClass));
    // Lookup lookup = lookup();
    // assertEquals(baseClass, lookup.lookupClass());
    // lookup = lookup.in(baseClass.getSuperclass());
    // assertEquals(superClass, lookup.lookupClass());
    //
    // verifyPublicAndPackageModes(lookup);
    // }

    @Test
    public void verifyLookupInJavaLangInvokePackageFails()
    throws Exception {
        this.thrown.expect(IllegalArgumentException.class);
        this.thrown.expectMessage("illegal lookupClass: class java.lang.invoke.MethodType");

        final Lookup lookup = lookup();
        assertEquals(LookupTests.class, lookup.lookupClass());
        lookup.in(MethodType.class);
    }

    @Test
    public void verifyLookupInJavaLangObjectHasNotAllModesAssumption()
    throws Exception {
        Lookup lookup = lookup();
        assertEquals(LookupTests.class, lookup.lookupClass());
        lookup = lookup.in(Object.class);
        assertEquals(Object.class, lookup.lookupClass());
        verifyPublicOnlyMode(lookup);
    }

    @Test
    public void verifyLookupNewInstanceHasAllModesAssumption()
    throws Exception {
        final Constructor<Lookup> constructor = Lookup.class.getDeclaredConstructor(Class.class);
        constructor.setAccessible(true);
        final Lookup lookup = constructor.newInstance(Foo.class);
        assertEquals(ALL_MODES, lookup.lookupModes());
    }

    @Test
    public void verifyLookupNewInstanceFailsForJavaLangInvokePackage()
    throws Exception {
        this.thrown.expect(InvocationTargetException.class);
        this.thrown.expectCause(isA(IllegalArgumentException.class));
        this.thrown.expectCause(hasMessage(equalTo("illegal lookupClass: class java.lang.invoke.MethodType")));

        final Constructor<Lookup> constructor = Lookup.class.getDeclaredConstructor(Class.class);
        constructor.setAccessible(true);
        constructor.newInstance(MethodType.class);
    }

    @Test
    public void verifyLookupNewInstanceFailsForJavaLangObject()
    throws Exception {
        this.thrown.expect(InvocationTargetException.class);
        this.thrown.expectCause(isA(IllegalArgumentException.class));
        this.thrown.expectCause(hasMessage(equalTo("illegal lookupClass: class java.lang.Object")));

        final Constructor<Lookup> constructor = Lookup.class.getDeclaredConstructor(Class.class);
        constructor.setAccessible(true);
        constructor.newInstance(Object.class);
    }

    @Test
    public void verifyLookupNewInstanceFailsForJavaLangIterable()
    throws Exception {
        this.thrown.expect(InvocationTargetException.class);
        this.thrown.expectCause(isA(IllegalArgumentException.class));
        this.thrown.expectCause(hasMessage(equalTo("illegal lookupClass: interface java.lang.Iterable")));

        final Constructor<Lookup> constructor = Lookup.class.getDeclaredConstructor(Class.class);
        constructor.setAccessible(true);
        constructor.newInstance(Iterable.class);
    }

    @Test
    public void testReflectiveModification()
    throws Exception {
        final Lookup lookup = lookup();
        assertEquals(ALL_MODES, lookup.lookupModes());
        assertEquals(LookupTests.class, lookup.lookupClass());

        final Field classField = Lookup.class.getDeclaredField("lookupClass");
        classField.setAccessible(true);
        classField.set(lookup, Object.class);
        final Field modesField = Lookup.class.getDeclaredField("allowedModes");
        modesField.setAccessible(true);
        modesField.setInt(lookup, PRIVATE);
        assertEquals(Object.class, lookup.lookupClass());
        assertNotEquals(ALL_MODES, lookup.lookupModes());
    }

}
