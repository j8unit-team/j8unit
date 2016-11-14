package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ranges.DocumentRange;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentRange} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ranges.DocumentRangeClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentRangeClassTest
implements DocumentRangeClassTests<DocumentRange> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ranges.DocumentRange]

    @Override
    public Class<DocumentRange> createNewSUT() {
        return DocumentRange.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ranges.DocumentRange]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ranges.DocumentRange]

}
