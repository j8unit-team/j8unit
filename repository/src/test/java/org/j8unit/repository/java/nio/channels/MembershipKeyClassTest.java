package org.j8unit.repository.java.nio.channels;

import java.nio.channels.MembershipKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MembershipKey} (by simply reusing the
 * J8Unit test interface {@link MembershipKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class MembershipKeyClassTest
implements MembershipKeyClassTests<MembershipKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.MembershipKey]

    @Override
    public Class<MembershipKey> createNewSUT() {
        return MembershipKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.MembershipKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.MembershipKey]

}
