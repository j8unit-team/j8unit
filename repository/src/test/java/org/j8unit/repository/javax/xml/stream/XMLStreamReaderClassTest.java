package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLStreamReader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLStreamReader} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.XMLStreamReaderClassTests}).
 */
@RunWith(J8Unit4.class)
public class XMLStreamReaderClassTest
implements XMLStreamReaderClassTests<XMLStreamReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.XMLStreamReader]

    @Override
    public Class<XMLStreamReader> createNewSUT() {
        return XMLStreamReader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.XMLStreamReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.XMLStreamReader]

}
