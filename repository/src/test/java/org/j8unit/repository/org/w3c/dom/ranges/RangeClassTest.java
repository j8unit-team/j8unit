package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RangeClassTest
implements org.j8unit.repository.org.w3c.dom.ranges.RangeClassTests<org.w3c.dom.ranges.Range> {

    @Override
    public Class<org.w3c.dom.ranges.Range> createNewSUT() {
        return org.w3c.dom.ranges.Range.class;
    }

}
