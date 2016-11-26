package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link REQUEST_PROCESSING_POLICY_ID} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.REQUEST_PROCESSING_POLICY_IDClassTests}).
 */
@RunWith(J8Unit4.class)
public class REQUEST_PROCESSING_POLICY_IDClassTest
implements REQUEST_PROCESSING_POLICY_IDClassTests<REQUEST_PROCESSING_POLICY_ID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID]

    @Override
    public Class<REQUEST_PROCESSING_POLICY_ID> createNewSUT() {
        return REQUEST_PROCESSING_POLICY_ID.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID]

}
