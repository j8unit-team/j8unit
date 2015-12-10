package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLStreamExceptionTest
implements org.j8unit.repository.javax.xml.stream.XMLStreamExceptionTests<javax.xml.stream.XMLStreamException> {

    @Override
    public javax.xml.stream.XMLStreamException createNewSUT() {
        return new javax.xml.stream.XMLStreamException();
    }

}
