package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.Addressing;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AddressingTest
implements org.j8unit.repository.javax.xml.ws.soap.AddressingTests<Addressing> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.Addressing]

    @Override
    public Addressing createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.soap.Addressing], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.soap.Addressing]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.soap.Addressing]

}
