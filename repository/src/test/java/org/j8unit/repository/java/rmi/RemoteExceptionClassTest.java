package org.j8unit.repository.java.rmi;

import java.rmi.RemoteException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RemoteException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.RemoteExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class RemoteExceptionClassTest
implements RemoteExceptionClassTests<RemoteException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.RemoteException]

    @Override
    public Class<RemoteException> createNewSUT() {
        return RemoteException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.RemoteException#RemoteException(String, Throwable) public
     * java.rmi.RemoteException(java.lang.String,java.lang.Throwable)}.
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
    public void create_RemoteException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RemoteException sut = null; // = new RemoteException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.RemoteException#RemoteException(String) public java.rmi.RemoteException(java.lang.String)}.
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
    public void create_RemoteException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RemoteException sut = null; // = new RemoteException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.rmi.RemoteException#RemoteException()
     * public java.rmi.RemoteException()}.
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
    public void create_RemoteException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RemoteException sut = new RemoteException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.RemoteException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.RemoteException]

}
