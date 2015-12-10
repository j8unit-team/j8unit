package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RangeExceptionTest
implements org.j8unit.repository.org.w3c.dom.ranges.RangeExceptionTests<org.w3c.dom.ranges.RangeException> {

    @Override
    public org.w3c.dom.ranges.RangeException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.w3c.dom.ranges.RangeException] available.");
    }

}
