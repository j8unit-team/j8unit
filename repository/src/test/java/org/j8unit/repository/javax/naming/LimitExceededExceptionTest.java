package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LimitExceededExceptionTest
implements org.j8unit.repository.javax.naming.LimitExceededExceptionTests<javax.naming.LimitExceededException> {

    @Override
    public javax.naming.LimitExceededException createNewSUT() {
        return new javax.naming.LimitExceededException();
    }

}
