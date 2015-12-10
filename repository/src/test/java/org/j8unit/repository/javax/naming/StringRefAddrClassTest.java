package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringRefAddrClassTest
implements org.j8unit.repository.javax.naming.StringRefAddrClassTests<javax.naming.StringRefAddr> {

    @Override
    public Class<javax.naming.StringRefAddr> createNewSUT() {
        return javax.naming.StringRefAddr.class;
    }

}
