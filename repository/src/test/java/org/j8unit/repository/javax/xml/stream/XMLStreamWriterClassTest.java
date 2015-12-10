package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLStreamWriterClassTest
implements org.j8unit.repository.javax.xml.stream.XMLStreamWriterClassTests<javax.xml.stream.XMLStreamWriter> {

    @Override
    public Class<javax.xml.stream.XMLStreamWriter> createNewSUT() {
        return javax.xml.stream.XMLStreamWriter.class;
    }

}
