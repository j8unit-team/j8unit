package org.j8unit.repository.java.rmi;

import java.rmi.AccessException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessExceptionClassTest
implements org.j8unit.repository.java.rmi.AccessExceptionClassTests<AccessException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.AccessException]

    @Override
    public Class<AccessException> createNewSUT() {
        return AccessException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.AccessException#AccessException(String) public java.rmi.AccessException(java.lang.String)}.
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
    public void create_AccessException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessException sut = null; // = new AccessException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.AccessException#AccessException(String, Exception) public
     * java.rmi.AccessException(java.lang.String,java.lang.Exception)}.
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
    public void create_AccessException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessException sut = null; // = new AccessException(String, Exception);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.AccessException]

}
