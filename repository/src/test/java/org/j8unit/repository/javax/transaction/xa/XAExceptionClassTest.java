package org.j8unit.repository.javax.transaction.xa;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XAExceptionClassTest
implements org.j8unit.repository.javax.transaction.xa.XAExceptionClassTests<javax.transaction.xa.XAException> {

    @Override
    public Class<javax.transaction.xa.XAException> createNewSUT() {
        return javax.transaction.xa.XAException.class;
    }

}
