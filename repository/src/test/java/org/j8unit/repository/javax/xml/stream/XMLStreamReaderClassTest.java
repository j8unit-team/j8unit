package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLStreamReader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLStreamReaderClassTest
implements org.j8unit.repository.javax.xml.stream.XMLStreamReaderClassTests<XMLStreamReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.XMLStreamReader]

    @Override
    public Class<XMLStreamReader> createNewSUT() {
        return XMLStreamReader.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.XMLStreamReader]

}
