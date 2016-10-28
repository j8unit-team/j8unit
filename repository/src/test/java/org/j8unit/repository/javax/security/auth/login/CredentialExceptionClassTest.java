package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.CredentialException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CredentialExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.CredentialExceptionClassTests<CredentialException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.login.CredentialException]

    @Override
    public Class<CredentialException> createNewSUT() {
        return CredentialException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link CredentialException#CredentialException()
     * public javax.security.auth.login.CredentialException()}.
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
    public void create_CredentialException()
    throws Exception {
        // create new instance
        final CredentialException sut = new CredentialException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link CredentialException#CredentialException(String)
     * public javax.security.auth.login.CredentialException(java.lang.String)}.
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
    public void create_CredentialException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CredentialException sut = null; // = new CredentialException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.login.CredentialException]

}
