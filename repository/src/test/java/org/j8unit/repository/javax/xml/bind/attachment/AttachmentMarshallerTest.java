package org.j8unit.repository.javax.xml.bind.attachment;

import javax.xml.bind.attachment.AttachmentMarshaller;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AttachmentMarshaller} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.attachment.AttachmentMarshallerTests}).
 */

@RunWith(J8Unit4.class)
public class AttachmentMarshallerTest
implements AttachmentMarshallerTests<AttachmentMarshaller> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.attachment.AttachmentMarshaller]

    @Override
    public AttachmentMarshaller createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.attachment.AttachmentMarshaller], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.attachment.AttachmentMarshaller]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.attachment.AttachmentMarshaller]

}
