package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.AttachmentPart;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AttachmentPart} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.AttachmentPartTests}).
 */
@RunWith(J8Unit4.class)
public class AttachmentPartTest
implements AttachmentPartTests<AttachmentPart> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.AttachmentPart]

    @Override
    public AttachmentPart createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.AttachmentPart], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.AttachmentPart]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.AttachmentPart]

}
