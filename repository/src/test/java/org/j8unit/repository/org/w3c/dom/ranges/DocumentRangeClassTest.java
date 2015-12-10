package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentRangeClassTest
implements org.j8unit.repository.org.w3c.dom.ranges.DocumentRangeClassTests<org.w3c.dom.ranges.DocumentRange> {

    @Override
    public Class<org.w3c.dom.ranges.DocumentRange> createNewSUT() {
        return org.w3c.dom.ranges.DocumentRange.class;
    }

}
