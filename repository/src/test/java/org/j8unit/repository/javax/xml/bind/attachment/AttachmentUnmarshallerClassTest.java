package org.j8unit.repository.javax.xml.bind.attachment;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttachmentUnmarshallerClassTest
implements org.j8unit.repository.javax.xml.bind.attachment.AttachmentUnmarshallerClassTests<javax.xml.bind.attachment.AttachmentUnmarshaller> {

    @Override
    public Class<javax.xml.bind.attachment.AttachmentUnmarshaller> createNewSUT() {
        return javax.xml.bind.attachment.AttachmentUnmarshaller.class;
    }

}
