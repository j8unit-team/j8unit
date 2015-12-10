package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLEventWriterClassTest
implements org.j8unit.repository.javax.xml.stream.XMLEventWriterClassTests<javax.xml.stream.XMLEventWriter> {

    @Override
    public Class<javax.xml.stream.XMLEventWriter> createNewSUT() {
        return javax.xml.stream.XMLEventWriter.class;
    }

}
