package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceDetailHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.ServiceDetailHelperClassTests<org.omg.CORBA.ServiceDetailHelper> {

    @Override
    public Class<org.omg.CORBA.ServiceDetailHelper> createNewSUT() {
        return org.omg.CORBA.ServiceDetailHelper.class;
    }

}
