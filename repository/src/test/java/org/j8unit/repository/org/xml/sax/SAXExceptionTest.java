package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXExceptionTest
implements org.j8unit.repository.org.xml.sax.SAXExceptionTests<org.xml.sax.SAXException> {

    @Override
    public org.xml.sax.SAXException createNewSUT() {
        return new org.xml.sax.SAXException();
    }

}
