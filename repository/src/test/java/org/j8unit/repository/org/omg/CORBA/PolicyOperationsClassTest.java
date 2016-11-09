package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.PolicyOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PolicyOperations} (by simply reusing the
 * J8Unit test interface {@link PolicyOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class PolicyOperationsClassTest
implements PolicyOperationsClassTests<PolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PolicyOperations]

    @Override
    public Class<PolicyOperations> createNewSUT() {
        return PolicyOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.PolicyOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PolicyOperations]

}
