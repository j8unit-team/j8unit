package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.TextInputCallback;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextInputCallback} (by simply reusing the
 * J8Unit test interface {@link TextInputCallbackClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextInputCallbackClassTest
implements TextInputCallbackClassTests<TextInputCallback> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.TextInputCallback]

    @Override
    public Class<TextInputCallback> createNewSUT() {
        return TextInputCallback.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.callback.TextInputCallback#TextInputCallback(String, String) public
     * javax.security.auth.callback.TextInputCallback(java.lang.String,java.lang.String)}.
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
    public void create_TextInputCallback_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TextInputCallback sut = null; // = new TextInputCallback(String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.callback.TextInputCallback#TextInputCallback(String) public
     * javax.security.auth.callback.TextInputCallback(java.lang.String)}.
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
    public void create_TextInputCallback_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TextInputCallback sut = null; // = new TextInputCallback(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.callback.TextInputCallback]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.TextInputCallback]

}
