package org.j8unit.repository.javax.transaction.xa;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XAExceptionTest
implements org.j8unit.repository.javax.transaction.xa.XAExceptionTests<javax.transaction.xa.XAException> {

    @Override
    public javax.transaction.xa.XAException createNewSUT() {
        return new javax.transaction.xa.XAException();
    }

}
