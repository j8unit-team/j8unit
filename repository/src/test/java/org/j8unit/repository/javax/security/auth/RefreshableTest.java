package org.j8unit.repository.javax.security.auth;

import javax.security.auth.Refreshable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Refreshable} (by simply reusing the
 * J8Unit test interface {@link RefreshableTests}).
 */

@RunWith(J8Unit4.class)
public class RefreshableTest
implements RefreshableTests<Refreshable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.Refreshable]

    @Override
    public Refreshable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.Refreshable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.Refreshable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.Refreshable]

}
