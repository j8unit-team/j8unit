package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerRequestClassTest
implements org.j8unit.repository.org.omg.CORBA.ServerRequestClassTests<org.omg.CORBA.ServerRequest> {

    @Override
    public Class<org.omg.CORBA.ServerRequest> createNewSUT() {
        return org.omg.CORBA.ServerRequest.class;
    }

}
