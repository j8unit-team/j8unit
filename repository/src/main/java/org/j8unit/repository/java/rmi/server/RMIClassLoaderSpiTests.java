package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.server.RMIClassLoaderSpi class java.rmi.server.RMIClassLoaderSpi}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.server.RMIClassLoaderSpiClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RMIClassLoaderSpiTests<SUT extends java.rmi.server.RMIClassLoaderSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#getClassAnnotation(java.lang.Class) public abstract
     * java.lang.String java.rmi.server.RMIClassLoaderSpi.getClassAnnotation(java.lang.Class)}.
     * </p>
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
     * Test method for
     * {@link java.rmi.server.RMIClassLoaderSpi#loadProxyClass(java.lang.String,java.lang.String[],java.lang.ClassLoader)
     * public abstract java.lang.Class
     * java.rmi.server.RMIClassLoaderSpi.loadProxyClass(java.lang.String,java.lang.String[],java.lang.ClassLoader)
     * throws java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     * </p>
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
     * Test method for {@link java.rmi.server.RMIClassLoaderSpi#getClassLoader(java.lang.String) public abstract
     * java.lang.ClassLoader java.rmi.server.RMIClassLoaderSpi.getClassLoader(java.lang.String) throws
     * java.net.MalformedURLException}.
     * </p>
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
     * Test method for
     * {@link java.rmi.server.RMIClassLoaderSpi#loadClass(java.lang.String,java.lang.String,java.lang.ClassLoader)
     * public abstract java.lang.Class
     * java.rmi.server.RMIClassLoaderSpi.loadClass(java.lang.String,java.lang.String,java.lang.ClassLoader) throws
     * java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     * </p>
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
