package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SERVANT_RETENTION_POLICY_ID} (by
 * simply reusing the J8Unit test interface {@link SERVANT_RETENTION_POLICY_IDTests}).
 */

@RunWith(J8Unit4.class)
public class SERVANT_RETENTION_POLICY_IDTest
implements SERVANT_RETENTION_POLICY_IDTests<SERVANT_RETENTION_POLICY_ID> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID]

    @Override
    public SERVANT_RETENTION_POLICY_ID createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID]

}
