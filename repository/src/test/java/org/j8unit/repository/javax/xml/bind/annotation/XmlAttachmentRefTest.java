package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAttachmentRef;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlAttachmentRef} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlAttachmentRefTests}).
 */
@RunWith(J8Unit4.class)
public class XmlAttachmentRefTest
implements XmlAttachmentRefTests<XmlAttachmentRef> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlAttachmentRef]

    @Override
    public XmlAttachmentRef createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlAttachmentRef], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlAttachmentRef]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlAttachmentRef]

}
