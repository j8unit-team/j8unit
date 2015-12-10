package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceDetailClassTest
implements org.j8unit.repository.org.omg.CORBA.ServiceDetailClassTests<org.omg.CORBA.ServiceDetail> {

    @Override
    public Class<org.omg.CORBA.ServiceDetail> createNewSUT() {
        return org.omg.CORBA.ServiceDetail.class;
    }

}
