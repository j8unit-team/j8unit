package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UtilTest
implements org.j8unit.repository.javax.rmi.CORBA.UtilTests<javax.rmi.CORBA.Util> {

    @Override
    public javax.rmi.CORBA.Util createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.rmi.CORBA.Util] available.");
    }

}
