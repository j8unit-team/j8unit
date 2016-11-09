package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ranges.Range;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Range} (by simply reusing the J8Unit test
 * interface {@link RangeClassTests}).
 */

@RunWith(J8Unit4.class)
public class RangeClassTest
implements RangeClassTests<Range> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ranges.Range]

    @Override
    public Class<Range> createNewSUT() {
        return Range.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ranges.Range]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ranges.Range]

}
