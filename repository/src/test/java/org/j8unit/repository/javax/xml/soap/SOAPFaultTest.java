package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPFault;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPFaultTest
implements org.j8unit.repository.javax.xml.soap.SOAPFaultTests<SOAPFault> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPFault]

    @Override
    public SOAPFault createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.SOAPFault], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPFault]

}
