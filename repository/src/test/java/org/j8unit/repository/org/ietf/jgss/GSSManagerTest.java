package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSManagerTest
implements org.j8unit.repository.org.ietf.jgss.GSSManagerTests<GSSManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.GSSManager]

    @Override
    public GSSManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.ietf.jgss.GSSManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.ietf.jgss.GSSManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.ietf.jgss.GSSManager]

}
