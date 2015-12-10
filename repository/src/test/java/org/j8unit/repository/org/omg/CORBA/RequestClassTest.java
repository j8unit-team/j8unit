package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RequestClassTest
implements org.j8unit.repository.org.omg.CORBA.RequestClassTests<org.omg.CORBA.Request> {

    @Override
    public Class<org.omg.CORBA.Request> createNewSUT() {
        return org.omg.CORBA.Request.class;
    }

}
