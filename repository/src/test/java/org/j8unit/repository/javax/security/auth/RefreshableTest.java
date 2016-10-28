package org.j8unit.repository.javax.security.auth;

import javax.security.auth.Refreshable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefreshableTest
implements org.j8unit.repository.javax.security.auth.RefreshableTests<Refreshable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.Refreshable]

    @Override
    public Refreshable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.Refreshable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.Refreshable]

}
