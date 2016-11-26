package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLStreamConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLStreamConstants} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.XMLStreamConstantsTests}).
 */
@RunWith(J8Unit4.class)
public class XMLStreamConstantsTest
implements XMLStreamConstantsTests<XMLStreamConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLStreamConstants]

    @Override
    public XMLStreamConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLStreamConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.XMLStreamConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.XMLStreamConstants]

}
