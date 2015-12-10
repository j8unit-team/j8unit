package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MimeHeadersTest
implements org.j8unit.repository.javax.xml.soap.MimeHeadersTests<javax.xml.soap.MimeHeaders> {

    @Override
    public javax.xml.soap.MimeHeaders createNewSUT() {
        return new javax.xml.soap.MimeHeaders();
    }

}
