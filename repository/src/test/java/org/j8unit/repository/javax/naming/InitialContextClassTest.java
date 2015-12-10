package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialContextClassTest
implements org.j8unit.repository.javax.naming.InitialContextClassTests<javax.naming.InitialContext> {

    @Override
    public Class<javax.naming.InitialContext> createNewSUT() {
        return javax.naming.InitialContext.class;
    }

}
