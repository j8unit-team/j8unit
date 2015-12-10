package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXExceptionClassTest
implements org.j8unit.repository.org.xml.sax.SAXExceptionClassTests<org.xml.sax.SAXException> {

    @Override
    public Class<org.xml.sax.SAXException> createNewSUT() {
        return org.xml.sax.SAXException.class;
    }

}
