package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.FailedLoginException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FailedLoginExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.FailedLoginExceptionClassTests<FailedLoginException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.login.FailedLoginException]

    @Override
    public Class<FailedLoginException> createNewSUT() {
        return FailedLoginException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link FailedLoginException#FailedLoginException()
     * public javax.security.auth.login.FailedLoginException()}.
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
    public void create_FailedLoginException()
    throws Exception {
        // create new instance
        final FailedLoginException sut = new FailedLoginException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link FailedLoginException#FailedLoginException(String) public
     * javax.security.auth.login.FailedLoginException(java.lang.String)}.
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
    public void create_FailedLoginException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FailedLoginException sut = null; // = new FailedLoginException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.login.FailedLoginException]

}
