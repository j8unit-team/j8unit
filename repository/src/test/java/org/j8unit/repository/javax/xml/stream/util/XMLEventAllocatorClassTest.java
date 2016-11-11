package org.j8unit.repository.javax.xml.stream.util;

import javax.xml.stream.util.XMLEventAllocator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLEventAllocator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.util.XMLEventAllocatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLEventAllocatorClassTest
implements XMLEventAllocatorClassTests<XMLEventAllocator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.util.XMLEventAllocator]

    @Override
    public Class<XMLEventAllocator> createNewSUT() {
        return XMLEventAllocator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.util.XMLEventAllocator]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.util.XMLEventAllocator]

}
