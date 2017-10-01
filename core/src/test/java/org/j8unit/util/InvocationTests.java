package org.j8unit.util;

import static java.lang.Boolean.TRUE;
import static java.util.concurrent.CompletableFuture.completedFuture;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.startsWith;
import static org.j8unit.util.Reflection.ENFORCE_ABSTRACT;
import static org.j8unit.util.Reflection.SKIP_ABSTRACT;
import static org.j8unit.util.Reflection.constantResult;
import static org.j8unit.util.Reflection.dispatch;
import static org.j8unit.util.Reflection.fail;
import static org.j8unit.util.Reflection.trySuperClassesFirst;
import static org.j8unit.util.Reflection.trySuperInterfacesFirst;
import static org.j8unit.util.Reflection.trySuperTypesFirst;
import static org.j8unit.util.helper.Whatever.makeProxy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.junit.rules.ExpectedException.none;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.j8unit.util.helper.Whatever;

public class InvocationTests {

    public static class InnerDummyClass {
    }

    @Rule
    public ExpectedException thrown = none();

    /*
     * Testing the equality/similarity between the out-of-the-box behaviour of Java's generic proxy classes and the
     * explicit behaviour of the {@link Reflection#constantResult(Object)} invocation handler:
     */

    /**
     * @see #wrong_return_type_causes_ClassCastException_within_constantResult_invocation_handler()
     * @see verify_exceptional_behaviour_of_constantResult_invocation_handler_is_similar_to_dynamic_proxy
     */
    @Test
    public void wrong_return_type_causes_ClassCastException_within_dynamic_proxy()
    throws Exception {
        this.thrown.expect(ClassCastException.class);
        this.thrown.expectMessage("java.lang.Boolean cannot be cast to java.lang.String");

        final InvocationHandler handler = ($1, $2, $3) -> TRUE;
        final Whatever proxy = makeProxy(handler);
        // Do not assign return value to some variable! The ClassCastException will occur anyway.
        proxy.returnsSomeString();
    }

    /**
     * @see #wrong_return_type_causes_ClassCastException_within_dynamic_proxy()
     * @see verify_exceptional_behaviour_of_constantResult_invocation_handler_is_similar_to_dynamic_proxy
     */
    @Test
    public void wrong_return_type_causes_ClassCastException_within_constantResult_invocation_handler()
    throws Exception {
        this.thrown.expect(ClassCastException.class);
        this.thrown.expectMessage("java.lang.Boolean cannot be cast to java.lang.String");
        this.thrown.expectCause(instanceOf(ClassCastException.class));
        this.thrown.expectCause(hasProperty("message",
                                            equalTo("Supplied object of type 'class java.lang.Boolean' is not an instance of invoked method's return type 'class java.lang.String'!")));

        final Whatever proxy = makeProxy(constantResult(TRUE));
        // Do not assign return value to some variable! The ClassCastException will occur anyway.
        proxy.returnsSomeString();
    }

    /**
     * @see #wrong_return_type_causes_ClassCastException_within_constantResult_invocation_handler()
     * @see #wrong_return_type_causes_ClassCastException_within_dynamic_proxy()
     */
    @Test
    public void verify_exceptional_behaviour_of_constantResult_invocation_handler_is_similar_to_dynamic_proxy()
    throws Exception {
        this.thrown = none();

        try {
            this.wrong_return_type_causes_ClassCastException_within_dynamic_proxy();
            fail("This position should not have been reached due to earlier exception!");
        } catch (final ClassCastException proxyException) {
            try {
                this.wrong_return_type_causes_ClassCastException_within_constantResult_invocation_handler();
                fail("This position should not have been reached due to earlier exception!");
            } catch (final ClassCastException constantException) {
                assertEquals(proxyException.getClass(), constantException.getClass());
                assertEquals(proxyException.getMessage(), constantException.getMessage());
            }
        }
    }

    /**
     * @see #wrong_return_type_for_void_method_is_ignored_within_constantResult_invocation_handler()
     */
    @Test
    public void wrong_return_type_for_void_method_is_ignored_within_dynamic_proxy()
    throws Exception {
        execute_some_handler_on_void_method(($1, $2, $3) -> TRUE); // Boolean
        execute_some_handler_on_void_method(($1, $2, $3) -> null); // null
        execute_some_handler_on_void_method(($1, $2, $3) -> ""); // String
        execute_some_handler_on_void_method(($1, $2, $3) -> new Object()); // Object
        execute_some_handler_on_void_method(Arrays::asList); // (dynamically filled) List
        execute_some_handler_on_void_method(($1, $2, $3) -> completedFuture("").get()); // String
        execute_some_handler_on_void_method(($1, $2, $3) -> CompletableFuture.allOf(completedFuture("")).get()); // Void
    }

