package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttachmentPartClassTest
implements org.j8unit.repository.javax.xml.soap.AttachmentPartClassTests<javax.xml.soap.AttachmentPart> {

    @Override
    public Class<javax.xml.soap.AttachmentPart> createNewSUT() {
        return javax.xml.soap.AttachmentPart.class;
    }

}
