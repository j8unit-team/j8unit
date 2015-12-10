package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterModeClassTest
implements org.j8unit.repository.org.omg.CORBA.ParameterModeClassTests<org.omg.CORBA.ParameterMode> {

    @Override
    public Class<org.omg.CORBA.ParameterMode> createNewSUT() {
        return org.omg.CORBA.ParameterMode.class;
    }

}
