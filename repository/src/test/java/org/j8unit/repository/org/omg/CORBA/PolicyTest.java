package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.Policy;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Policy} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.PolicyTests}).
 */

@RunWith(J8Unit4.class)
public class PolicyTest
implements PolicyTests<Policy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.Policy]

    @Override
    public Policy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.Policy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.Policy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.Policy]

}
