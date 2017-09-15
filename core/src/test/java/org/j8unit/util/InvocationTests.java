package org.j8unit.util;

import static java.lang.Boolean.TRUE;
import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.reflect.Proxy.newProxyInstance;
import static java.util.concurrent.CompletableFuture.completedFuture;
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
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
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

    /**
     * This tests verifies some expected behaviour of Java: If an {@link InvocationHandler} mismatches the return
     * value's type, a {@link ClassCastException} will be thrown -- even if the return value is not assigned to any
     * variable.
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

    /**
     * This tests verifies that the behaviour of {@link Reflection#constantResult(Object)} is similar to
     * {@linkplain #wrong_return_type_causes_implicit_ClassCastException_even_without_return_value_assignment() the
     * behaviour of Java}.
     */
    @Test
    public void wrong_return_type_via_constantResult_causes_explicit_ClassCastException()
    throws Exception {
        this.thrown.expect(ClassCastException.class);
        this.thrown.expectMessage("Supplied object of type 'class java.lang.Boolean' is not an instance of invoked method's return type 'class java.lang.String'!");

        final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, constantResult(TRUE));
        // Do not assign return value to some variable! The ClassCastException will occur anyway.
        proxy.returnsSomeString();
    }

    /**
     * This tests verifies some expected behaviour of Java: If an {@link InvocationHandler} is used for void method
     * invocation, the return instance/type is completely irrelevant.
     */
    @Test
    public void void_return_type_ignores_handler_result()
    throws Exception {
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, ($1, $2, $3) -> TRUE);
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, ($1, $2, $3) -> null);
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, ($1, $2, $3) -> "");
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, ($1, $2, $3) -> new Object());
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, Arrays::asList);
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class },
                                                               ($1, $2, $3) -> CompletableFuture.allOf(completedFuture("")).get());
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class },
                                                               ($1, $2, $3) -> completedFuture("").get());
            proxy.voidNoop();
        }
    }

    /**
     * This tests verifies that the behaviour of {@link Reflection#constantResult(Object)} is similar to
     * {@linkplain #void_return_type_ignores_handler_result() the behaviour of Java}.
     */

    @Test
    public void void_return_type_via_constantResult_causes_explicit_ClassCastException()
    throws Exception {
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, constantResult(TRUE));
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, constantResult(null));
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, constantResult(""));
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class }, constantResult(new Object()));
            proxy.voidNoop();
        }
        // {
        // final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class },
        // Arrays::asList));
        // proxy.voidNoop();
        // }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class },
                                                               constantResult(CompletableFuture.allOf(completedFuture("")).get()));
            proxy.voidNoop();
        }
        {
            final Whatever proxy = (Whatever) newProxyInstance(getSystemClassLoader(), new Class<?>[] { Whatever.class },
                                                               constantResult(completedFuture("").get()));
            proxy.voidNoop();
        }
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
