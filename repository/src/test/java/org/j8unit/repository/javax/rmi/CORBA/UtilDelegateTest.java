package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.UtilDelegate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UtilDelegateTest
implements org.j8unit.repository.javax.rmi.CORBA.UtilDelegateTests<UtilDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.CORBA.UtilDelegate]

    @Override
    public UtilDelegate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.rmi.CORBA.UtilDelegate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.CORBA.UtilDelegate]

}
