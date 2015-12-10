package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MimeHeaderClassTest
implements org.j8unit.repository.javax.xml.soap.MimeHeaderClassTests<javax.xml.soap.MimeHeader> {

    @Override
    public Class<javax.xml.soap.MimeHeader> createNewSUT() {
        return javax.xml.soap.MimeHeader.class;
    }

}
