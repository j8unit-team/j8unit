package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProxyClassTest
implements org.j8unit.repository.java.lang.reflect.ProxyClassTests<Proxy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Proxy]

    @Override
    public Class<Proxy> createNewSUT() {
        return Proxy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Proxy#newProxyInstance(ClassLoader, Class[], InvocationHandler) public static java.lang.Object
     * java.lang.reflect.Proxy.newProxyInstance(java.lang.ClassLoader,java.lang.Class
     * <?>[],java.lang.reflect.InvocationHandler) throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newProxyInstance_ClassLoader_ClassArray_InvocationHandler()
    throws Exception {
        // write some test for {@link Proxy#newProxyInstance(ClassLoader, Class[], InvocationHandler)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Proxy#getProxyClass(ClassLoader, Class...) public
     * static java.lang.Class<?> java.lang.reflect.Proxy.getProxyClass(java.lang.ClassLoader,java.lang.Class<?>...)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getProxyClass_ClassLoader_ClassArray()
    throws Exception {
        // write some test for {@link Proxy#getProxyClass(ClassLoader, Class...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Proxy#isProxyClass(Class) public static boolean
     * java.lang.reflect.Proxy.isProxyClass(java.lang.Class<?>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isProxyClass_Class()
    throws Exception {
        // write some test for {@link Proxy#isProxyClass(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Proxy#getInvocationHandler(Object) public static
     * java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.getInvocationHandler(java.lang.Object) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getInvocationHandler_Object()
    throws Exception {
        // write some test for {@link Proxy#getInvocationHandler(Object)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Proxy]

}
