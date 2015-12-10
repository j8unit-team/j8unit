package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeLimitExceededExceptionClassTest
implements org.j8unit.repository.javax.naming.TimeLimitExceededExceptionClassTests<javax.naming.TimeLimitExceededException> {

    @Override
    public Class<javax.naming.TimeLimitExceededException> createNewSUT() {
        return javax.naming.TimeLimitExceededException.class;
    }

}