    private static final void execute_some_handler_on_void_method(final InvocationHandler handler) {
        final Whatever proxy = makeProxy(handler);
        proxy.voidNoop();
    }

    /**
     * @see #wrong_return_type_for_void_method_is_ignored_within_dynamic_proxy()
     */
    @Test
    public void wrong_return_type_for_void_method_is_ignored_within_constantResult_invocation_handler()
    throws Exception {
        execute_some_handler_on_void_method(constantResult(TRUE)); // Boolean
        execute_some_handler_on_void_method(constantResult(null)); // null
        execute_some_handler_on_void_method(constantResult("")); // String
        execute_some_handler_on_void_method(constantResult(new Object())); // Object
        execute_some_handler_on_void_method(constantResult(completedFuture("").get())); // String
        execute_some_handler_on_void_method(constantResult(CompletableFuture.allOf(completedFuture("")).get())); // Void
    }

    /*
     * Testing {@link Reflection#constantResult(Object)}:
     */

    @Test
    public void test_constantResult_with_valid_string()
    throws Exception {
        final InvocationHandler handler = constantResult("Hello World!");
        final Whatever proxy = makeProxy(handler);
        final String actual = proxy.returnsSomeString();
        assertEquals("Hello World!", actual);
        final String actualToString = proxy.toString();
        assertEquals("Hello World!", actualToString);
    }

    @Test
    public void test_constantResult_with_null()
    throws Exception {
        final InvocationHandler handler = constantResult(null);
        final Whatever proxy = makeProxy(handler);
        final String actual = proxy.returnsSomeString();
        assertNull(actual);
        final String actualToString = proxy.toString();
        assertNull(actualToString);
    }

    /*
     * Testing {@link Reflection#dispatch(Method, InvocationHandler, InvocationHandler)}:
     */

