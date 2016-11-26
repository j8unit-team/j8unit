package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_POLICIES;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TAG_POLICIES} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.TAG_POLICIESClassTests}).
 */
@RunWith(J8Unit4.class)
public class TAG_POLICIESClassTest
implements TAG_POLICIESClassTests<TAG_POLICIES> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TAG_POLICIES]

    @Override
    public Class<TAG_POLICIES> createNewSUT() {
        return TAG_POLICIES.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.TAG_POLICIES]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TAG_POLICIES]

}
