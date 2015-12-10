package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLStreamReaderClassTest
implements org.j8unit.repository.javax.xml.stream.XMLStreamReaderClassTests<javax.xml.stream.XMLStreamReader> {

    @Override
    public Class<javax.xml.stream.XMLStreamReader> createNewSUT() {
        return javax.xml.stream.XMLStreamReader.class;
    }

}
