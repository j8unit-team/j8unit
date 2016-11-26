package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.MTOM;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MTOM} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.ws.soap.MTOMTests}).
 */
@RunWith(J8Unit4.class)
public class MTOMTest
implements MTOMTests<MTOM> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.MTOM]

    @Override
    public MTOM createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.soap.MTOM], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.soap.MTOM]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.soap.MTOM]

}
