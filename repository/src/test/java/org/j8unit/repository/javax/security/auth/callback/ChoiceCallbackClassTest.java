package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.ChoiceCallback;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ChoiceCallback} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.callback.ChoiceCallbackClassTests}).
 */
@RunWith(J8Unit4.class)
public class ChoiceCallbackClassTest
implements ChoiceCallbackClassTests<ChoiceCallback> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.ChoiceCallback]

    @Override
    public Class<ChoiceCallback> createNewSUT() {
        return ChoiceCallback.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.callback.ChoiceCallback#ChoiceCallback(String, String[], int, boolean) public
     * javax.security.auth.callback.ChoiceCallback(java.lang.String,java.lang.String[],int,boolean)}.
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
    public void create_ChoiceCallback_String_StringArray_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ChoiceCallback sut = null; // = new ChoiceCallback(String, String[], int, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.callback.ChoiceCallback]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.ChoiceCallback]

}
