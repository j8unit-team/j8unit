package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrincipalClassTest
implements org.j8unit.repository.org.omg.CORBA.PrincipalClassTests<org.omg.CORBA.Principal> {

    @Override
    public Class<org.omg.CORBA.Principal> createNewSUT() {
        return org.omg.CORBA.Principal.class;
    }

}
