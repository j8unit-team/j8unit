package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAttachmentRef;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlAttachmentRef} (by simply reusing the
 * J8Unit test interface {@link XmlAttachmentRefClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlAttachmentRefClassTest
implements XmlAttachmentRefClassTests<XmlAttachmentRef> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlAttachmentRef]

    @Override
    public Class<XmlAttachmentRef> createNewSUT() {
        return XmlAttachmentRef.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlAttachmentRef]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlAttachmentRef]

}
