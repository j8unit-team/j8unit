package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPConnectionFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPConnectionFactoryTest
implements org.j8unit.repository.javax.xml.soap.SOAPConnectionFactoryTests<SOAPConnectionFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPConnectionFactory]

    @Override
    public SOAPConnectionFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.SOAPConnectionFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPConnectionFactory]

}
