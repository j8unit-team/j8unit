package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLEventWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLEventWriter} (by simply reusing the
 * J8Unit test interface {@link XMLEventWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLEventWriterClassTest
implements XMLEventWriterClassTests<XMLEventWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.XMLEventWriter]

    @Override
    public Class<XMLEventWriter> createNewSUT() {
        return XMLEventWriter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.XMLEventWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.XMLEventWriter]

}
