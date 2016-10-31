package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.XMLReader;

@RunWith(J8Unit4.class)
public class XMLReaderClassTest
implements org.j8unit.repository.org.xml.sax.XMLReaderClassTests<XMLReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.XMLReader]

    @Override
    public Class<XMLReader> createNewSUT() {
        return XMLReader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.XMLReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.XMLReader]

}
