package org.j8unit.repository.java.nio.channels;

import java.nio.channels.MembershipKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MembershipKey} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.channels.MembershipKeyTests}).
 */

@RunWith(J8Unit4.class)
public class MembershipKeyTest
implements MembershipKeyTests<MembershipKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.MembershipKey]

    @Override
    public MembershipKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.MembershipKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.MembershipKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.MembershipKey]

}
