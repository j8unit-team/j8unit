package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.w3c.dom.ranges.RangeException;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RangeException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ranges.RangeExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class RangeExceptionClassTest
implements RangeExceptionClassTests<RangeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ranges.RangeException]

    @Override
    public Class<RangeException> createNewSUT() {
        return RangeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.w3c.dom.ranges.RangeException#RangeException(short, String) public
     * org.w3c.dom.ranges.RangeException(short,java.lang.String)}.
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
    public void create_RangeException_short_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RangeException sut = null; // = new RangeException(short, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ranges.RangeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ranges.RangeException]

}
