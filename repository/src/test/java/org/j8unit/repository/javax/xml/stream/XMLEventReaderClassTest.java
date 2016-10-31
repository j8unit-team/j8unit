package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLEventReader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class XMLEventReaderClassTest
implements org.j8unit.repository.javax.xml.stream.XMLEventReaderClassTests<XMLEventReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.XMLEventReader]

    @Override
    public Class<XMLEventReader> createNewSUT() {
        return XMLEventReader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.XMLEventReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.XMLEventReader]

}
