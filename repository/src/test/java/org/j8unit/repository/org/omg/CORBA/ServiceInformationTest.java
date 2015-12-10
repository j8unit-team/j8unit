package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceInformationTest
implements org.j8unit.repository.org.omg.CORBA.ServiceInformationTests<org.omg.CORBA.ServiceInformation> {

    @Override
    public org.omg.CORBA.ServiceInformation createNewSUT() {
        return new org.omg.CORBA.ServiceInformation();
    }

}
