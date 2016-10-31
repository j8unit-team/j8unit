package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPConstantsTest
implements org.j8unit.repository.javax.xml.soap.SOAPConstantsTests<SOAPConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPConstants]

    @Override
    public SOAPConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.SOAPConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.SOAPConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.SOAPConstants]

}
