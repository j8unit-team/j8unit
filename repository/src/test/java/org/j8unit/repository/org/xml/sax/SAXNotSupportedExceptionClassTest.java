package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXNotSupportedExceptionClassTest
implements org.j8unit.repository.org.xml.sax.SAXNotSupportedExceptionClassTests<org.xml.sax.SAXNotSupportedException> {

    @Override
    public Class<org.xml.sax.SAXNotSupportedException> createNewSUT() {
        return org.xml.sax.SAXNotSupportedException.class;
    }

}
