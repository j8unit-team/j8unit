package org.j8unit.repository.javax.xml.bind.attachment;

import javax.xml.bind.attachment.AttachmentUnmarshaller;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AttachmentUnmarshaller} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.bind.attachment.AttachmentUnmarshallerTests}).
 */

@RunWith(J8Unit4.class)
public class AttachmentUnmarshallerTest
implements AttachmentUnmarshallerTests<AttachmentUnmarshaller> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.attachment.AttachmentUnmarshaller]

    @Override
    public AttachmentUnmarshaller createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.attachment.AttachmentUnmarshaller], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.attachment.AttachmentUnmarshaller]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.attachment.AttachmentUnmarshaller]

}
