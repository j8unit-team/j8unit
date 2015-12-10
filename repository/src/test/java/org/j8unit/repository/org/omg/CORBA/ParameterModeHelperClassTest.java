package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterModeHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.ParameterModeHelperClassTests<org.omg.CORBA.ParameterModeHelper> {

    @Override
    public Class<org.omg.CORBA.ParameterModeHelper> createNewSUT() {
        return org.omg.CORBA.ParameterModeHelper.class;
    }

}
