package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RangeExceptionClassTest
implements org.j8unit.repository.org.w3c.dom.ranges.RangeExceptionClassTests<org.w3c.dom.ranges.RangeException> {

    @Override
    public Class<org.w3c.dom.ranges.RangeException> createNewSUT() {
        return org.w3c.dom.ranges.RangeException.class;
    }

}
