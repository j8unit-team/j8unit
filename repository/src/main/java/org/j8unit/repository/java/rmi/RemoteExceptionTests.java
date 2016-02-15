package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.RemoteException class java.rmi.RemoteException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link RemoteExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.RemoteException class java.rmi.RemoteException (the hereby targeted class-under-test class)
 * @see RemoteExceptionClassTests RemoteExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RemoteExceptionTests<SUT extends java.rmi.RemoteException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.RemoteException#getCause() public java.lang.Throwable
     * java.rmi.RemoteException.getCause()}.
     *
     * <p>
     * Test method for {@link java.rmi.RemoteException#getCause() public java.lang.Throwable
     * java.rmi.RemoteException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.RemoteException#getCause() public java.lang.Throwable java.rmi.RemoteException.getCause() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCause()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.RemoteException#getMessage() public java.lang.String
     * java.rmi.RemoteException.getMessage()}.
     *
     * <p>
     * Test method for {@link java.rmi.RemoteException#getMessage() public java.lang.String
     * java.rmi.RemoteException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.RemoteException#getMessage() public java.lang.String java.rmi.RemoteException.getMessage() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
