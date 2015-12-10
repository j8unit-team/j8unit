package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLStreamExceptionClassTest
implements org.j8unit.repository.javax.xml.stream.XMLStreamExceptionClassTests<javax.xml.stream.XMLStreamException> {

    @Override
    public Class<javax.xml.stream.XMLStreamException> createNewSUT() {
        return javax.xml.stream.XMLStreamException.class;
    }

}
