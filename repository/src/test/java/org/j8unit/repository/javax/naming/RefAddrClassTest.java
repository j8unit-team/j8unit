package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefAddrClassTest
implements org.j8unit.repository.javax.naming.RefAddrClassTests<javax.naming.RefAddr> {

    @Override
    public Class<javax.naming.RefAddr> createNewSUT() {
        return javax.naming.RefAddr.class;
    }

}
