package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.NameCallback;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameCallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.NameCallbackClassTests<NameCallback> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.NameCallback]

    @Override
    public Class<NameCallback> createNewSUT() {
        return NameCallback.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.callback.NameCallback#NameCallback(String) public
     * javax.security.auth.callback.NameCallback(java.lang.String)}.
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
    public void create_NameCallback_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameCallback sut = null; // = new NameCallback(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.callback.NameCallback#NameCallback(String, String) public
     * javax.security.auth.callback.NameCallback(java.lang.String,java.lang.String)}.
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
    public void create_NameCallback_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameCallback sut = null; // = new NameCallback(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.callback.NameCallback]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.NameCallback]

}
