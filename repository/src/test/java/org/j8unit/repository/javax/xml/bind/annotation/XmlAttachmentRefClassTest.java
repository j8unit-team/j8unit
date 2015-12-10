package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAttachmentRefClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAttachmentRefClassTests<javax.xml.bind.annotation.XmlAttachmentRef> {

    @Override
    public Class<javax.xml.bind.annotation.XmlAttachmentRef> createNewSUT() {
        return javax.xml.bind.annotation.XmlAttachmentRef.class;
    }

}
