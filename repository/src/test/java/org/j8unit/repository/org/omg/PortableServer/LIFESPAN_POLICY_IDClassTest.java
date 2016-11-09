package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LIFESPAN_POLICY_ID} (by simply reusing
 * the J8Unit test interface {@link LIFESPAN_POLICY_IDClassTests}).
 */

@RunWith(J8Unit4.class)
public class LIFESPAN_POLICY_IDClassTest
implements LIFESPAN_POLICY_IDClassTests<LIFESPAN_POLICY_ID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.LIFESPAN_POLICY_ID]

    @Override
    public Class<LIFESPAN_POLICY_ID> createNewSUT() {
        return LIFESPAN_POLICY_ID.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.LIFESPAN_POLICY_ID]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.LIFESPAN_POLICY_ID]

}
