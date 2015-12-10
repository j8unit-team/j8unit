package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeLimitExceededExceptionTest
implements org.j8unit.repository.javax.naming.TimeLimitExceededExceptionTests<javax.naming.TimeLimitExceededException> {

    @Override
    public javax.naming.TimeLimitExceededException createNewSUT() {
        return new javax.naming.TimeLimitExceededException();
    }

}
