package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.IdUniquenessPolicyOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IdUniquenessPolicyOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.IdUniquenessPolicyOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class IdUniquenessPolicyOperationsClassTest
implements IdUniquenessPolicyOperationsClassTests<IdUniquenessPolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.IdUniquenessPolicyOperations]

    @Override
    public Class<IdUniquenessPolicyOperations> createNewSUT() {
        return IdUniquenessPolicyOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.IdUniquenessPolicyOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.IdUniquenessPolicyOperations]

}
