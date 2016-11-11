package org.j8unit.repository.java.text;

import java.text.ParsePosition;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParsePosition} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.ParsePositionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ParsePositionClassTest
implements ParsePositionClassTests<ParsePosition> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.ParsePosition]

    @Override
    public Class<ParsePosition> createNewSUT() {
        return ParsePosition.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.text.ParsePosition#ParsePosition(int)
     * public java.text.ParsePosition(int)}.
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
    public void create_ParsePosition_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParsePosition sut = null; // = new ParsePosition(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.ParsePosition]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.ParsePosition]

}
