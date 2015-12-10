package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrincipalHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.PrincipalHolderClassTests<org.omg.CORBA.PrincipalHolder> {

    @Override
    public Class<org.omg.CORBA.PrincipalHolder> createNewSUT() {
        return org.omg.CORBA.PrincipalHolder.class;
    }

}
