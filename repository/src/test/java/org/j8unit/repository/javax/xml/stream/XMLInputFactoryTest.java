package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLInputFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLInputFactory} (by simply reusing
 * the J8Unit test interface {@link XMLInputFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class XMLInputFactoryTest
implements XMLInputFactoryTests<XMLInputFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLInputFactory]

    @Override
    public XMLInputFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLInputFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.XMLInputFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.XMLInputFactory]

}
