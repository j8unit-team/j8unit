package org.j8unit.repository.org.omg.Messaging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SYNC_WITH_TRANSPORT} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.Messaging.SYNC_WITH_TRANSPORTClassTests}).
 */

@RunWith(J8Unit4.class)
public class SYNC_WITH_TRANSPORTClassTest
implements SYNC_WITH_TRANSPORTClassTests<SYNC_WITH_TRANSPORT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.Messaging.SYNC_WITH_TRANSPORT]

    @Override
    public Class<SYNC_WITH_TRANSPORT> createNewSUT() {
        return SYNC_WITH_TRANSPORT.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.Messaging.SYNC_WITH_TRANSPORT]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.Messaging.SYNC_WITH_TRANSPORT]

}
