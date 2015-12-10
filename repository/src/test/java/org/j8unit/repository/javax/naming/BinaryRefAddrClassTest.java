package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BinaryRefAddrClassTest
implements org.j8unit.repository.javax.naming.BinaryRefAddrClassTests<javax.naming.BinaryRefAddr> {

    @Override
    public Class<javax.naming.BinaryRefAddr> createNewSUT() {
        return javax.naming.BinaryRefAddr.class;
    }

}
