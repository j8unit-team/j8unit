package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.Util;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UtilTest
implements org.j8unit.repository.javax.rmi.CORBA.UtilTests<Util> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.CORBA.Util]

    @Override
    public Util createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.rmi.CORBA.Util], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.rmi.CORBA.Util]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.rmi.CORBA.Util]

}
