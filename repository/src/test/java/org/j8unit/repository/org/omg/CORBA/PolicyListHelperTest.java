package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.PolicyListHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PolicyListHelper} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.PolicyListHelperTests}).
 */

@RunWith(J8Unit4.class)
public class PolicyListHelperTest
implements PolicyListHelperTests<PolicyListHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.PolicyListHelper]

    @Override
    public PolicyListHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.PolicyListHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.PolicyListHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.PolicyListHelper]

}
