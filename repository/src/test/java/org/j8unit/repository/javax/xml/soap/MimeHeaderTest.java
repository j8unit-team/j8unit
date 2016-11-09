package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.MimeHeader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MimeHeader} (by simply reusing the
 * J8Unit test interface {@link MimeHeaderTests}).
 */

@RunWith(J8Unit4.class)
public class MimeHeaderTest
implements MimeHeaderTests<MimeHeader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.MimeHeader]

    @Override
    public MimeHeader createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.soap.MimeHeader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.MimeHeader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.MimeHeader]

}
