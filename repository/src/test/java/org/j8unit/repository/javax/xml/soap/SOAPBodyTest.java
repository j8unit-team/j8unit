package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPBody;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPBodyTest
implements org.j8unit.repository.javax.xml.soap.SOAPBodyTests<SOAPBody> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPBody]

    @Override
    public SOAPBody createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.SOAPBody], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPBody]

}
