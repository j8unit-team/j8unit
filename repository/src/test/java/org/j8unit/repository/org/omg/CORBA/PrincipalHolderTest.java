package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrincipalHolderTest
implements org.j8unit.repository.org.omg.CORBA.PrincipalHolderTests<org.omg.CORBA.PrincipalHolder> {

    @Override
    public org.omg.CORBA.PrincipalHolder createNewSUT() {
        return new org.omg.CORBA.PrincipalHolder();
    }

}
