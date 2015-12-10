package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceInformationHolderTest
implements org.j8unit.repository.org.omg.CORBA.ServiceInformationHolderTests<org.omg.CORBA.ServiceInformationHolder> {

    @Override
    public org.omg.CORBA.ServiceInformationHolder createNewSUT() {
        return new org.omg.CORBA.ServiceInformationHolder();
    }

}
