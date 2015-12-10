package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoInitialContextExceptionTest
implements org.j8unit.repository.javax.naming.NoInitialContextExceptionTests<javax.naming.NoInitialContextException> {

    @Override
    public javax.naming.NoInitialContextException createNewSUT() {
        return new javax.naming.NoInitialContextException();
    }

}
