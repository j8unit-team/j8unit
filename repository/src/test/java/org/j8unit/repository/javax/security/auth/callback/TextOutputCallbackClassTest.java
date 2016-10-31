package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.TextOutputCallback;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextOutputCallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.TextOutputCallbackClassTests<TextOutputCallback> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.TextOutputCallback]

    @Override
    public Class<TextOutputCallback> createNewSUT() {
        return TextOutputCallback.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.callback.TextOutputCallback#TextOutputCallback(int, String) public
     * javax.security.auth.callback.TextOutputCallback(int,java.lang.String)}.
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
    public void create_TextOutputCallback_int_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TextOutputCallback sut = null; // = new TextOutputCallback(int, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.callback.TextOutputCallback]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.TextOutputCallback]

}
