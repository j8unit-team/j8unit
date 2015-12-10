package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LimitExceededExceptionClassTest
implements org.j8unit.repository.javax.naming.LimitExceededExceptionClassTests<javax.naming.LimitExceededException> {

    @Override
    public Class<javax.naming.LimitExceededException> createNewSUT() {
        return javax.naming.LimitExceededException.class;
    }

}
