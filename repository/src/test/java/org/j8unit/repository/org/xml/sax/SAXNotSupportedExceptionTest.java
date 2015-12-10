package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXNotSupportedExceptionTest
implements org.j8unit.repository.org.xml.sax.SAXNotSupportedExceptionTests<org.xml.sax.SAXNotSupportedException> {

    @Override
    public org.xml.sax.SAXNotSupportedException createNewSUT() {
        return new org.xml.sax.SAXNotSupportedException();
    }

}
