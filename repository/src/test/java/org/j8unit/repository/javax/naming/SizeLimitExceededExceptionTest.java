package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SizeLimitExceededExceptionTest
implements org.j8unit.repository.javax.naming.SizeLimitExceededExceptionTests<javax.naming.SizeLimitExceededException> {

    @Override
    public javax.naming.SizeLimitExceededException createNewSUT() {
        return new javax.naming.SizeLimitExceededException();
    }

}
