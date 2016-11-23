package org.j8unit.repository.javax.security.auth;

import javax.security.auth.Policy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Policy} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.security.auth.PolicyTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class PolicyTest
implements PolicyTests<Policy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.Policy]

    @Override
    public Policy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.Policy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.Policy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.Policy]

}
