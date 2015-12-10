package org.j8unit.repository.javax.xml.bind.attachment;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttachmentMarshallerClassTest
implements org.j8unit.repository.javax.xml.bind.attachment.AttachmentMarshallerClassTests<javax.xml.bind.attachment.AttachmentMarshaller> {

    @Override
    public Class<javax.xml.bind.attachment.AttachmentMarshaller> createNewSUT() {
        return javax.xml.bind.attachment.AttachmentMarshaller.class;
    }

}
