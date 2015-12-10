package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterModeTest
implements org.j8unit.repository.org.omg.CORBA.ParameterModeTests<org.omg.CORBA.ParameterMode> {

    @Override
    public org.omg.CORBA.ParameterMode createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.omg.CORBA.ParameterMode] available.");
    }

}
