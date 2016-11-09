package org.j8unit.repository.javax.swing.text;

import javax.swing.text.ChangedCharSetException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ChangedCharSetException} (by simply
 * reusing the J8Unit test interface {@link ChangedCharSetExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ChangedCharSetExceptionClassTest
implements ChangedCharSetExceptionClassTests<ChangedCharSetException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.ChangedCharSetException]

    @Override
    public Class<ChangedCharSetException> createNewSUT() {
        return ChangedCharSetException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.ChangedCharSetException#ChangedCharSetException(String, boolean) public
     * javax.swing.text.ChangedCharSetException(java.lang.String,boolean)}.
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
    public void create_ChangedCharSetException_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ChangedCharSetException sut = null; // = new ChangedCharSetException(String, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.ChangedCharSetException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.ChangedCharSetException]

}
