package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContextClassTest
implements org.j8unit.repository.javax.naming.ContextClassTests<javax.naming.Context> {

    @Override
    public Class<javax.naming.Context> createNewSUT() {
        return javax.naming.Context.class;
    }

}
