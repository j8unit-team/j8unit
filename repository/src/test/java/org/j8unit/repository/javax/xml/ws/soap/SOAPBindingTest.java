package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.SOAPBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPBindingTest
implements org.j8unit.repository.javax.xml.ws.soap.SOAPBindingTests<SOAPBinding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.SOAPBinding]

    @Override
    public SOAPBinding createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.soap.SOAPBinding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.soap.SOAPBinding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.soap.SOAPBinding]

}
