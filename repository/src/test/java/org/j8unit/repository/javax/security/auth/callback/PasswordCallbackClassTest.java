package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.PasswordCallback;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PasswordCallback} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.callback.PasswordCallbackClassTests}).
 */

@RunWith(J8Unit4.class)
public class PasswordCallbackClassTest
implements PasswordCallbackClassTests<PasswordCallback> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.PasswordCallback]

    @Override
    public Class<PasswordCallback> createNewSUT() {
        return PasswordCallback.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.callback.PasswordCallback#PasswordCallback(String, boolean) public
     * javax.security.auth.callback.PasswordCallback(java.lang.String,boolean)}.
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
    public void create_PasswordCallback_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PasswordCallback sut = null; // = new PasswordCallback(String, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.callback.PasswordCallback]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.PasswordCallback]

}
