package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.Policy;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Policy} (by simply reusing the J8Unit
 * test interface {@link PolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class PolicyClassTest
implements PolicyClassTests<Policy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.Policy]

    @Override
    public Class<Policy> createNewSUT() {
        return Policy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.Policy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.Policy]

}
