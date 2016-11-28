package org.j8unit.repository.javax.xml.stream.util;

import javax.xml.stream.util.XMLEventAllocator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLEventAllocator} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.util.XMLEventAllocatorTests}).
 */
@RunWith(J8Unit4.class)
public class XMLEventAllocatorTest
implements XMLEventAllocatorTests<XMLEventAllocator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.util.XMLEventAllocator]

    @Override
    public XMLEventAllocator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.util.XMLEventAllocator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.util.XMLEventAllocator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.util.XMLEventAllocator]

}
