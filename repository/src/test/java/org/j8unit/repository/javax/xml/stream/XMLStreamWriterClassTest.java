package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLStreamWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLStreamWriter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.XMLStreamWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLStreamWriterClassTest
implements XMLStreamWriterClassTests<XMLStreamWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.XMLStreamWriter]

    @Override
    public Class<XMLStreamWriter> createNewSUT() {
        return XMLStreamWriter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.XMLStreamWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.XMLStreamWriter]

}
