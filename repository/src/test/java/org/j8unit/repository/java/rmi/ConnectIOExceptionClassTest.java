package org.j8unit.repository.java.rmi;

import java.rmi.ConnectIOException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectIOExceptionClassTest
implements org.j8unit.repository.java.rmi.ConnectIOExceptionClassTests<ConnectIOException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.ConnectIOException]

    @Override
    public Class<ConnectIOException> createNewSUT() {
        return ConnectIOException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ConnectIOException#ConnectIOException(String)
     * public java.rmi.ConnectIOException(java.lang.String)}.
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
    public void create_ConnectIOException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConnectIOException sut = null; // = new ConnectIOException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ConnectIOException#ConnectIOException(String, Exception) public
     * java.rmi.ConnectIOException(java.lang.String,java.lang.Exception)}.
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
    public void create_ConnectIOException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConnectIOException sut = null; // = new ConnectIOException(String, Exception);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.ConnectIOException]

}
