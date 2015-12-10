package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXNotRecognizedExceptionTest
implements org.j8unit.repository.org.xml.sax.SAXNotRecognizedExceptionTests<org.xml.sax.SAXNotRecognizedException> {

    @Override
    public org.xml.sax.SAXNotRecognizedException createNewSUT() {
        return new org.xml.sax.SAXNotRecognizedException();
    }

}
