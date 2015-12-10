package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameClassPairClassTest
implements org.j8unit.repository.javax.naming.NameClassPairClassTests<javax.naming.NameClassPair> {

    @Override
    public Class<javax.naming.NameClassPair> createNewSUT() {
        return javax.naming.NameClassPair.class;
    }

}
