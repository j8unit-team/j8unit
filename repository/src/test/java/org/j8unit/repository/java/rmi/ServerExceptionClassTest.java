package org.j8unit.repository.java.rmi;

import java.rmi.ServerException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerExceptionClassTest
implements org.j8unit.repository.java.rmi.ServerExceptionClassTests<ServerException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.ServerException]

    @Override
    public Class<ServerException> createNewSUT() {
        return ServerException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.ServerException#ServerException(String) public java.rmi.ServerException(java.lang.String)}.
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
    public void create_ServerException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServerException sut = null; // = new ServerException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.ServerException#ServerException(String, Exception) public
     * java.rmi.ServerException(java.lang.String,java.lang.Exception)}.
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
    public void create_ServerException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServerException sut = null; // = new ServerException(String, Exception);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.ServerException]

}
