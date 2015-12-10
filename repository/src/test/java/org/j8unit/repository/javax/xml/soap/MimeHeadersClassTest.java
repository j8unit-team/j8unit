package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MimeHeadersClassTest
implements org.j8unit.repository.javax.xml.soap.MimeHeadersClassTests<javax.xml.soap.MimeHeaders> {

    @Override
    public Class<javax.xml.soap.MimeHeaders> createNewSUT() {
        return javax.xml.soap.MimeHeaders.class;
    }

}
