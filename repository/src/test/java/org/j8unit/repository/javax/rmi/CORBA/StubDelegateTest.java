package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.StubDelegate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StubDelegate} (by simply reusing the
 * J8Unit test interface {@link StubDelegateTests}).
 */

@RunWith(J8Unit4.class)
public class StubDelegateTest
implements StubDelegateTests<StubDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.CORBA.StubDelegate]

    @Override
    public StubDelegate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.rmi.CORBA.StubDelegate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.rmi.CORBA.StubDelegate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.rmi.CORBA.StubDelegate]

}