    @Test
    public void test_dispatch_with_valid_fallback()
    throws Exception {
        final Method methodA = Whatever.class.getMethod("returnsSomeString");
        final InvocationHandler dispatchA = dispatch(methodA, constantResult("Result of #returnsSomeString()"), FALLBACK_HANDLER);
        final Method methodB = Whatever.class.getMethod("returnsSomeOtherString");
        final InvocationHandler dispatchB = dispatch(methodB, constantResult("Result of #returnsSomeOtherString()"), dispatchA);

        final Whatever proxy = makeProxy(dispatchB);

        final String actualA = proxy.returnsSomeString();
        assertEquals("Result of #returnsSomeString()", actualA);
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals("Result of #returnsSomeOtherString()", actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals(FALLBACK_VALUE, actualC);
        final String actualToString = proxy.toString();
        assertEquals(FALLBACK_VALUE, actualToString);
    }

    private static final String FALLBACK_VALUE = "Fallback Value";

    private static final InvocationHandler FALLBACK_HANDLER = constantResult(FALLBACK_VALUE);

    /*
     * Testing {@link Reflection#trySuperInterfacesFirst(InvocationHandler, boolean)}:
     */

    @Test
    public void test_trySuperInterfacesFirst_with_SKIP_ABSTRACT_onto_abstract_method()
    throws Exception {
        final InvocationHandler handler = trySuperInterfacesFirst(FALLBACK_HANDLER, SKIP_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertAbstractMethodOfWhateverInterfaceIsNotInvokedAndThusFallbackValueIsReturned(proxy);
    }

    @Test
    public void test_trySuperInterfacesFirst_with_SKIP_ABSTRACT_onto_default_methods()
    throws Exception {
        final InvocationHandler handler = trySuperInterfacesFirst(FALLBACK_HANDLER, SKIP_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertDefaultMethodsOfWhateverInterfaceAreInvoked(proxy);
    }

    @Test
    public void test_trySuperInterfacesFirst_with_SKIP_ABSTRACT_onto_implemented_method()
    throws Exception {
        final InvocationHandler handler = trySuperInterfacesFirst(FALLBACK_HANDLER, SKIP_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertImplementedMethodOfObjectClassIsNotInvokedAndThusFallbackValueIsReturned(proxy);
    }

    @Test
    public void test_trySuperInterfacesFirst_with_ENFORCE_ABSTRACT_onto_abstract_method()
    throws Exception {
        this.thrown.expect(AbstractMethodError.class);
        this.thrown.expectMessage("org.j8unit.util.helper.Whatever.abstractStringReturn()String/invokeInterface");

        final InvocationHandler handler = trySuperInterfacesFirst(FALLBACK_HANDLER, ENFORCE_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertAbstractMethodOfWhateverInterfaceIsInvokedAndThusThrowsAbstractMethodError(proxy);
    }

    @Test
    public void test_trySuperInterfacesFirst_with_ENFORCE_ABSTRACT_onto_default_methods()
    throws Exception {
        final InvocationHandler handler = trySuperInterfacesFirst(FALLBACK_HANDLER, ENFORCE_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertDefaultMethodsOfWhateverInterfaceAreInvoked(proxy);
    }

    @Test
    public void test_trySuperInterfacesFirst_with_ENFORCE_ABSTRACT_onto_implemented_method()
    throws Exception {
        final InvocationHandler handler = trySuperInterfacesFirst(FALLBACK_HANDLER, ENFORCE_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertImplementedMethodOfObjectClassIsNotInvokedAndThusFallbackValueIsReturned(proxy);
    }

    /*
     * Testing {@link Reflection#trySuperClassesFirst(InvocationHandler, boolean)}:
     */

    @Test
    public void test_trySuperClassesFirst_with_SKIP_ABSTRACT_onto_abstract_method()
    throws Exception {
        final InvocationHandler handler = trySuperClassesFirst(FALLBACK_HANDLER, SKIP_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertAbstractMethodOfWhateverInterfaceIsInvokedAndThusThrowsAbstractMethodError(proxy);
    }

    @Test
    public void test_trySuperClassesFirst_with_SKIP_ABSTRACT_onto_default_methods()
    throws Exception {
        final InvocationHandler handler = trySuperClassesFirst(FALLBACK_HANDLER, SKIP_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertDefaultMethodsOfWhateverInterfaceAreSkippedAndThusFallbackValueIsReturned(proxy);
    }

    @Test
    public void test_trySuperClassesFirst_with_SKIP_ABSTRACT_onto_implemented_method()
    throws Exception {
        final InvocationHandler handler = trySuperClassesFirst(FALLBACK_HANDLER, SKIP_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertImplementedMethodOfObjectClassIsInvoked(proxy);
    }

    @Test
    public void test_trySuperClassesFirst_with_ENFORCE_ABSTRACT_onto_abstract_method()
    throws Exception {
        final InvocationHandler handler = trySuperClassesFirst(FALLBACK_HANDLER, ENFORCE_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertDefaultMethodsOfWhateverInterfaceAreSkippedAndThusFallbackValueIsReturned(proxy);
    }

    @Test
    public void test_trySuperClassesFirst_with_ENFORCE_ABSTRACT_onto_default_methods()
    throws Exception {
        final InvocationHandler handler = trySuperClassesFirst(FALLBACK_HANDLER, ENFORCE_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertDefaultMethodsOfWhateverInterfaceAreSkippedAndThusFallbackValueIsReturned(proxy);
    }

    @Test
    public void test_trySuperClassesFirst_with_ENFORCE_ABSTRACT_onto_implemented_method()
    throws Exception {
        final InvocationHandler handler = trySuperClassesFirst(FALLBACK_HANDLER, ENFORCE_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertImplementedMethodOfObjectClassIsInvoked(proxy);
    }

    /*
     * Testing {@link Reflection#trySuperTypesFirst(InvocationHandler, boolean)}:
     */

    @Test
    public void test_trySuperTypesFirst_with_SKIP_ABSTRACT_onto_abstract_method()
    throws Exception {
        final InvocationHandler handler = trySuperTypesFirst(FALLBACK_HANDLER, SKIP_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertAbstractMethodOfWhateverInterfaceIsNotInvokedAndThusFallbackValueIsReturned(proxy);
    }

    @Test
    public void test_trySuperTypesFirst_with_SKIP_ABSTRACT_onto_default_methods()
    throws Exception {
        final InvocationHandler handler = trySuperTypesFirst(FALLBACK_HANDLER, SKIP_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertDefaultMethodsOfWhateverInterfaceAreInvoked(proxy);
    }

    @Test
    public void test_trySuperTypesFirst_with_SKIP_ABSTRACT_onto_implemented_method()
    throws Exception {
        final InvocationHandler handler = trySuperTypesFirst(FALLBACK_HANDLER, SKIP_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertImplementedMethodOfObjectClassIsInvoked(proxy);
    }

    @Test
    public void test_trySuperTypesFirst_with_ENFORCE_ABSTRACT_onto_abstract_method()
    throws Exception {
        this.thrown.expect(AbstractMethodError.class);
        this.thrown.expectMessage("org.j8unit.util.helper.Whatever.abstractStringReturn()String/invokeInterface");

        final InvocationHandler handler = trySuperTypesFirst(FALLBACK_HANDLER, ENFORCE_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertAbstractMethodOfWhateverInterfaceIsInvokedAndThusThrowsAbstractMethodError(proxy);
    }

    @Test
    public void test_trySuperTypesFirst_with_ENFORCE_ABSTRACT_onto_default_methods()
    throws Exception {
        final InvocationHandler handler = trySuperTypesFirst(FALLBACK_HANDLER, ENFORCE_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertDefaultMethodsOfWhateverInterfaceAreInvoked(proxy);
    }

    @Test
    public void test_trySuperTypesFirst_with_ENFORCE_ABSTRACT_onto_implemented_method()
    throws Exception {
        final InvocationHandler handler = trySuperTypesFirst(FALLBACK_HANDLER, ENFORCE_ABSTRACT);

        final Whatever proxy = makeProxy(handler);

        assertImplementedMethodOfObjectClassIsInvoked(proxy);
    }

    /*
     * Testing {@link Reflection#fail(java.util.function.Function)}:
     */

    @Test
    public void test_fail_invocation_onto_abstract_method()
    throws Exception {
        this.thrown.expect(UnsupportedOperationException.class);

        final InvocationHandler fail = fail(UnsupportedOperationException::new);

        final Whatever proxy = makeProxy(fail);
        proxy.abstractStringReturn();
    }

    @Test
    public void test_fail_invocation_onto_default_methods()
    throws Exception {
        this.thrown.expect(UnsupportedOperationException.class);

        final InvocationHandler fail = fail(UnsupportedOperationException::new);
        final Whatever proxy = makeProxy(fail);

        proxy.returnsSomeString();
    }

    @Test
    public void test_fail_invocation_onto_implemented_method()
    throws Exception {
        this.thrown.expect(UnsupportedOperationException.class);

        final InvocationHandler fail = fail(UnsupportedOperationException::new);

        final Whatever proxy = makeProxy(fail);
        proxy.toString();
    }

    /*
     * Helper methods:
     */

    /*
     * Helper assertion statements:
     */

    private static final void assertAbstractMethodOfWhateverInterfaceIsNotInvokedAndThusFallbackValueIsReturned(final Whatever proxy) {
        final String actual = proxy.abstractStringReturn();
        assertEquals(FALLBACK_VALUE, actual);
    }

    private static final void assertAbstractMethodOfWhateverInterfaceIsInvokedAndThusThrowsAbstractMethodError(final Whatever proxy) {
        proxy.abstractStringReturn();
    }

    private static final void assertDefaultMethodsOfWhateverInterfaceAreInvoked(final Whatever proxy) {
        final String actualA = proxy.returnsSomeString();
        assertThat(actualA, startsWith("com.sun.proxy.$Proxy"));
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals(actualA, actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals(actualA, actualC);
    }

    private static final void assertDefaultMethodsOfWhateverInterfaceAreSkippedAndThusFallbackValueIsReturned(final Whatever proxy) {
        final String actualA = proxy.returnsSomeString();
        assertEquals(FALLBACK_VALUE, actualA);
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals(actualA, actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals(actualA, actualC);
    }

    private static final void assertImplementedMethodOfObjectClassIsNotInvokedAndThusFallbackValueIsReturned(final Object proxy) {
        final String actual = proxy.toString();
        assertEquals(FALLBACK_VALUE, actual);
    }

    private static final void assertImplementedMethodOfObjectClassIsInvoked(final Object proxy) {
        final String actual = proxy.toString();
        assertThat(actual, startsWith("com.sun.proxy.$Proxy"));

    }

}
