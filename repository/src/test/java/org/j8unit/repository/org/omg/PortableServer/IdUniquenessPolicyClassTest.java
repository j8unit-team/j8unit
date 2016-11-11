package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.IdUniquenessPolicy;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IdUniquenessPolicy} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.IdUniquenessPolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class IdUniquenessPolicyClassTest
implements IdUniquenessPolicyClassTests<IdUniquenessPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.IdUniquenessPolicy]

    @Override
    public Class<IdUniquenessPolicy> createNewSUT() {
        return IdUniquenessPolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.IdUniquenessPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.IdUniquenessPolicy]

}
