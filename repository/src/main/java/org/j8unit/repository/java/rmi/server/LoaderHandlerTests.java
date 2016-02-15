package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.LoaderHandler interface java.rmi.server.LoaderHandler}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link LoaderHandlerClassTests}.
 * </p>
 *
 * @see java.rmi.server.LoaderHandler interface java.rmi.server.LoaderHandler (the hereby targeted class-under-test
 *      class)
 * @see LoaderHandlerClassTests LoaderHandlerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LoaderHandlerTests<SUT extends java.rmi.server.LoaderHandler>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.LoaderHandler#loadClass(String) public abstract java.lang.Class
     * <?> java.rmi.server.LoaderHandler.loadClass(java.lang.String) throws
     * java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.LoaderHandler#loadClass(String) public abstract java.lang.Class
     * java.rmi.server.LoaderHandler.loadClass(java.lang.String) throws
     * java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.LoaderHandler#loadClass(String) public abstract java.lang.Class
     *      java.rmi.server.LoaderHandler.loadClass(java.lang.String) throws
     *      java.net.MalformedURLException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadClass_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.LoaderHandler#loadClass(java.net.URL, String) public abstract
     * java.lang.Class<?> java.rmi.server.LoaderHandler.loadClass(java.net.URL,java.lang.String) throws
     * java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.LoaderHandler#loadClass(java.net.URL, String) public abstract
     * java.lang.Class java.rmi.server.LoaderHandler.loadClass(java.net.URL,java.lang.String) throws
     * java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.LoaderHandler#loadClass(java.net.URL, String) public abstract java.lang.Class
     *      java.rmi.server.LoaderHandler.loadClass(java.net.URL,java.lang.String) throws
     *      java.net.MalformedURLException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadClass_URL_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.LoaderHandler#getSecurityContext(ClassLoader) public abstract
     * java.lang.Object java.rmi.server.LoaderHandler.getSecurityContext(java.lang.ClassLoader)}.
     *
     * <p>
     * Test method for {@link java.rmi.server.LoaderHandler#getSecurityContext(ClassLoader) public abstract
     * java.lang.Object java.rmi.server.LoaderHandler.getSecurityContext(java.lang.ClassLoader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.LoaderHandler#getSecurityContext(ClassLoader) public abstract java.lang.Object
     *      java.rmi.server.LoaderHandler.getSecurityContext(java.lang.ClassLoader) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSecurityContext_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
