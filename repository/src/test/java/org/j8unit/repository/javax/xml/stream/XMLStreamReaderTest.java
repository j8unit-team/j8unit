package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLStreamReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLStreamReader} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.XMLStreamReaderTests}).
 */
@RunWith(J8Unit4.class)
public class XMLStreamReaderTest
implements XMLStreamReaderTests<XMLStreamReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLStreamReader]

    @Override
    public XMLStreamReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLStreamReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.XMLStreamReader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.XMLStreamReader]

}
