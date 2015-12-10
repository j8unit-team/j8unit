package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLReaderClassTest
implements org.j8unit.repository.org.xml.sax.XMLReaderClassTests<org.xml.sax.XMLReader> {

    @Override
    public Class<org.xml.sax.XMLReader> createNewSUT() {
        return org.xml.sax.XMLReader.class;
    }

}
