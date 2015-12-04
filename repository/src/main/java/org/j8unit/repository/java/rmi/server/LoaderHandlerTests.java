package org.j8unit.repository.java.rmi.server;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.server.LoaderHandler interface java.rmi.server.LoaderHandler}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.server.LoaderHandlerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LoaderHandlerTests<SUT extends java.rmi.server.LoaderHandler>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.LoaderHandler#getSecurityContext(java.lang.ClassLoader) public abstract
     * java.lang.Object java.rmi.server.LoaderHandler.getSecurityContext(java.lang.ClassLoader)}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link java.rmi.server.LoaderHandler#loadClass(java.lang.String) public abstract java.lang.Class
     * java.rmi.server.LoaderHandler.loadClass(java.lang.String) throws
     * java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     * </p>
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
     * Test method for {@link java.rmi.server.LoaderHandler#loadClass(java.net.URL,java.lang.String) public abstract
     * java.lang.Class java.rmi.server.LoaderHandler.loadClass(java.net.URL,java.lang.String) throws
     * java.net.MalformedURLException,java.lang.ClassNotFoundException}.
     * </p>
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

}
