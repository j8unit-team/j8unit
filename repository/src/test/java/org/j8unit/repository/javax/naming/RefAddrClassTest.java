package org.j8unit.repository.javax.naming;

import javax.naming.RefAddr;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RefAddr} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.naming.RefAddrClassTests}).
 */
@RunWith(J8Unit4.class)
public class RefAddrClassTest
implements RefAddrClassTests<RefAddr> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.RefAddr]

    @Override
    public Class<RefAddr> createNewSUT() {
        return RefAddr.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.RefAddr]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.RefAddr]

}
