package org.j8unit.util;

import static java.lang.Boolean.TRUE;
import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.reflect.Proxy.newProxyInstance;
import static org.hamcrest.Matchers.startsWith;
import static org.j8unit.util.Reflection.ENFORCE_INVOCATION;
import static org.j8unit.util.Reflection.SKIP_ABSTRACT;
import static org.j8unit.util.Reflection.constantResult;
import static org.j8unit.util.Reflection.dispatch;
import static org.j8unit.util.Reflection.fail;
import static org.j8unit.util.Reflection.trySuperClassesFirst;
import static org.j8unit.util.Reflection.trySuperInterfacesFirst;
import static org.j8unit.util.Reflection.trySuperTypesFirst;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.rules.ExpectedException.none;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.j8unit.util.helper.Whatever;
import org.j8unit.util.helper.WhateverSubAB;

public class InvocationTests {

    @Rule
    public ExpectedException thrown = none();

    /*
     *
     */

    @Test
    public void wrong_return_type_causes_implicit_ClassCastException_even_without_return_value_assignment()
    throws Exception {
        this.thrown.expect(ClassCastException.class);
        this.thrown.expectMessage("java.lang.Boolean cannot be cast to java.lang.String");

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, ($1, $2, $3) -> TRUE);
        // Do not assign return value to some variable! The ClassCastException will occur anyway.
        proxy.returnsSomeString();
    }

    @Test
    public void wrong_return_type_via_constantResult_causes_explicit_ClassCastException()
    throws Exception {
        this.thrown.expect(ClassCastException.class);
        this.thrown.expectMessage("Supplied object of type 'class java.lang.Boolean' is not an instance of invoked method's return type 'class java.lang.String'!");

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, constantResult(TRUE));
        // Do not assign return value to some variable! The ClassCastException will occur anyway.
        proxy.returnsSomeString();
    }

    @Test
    public void void_return_type_ignores_handler_result()
    throws Exception {
        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, ($1, $2, $3) -> TRUE);
        proxy.noop();
    }

    @Test
    public void void_return_type_via_constantResult_causes_explicit_ClassCastException()
    throws Exception {
        this.thrown.expect(ClassCastException.class);
        this.thrown.expectMessage("This InvocationHandler is not suitable for invoked 'void' method 'public default void org.j8unit.util.helper.Whatever.noop()'!");

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, constantResult(TRUE));
        proxy.noop();
    }

    /*
     * Testing {@link Reflection#constantResult(java.util.function.Supplier)}:
     */

    @Test
    public void test_constantResult_with_valid_string()
    throws Exception {
        final InvocationHandler handler = constantResult("Hello World!");
        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        final String actual = proxy.returnsSomeString();
        assertEquals("Hello World!", actual);
        final String actualToString = proxy.toString();
        assertEquals("Hello World!", actualToString);
    }

    @Test
    public void test_constantResult_with_null()
    throws Exception {
        final InvocationHandler handler = constantResult(null);
        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
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
        final InvocationHandler fallback = constantResult("Fallback Value");
        final Method methodA = Whatever.class.getMethod("returnsSomeString");
        final InvocationHandler dispatchA = dispatch(methodA, constantResult("Result of #returnsSomeString()"), fallback);
        final Method methodB = Whatever.class.getMethod("returnsSomeOtherString");
        final InvocationHandler dispatchB = dispatch(methodB, constantResult("Result of #returnsSomeOtherString()"), dispatchA);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, dispatchB);
        final String actualA = proxy.returnsSomeString();
        assertEquals("Result of #returnsSomeString()", actualA);
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals("Result of #returnsSomeOtherString()", actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals("Fallback Value", actualC);
        final String actualToString = proxy.toString();
        assertEquals("Fallback Value", actualToString);
    }

    /*
     * Testing {@link Reflection#trySuperInterfacesFirst(InvocationHandler, boolean)}:
     */

    @Test
    public void test_trySuperInterfacesFirst_with_enforced_invocation()
    throws Exception {
        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperInterfacesFirst(fallback, ENFORCE_INVOCATION);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        final String actualA = proxy.returnsSomeString();
        assertThat(actualA, startsWith("com.sun.proxy.$Proxy"));
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals(actualA, actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals(actualA, actualC);
        final String actualToString = proxy.toString();
        assertEquals("Fallback Value", actualToString);
    }

    @Test
    public void test_trySuperInterfacesFirst_with_enforced_invocation2()
    throws Exception {
        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperInterfacesFirst(fallback, ENFORCE_INVOCATION);

        final WhateverSubAB proxy = (WhateverSubAB) newProxyInstance(getSystemClassLoader(), new Class<?>[] { WhateverSubAB.class }, handler);
        final String actualA = proxy.returnsSomeString();
        assertThat(actualA, startsWith("com.sun.proxy.$Proxy"));
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals(actualA, actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals(actualA, actualC);
        final String actualToString = proxy.toString();
        assertEquals("Fallback Value", actualToString);
    }

    @Test
    public void test_trySuperInterfacesFirst_and_fail_abstract_invocation()
    throws Exception {
        this.thrown.expect(AbstractMethodError.class);
        this.thrown.expectMessage("org.j8unit.util.helper.Whatever.abstractStringReturn()String/invokeInterface");

        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperInterfacesFirst(fallback, ENFORCE_INVOCATION);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        proxy.abstractStringReturn();
    }

    @Test
    public void test_trySuperInterfacesFirst_without_enforced_invocation()
    throws Exception {
        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperInterfacesFirst(fallback, SKIP_ABSTRACT);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        final String actualA = proxy.returnsSomeString();
        assertThat(actualA, startsWith("com.sun.proxy.$Proxy"));
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals(actualA, actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals(actualA, actualC);
        final String actualToString = proxy.toString();
        assertEquals("Fallback Value", actualToString);
    }

    @Test
    public void test_trySuperInterfacesFirst_and_skip_abstract_invocation()
    throws Exception {
        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperInterfacesFirst(fallback, SKIP_ABSTRACT);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        final String actual = proxy.abstractStringReturn();
        assertEquals("Fallback Value", actual);
    }

    /*
     * Testing {@link Reflection#trySuperClassesFirst(InvocationHandler, boolean):
     */

    @Test
    public void test_trySuperClassesFirst_with_enforced_invocation()
    throws Exception {
        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperClassesFirst(fallback, ENFORCE_INVOCATION);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        final String actualA = proxy.returnsSomeString();
        assertEquals("Fallback Value", actualA);
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals("Fallback Value", actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals("Fallback Value", actualC);
        final String actualToString = proxy.toString();
        assertThat(actualToString, startsWith("com.sun.proxy.$Proxy"));
    }

    @Test
    public void test_trySuperClassesFirst_without_enforced_invocation()
    throws Exception {
        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperClassesFirst(fallback, SKIP_ABSTRACT);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        final String actualA = proxy.returnsSomeString();
        assertEquals("Fallback Value", actualA);
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals("Fallback Value", actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals("Fallback Value", actualC);
        final String actualToString = proxy.toString();
        assertThat(actualToString, startsWith("com.sun.proxy.$Proxy"));
    }

    /*
     * Testing {@link Reflection#trySuperTypesFirst(InvocationHandler, boolean)}:
     */

    @Test
    public void test_trySuperTypesFirst_with_enforced_invocation()
    throws Exception {
        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperTypesFirst(fallback, ENFORCE_INVOCATION);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        final String actualA = proxy.returnsSomeString();
        assertThat(actualA, startsWith("com.sun.proxy.$Proxy"));
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals(actualA, actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals(actualA, actualC);
        final String actualToString = proxy.toString();
        assertThat(actualToString, startsWith("com.sun.proxy.$Proxy"));
    }

    @Test
    public void test_trySuperTypesFirst_and_fail_abstract_invocation()
    throws Exception {
        this.thrown.expect(AbstractMethodError.class);
        this.thrown.expectMessage("org.j8unit.util.helper.Whatever.abstractStringReturn()String/invokeInterface");

        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperTypesFirst(fallback, ENFORCE_INVOCATION);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        proxy.abstractStringReturn();
    }

    @Test
    public void test_trySuperTypesFirst_without_enforced_invocation()
    throws Exception {
        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperTypesFirst(fallback, SKIP_ABSTRACT);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        final String actualA = proxy.returnsSomeString();
        assertThat(actualA, startsWith("com.sun.proxy.$Proxy"));
        final String actualB = proxy.returnsSomeOtherString();
        assertEquals(actualA, actualB);
        final String actualC = proxy.returnsEvenAnotherString();
        assertEquals(actualA, actualC);
        final String actualToString = proxy.toString();
        assertThat(actualToString, startsWith("com.sun.proxy.$Proxy"));
    }

    @Test
    public void test_trySuperTypesFirst_and_skip_abstract_invocation()
    throws Exception {
        final InvocationHandler fallback = constantResult("Fallback Value");
        final InvocationHandler handler = trySuperTypesFirst(fallback, SKIP_ABSTRACT);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, handler);
        final String actual = proxy.abstractStringReturn();
        assertEquals("Fallback Value", actual);
    }

    /*
     * Testing {@link Reflection#fail(java.util.function.Function)}:
     */

    @Test
    public void test_fail_and_fail_abstract_invocation()
    throws Exception {
        this.thrown.expect(UnsupportedOperationException.class);

        final InvocationHandler fail = fail(UnsupportedOperationException::new);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, fail);
        proxy.abstractStringReturn();
    }

    @Test
    public void test_fail_and_fail_default_invocation()
    throws Exception {
        this.thrown.expect(UnsupportedOperationException.class);

        final InvocationHandler fail = fail(UnsupportedOperationException::new);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, fail);
        proxy.returnsSomeString();
    }

    @Test
    public void test_fail_and_fail_valid_invocation()
    throws Exception {
        this.thrown.expect(UnsupportedOperationException.class);

        final InvocationHandler fail = fail(UnsupportedOperationException::new);

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, fail);
        proxy.toString();
    }

}
