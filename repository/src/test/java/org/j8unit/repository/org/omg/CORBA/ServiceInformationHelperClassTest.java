package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceInformationHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.ServiceInformationHelperClassTests<org.omg.CORBA.ServiceInformationHelper> {

    @Override
    public Class<org.omg.CORBA.ServiceInformationHelper> createNewSUT() {
        return org.omg.CORBA.ServiceInformationHelper.class;
    }

}
