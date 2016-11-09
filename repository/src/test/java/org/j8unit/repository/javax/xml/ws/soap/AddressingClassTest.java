package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.Addressing;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Addressing} (by simply reusing the J8Unit
 * test interface {@link AddressingClassTests}).
 */

@RunWith(J8Unit4.class)
public class AddressingClassTest
implements AddressingClassTests<Addressing> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.soap.Addressing]

    @Override
    public Class<Addressing> createNewSUT() {
        return Addressing.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.soap.Addressing]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.soap.Addressing]

}
