package org.j8unit.repository.java.util;

import java.util.IllegalFormatPrecisionException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IllegalFormatPrecisionException} (by
 * simply reusing the J8Unit test interface {@link IllegalFormatPrecisionExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IllegalFormatPrecisionExceptionClassTest
implements IllegalFormatPrecisionExceptionClassTests<IllegalFormatPrecisionException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.IllegalFormatPrecisionException]

    @Override
    public Class<IllegalFormatPrecisionException> createNewSUT() {
        return IllegalFormatPrecisionException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.IllegalFormatPrecisionException#IllegalFormatPrecisionException(int) public
     * java.util.IllegalFormatPrecisionException(int)}.
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
    public void create_IllegalFormatPrecisionException_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalFormatPrecisionException sut = null; // = new IllegalFormatPrecisionException(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.IllegalFormatPrecisionException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.IllegalFormatPrecisionException]

}
