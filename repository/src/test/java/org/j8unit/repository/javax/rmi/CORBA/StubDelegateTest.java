package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.StubDelegate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StubDelegateTest
implements org.j8unit.repository.javax.rmi.CORBA.StubDelegateTests<StubDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.CORBA.StubDelegate]

    @Override
    public StubDelegate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.rmi.CORBA.StubDelegate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.CORBA.StubDelegate]

}
