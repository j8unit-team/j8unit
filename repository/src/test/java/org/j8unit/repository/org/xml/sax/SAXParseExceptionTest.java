package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXParseExceptionTest
implements org.j8unit.repository.org.xml.sax.SAXParseExceptionTests<org.xml.sax.SAXParseException> {

    @Override
    public org.xml.sax.SAXParseException createNewSUT() {
        throw new AssertionError("There is no default constructor for [org.xml.sax.SAXParseException] available.");
    }

}
