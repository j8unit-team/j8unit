package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLEventReaderClassTest
implements org.j8unit.repository.javax.xml.stream.XMLEventReaderClassTests<javax.xml.stream.XMLEventReader> {

    @Override
    public Class<javax.xml.stream.XMLEventReader> createNewSUT() {
        return javax.xml.stream.XMLEventReader.class;
    }

}
