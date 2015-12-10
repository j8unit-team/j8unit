package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceInformationClassTest
implements org.j8unit.repository.org.omg.CORBA.ServiceInformationClassTests<org.omg.CORBA.ServiceInformation> {

    @Override
    public Class<org.omg.CORBA.ServiceInformation> createNewSUT() {
        return org.omg.CORBA.ServiceInformation.class;
    }

}
