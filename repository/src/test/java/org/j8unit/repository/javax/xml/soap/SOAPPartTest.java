package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPPart;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SOAPPart} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPPartTests}).
 */
@RunWith(J8Unit4.class)
public class SOAPPartTest
implements SOAPPartTests<SOAPPart> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPPart]

    @Override
    public SOAPPart createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.SOAPPart], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.SOAPPart]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.SOAPPart]

}
