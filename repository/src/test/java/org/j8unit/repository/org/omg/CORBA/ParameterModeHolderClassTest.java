package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterModeHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ParameterModeHolderClassTests<org.omg.CORBA.ParameterModeHolder> {

    @Override
    public Class<org.omg.CORBA.ParameterModeHolder> createNewSUT() {
        return org.omg.CORBA.ParameterModeHolder.class;
    }

}
