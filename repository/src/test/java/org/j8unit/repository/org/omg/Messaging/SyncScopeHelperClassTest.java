package org.j8unit.repository.org.omg.Messaging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncScopeHelperClassTest
implements org.j8unit.repository.org.omg.Messaging.SyncScopeHelperClassTests<org.omg.Messaging.SyncScopeHelper> {

    @Override
    public Class<org.omg.Messaging.SyncScopeHelper> createNewSUT() {
        return org.omg.Messaging.SyncScopeHelper.class;
    }

}
