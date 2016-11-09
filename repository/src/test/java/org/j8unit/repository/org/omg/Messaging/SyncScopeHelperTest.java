package org.j8unit.repository.org.omg.Messaging;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.Messaging.SyncScopeHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SyncScopeHelper} (by simply reusing
 * the J8Unit test interface {@link SyncScopeHelperTests}).
 */

@RunWith(J8Unit4.class)
public class SyncScopeHelperTest
implements SyncScopeHelperTests<SyncScopeHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.Messaging.SyncScopeHelper]

    @Override
    public SyncScopeHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.Messaging.SyncScopeHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.Messaging.SyncScopeHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.Messaging.SyncScopeHelper]

}
