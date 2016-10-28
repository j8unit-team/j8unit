package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ranges.Range;

@RunWith(J8Unit4.class)
public class RangeClassTest
implements org.j8unit.repository.org.w3c.dom.ranges.RangeClassTests<Range> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ranges.Range]

    @Override
    public Class<Range> createNewSUT() {
        return Range.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ranges.Range]

}
