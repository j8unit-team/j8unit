package org.j8unit.repository.javax.naming;

import javax.naming.RefAddr;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefAddrClassTest
implements org.j8unit.repository.javax.naming.RefAddrClassTests<RefAddr> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.RefAddr]

    @Override
    public Class<RefAddr> createNewSUT() {
        return RefAddr.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.RefAddr]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.RefAddr]

}
