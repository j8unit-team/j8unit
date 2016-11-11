package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.Addressing;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Addressing} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.soap.AddressingTests}).
 */

@RunWith(J8Unit4.class)
public class AddressingTest
implements AddressingTests<Addressing> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.Addressing]

    @Override
    public Addressing createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.soap.Addressing], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.soap.Addressing]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.soap.Addressing]

}
