package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.RMIClassLoaderSpi class java.rmi.server.RMIClassLoaderSpi}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link RMIClassLoaderSpiClassTests}.
 * </p>
 *
 * @see java.rmi.server.RMIClassLoaderSpi class java.rmi.server.RMIClassLoaderSpi (the hereby targeted class-under-test
 *      class)
 * @see RMIClassLoaderSpiClassTests RMIClassLoaderSpiClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIClassLoaderSpiTests<SUT extends java.rmi.server.RMIClassLoaderSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#getClassAnnotation(Class) public abstract
     * java.lang.String java.rmi.server.RMIClassLoaderSpi.getClassAnnotation(java.lang.Class<?>)}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#getClassAnnotation(Class) public abstract
     * java.lang.String java.rmi.server.RMIClassLoaderSpi.getClassAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RMIClassLoaderSpi#getClassAnnotation(Class) public abstract java.lang.String
     *      java.rmi.server.RMIClassLoaderSpi.getClassAnnotation(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassAnnotation_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#loadProxyClass(String, String[], ClassLoader) public
     * abstract java.lang.Class
     * <?> java.rmi.server.RMIClassLoaderSpi.loadProxyClass(java.lang.String,java.lang.String[],java.lang.ClassLoader)
     * throws java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#loadProxyClass(String, String[], ClassLoader) public
     * abstract java.lang.Class
     * java.rmi.server.RMIClassLoaderSpi.loadProxyClass(java.lang.String,java.lang.String[],java.lang.ClassLoader)
     * throws java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RMIClassLoaderSpi#loadProxyClass(String, String[], ClassLoader) public abstract
     *      java.lang.Class
     *      java.rmi.server.RMIClassLoaderSpi.loadProxyClass(java.lang.String,java.lang.String[],java.lang.ClassLoader)
     *      throws java.net.MalformedURLException,java.lang.ClassNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadProxyClass_String_StringArray_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#getClassLoader(String) public abstract
     * java.lang.ClassLoader java.rmi.server.RMIClassLoaderSpi.getClassLoader(java.lang.String) throws
     * java.net.MalformedURLException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#getClassLoader(String) public abstract
     * java.lang.ClassLoader java.rmi.server.RMIClassLoaderSpi.getClassLoader(java.lang.String) throws
     * java.net.MalformedURLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RMIClassLoaderSpi#getClassLoader(String) public abstract java.lang.ClassLoader
     *      java.rmi.server.RMIClassLoaderSpi.getClassLoader(java.lang.String) throws java.net.MalformedURLException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassLoader_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#loadClass(String, String, ClassLoader) public abstract
     * java.lang.Class
     * <?> java.rmi.server.RMIClassLoaderSpi.loadClass(java.lang.String,java.lang.String,java.lang.ClassLoader) throws
     * java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#loadClass(String, String, ClassLoader) public abstract
     * java.lang.Class
     * java.rmi.server.RMIClassLoaderSpi.loadClass(java.lang.String,java.lang.String,java.lang.ClassLoader) throws
     * java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RMIClassLoaderSpi#loadClass(String, String, ClassLoader) public abstract java.lang.Class
     *      java.rmi.server.RMIClassLoaderSpi.loadClass(java.lang.String,java.lang.String,java.lang.ClassLoader) throws
     *      java.net.MalformedURLException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadClass_String_String_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
