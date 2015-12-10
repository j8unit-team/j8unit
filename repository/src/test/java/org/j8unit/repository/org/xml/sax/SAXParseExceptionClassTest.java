package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXParseExceptionClassTest
implements org.j8unit.repository.org.xml.sax.SAXParseExceptionClassTests<org.xml.sax.SAXParseException> {

    @Override
    public Class<org.xml.sax.SAXParseException> createNewSUT() {
        return org.xml.sax.SAXParseException.class;
    }

}
