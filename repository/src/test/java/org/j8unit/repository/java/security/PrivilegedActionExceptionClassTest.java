package org.j8unit.repository.java.security;

import java.security.PrivilegedActionException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivilegedActionExceptionClassTest
implements org.j8unit.repository.java.security.PrivilegedActionExceptionClassTests<PrivilegedActionException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.PrivilegedActionException]

    @Override
    public Class<PrivilegedActionException> createNewSUT() {
        return PrivilegedActionException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link PrivilegedActionException#PrivilegedActionException(Exception) public
     * java.security.PrivilegedActionException(java.lang.Exception)}.
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
    public void create_PrivilegedActionException_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrivilegedActionException sut = null; // = new PrivilegedActionException(Exception);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.PrivilegedActionException]

}
