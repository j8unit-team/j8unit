package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SizeLimitExceededExceptionClassTest
implements org.j8unit.repository.javax.naming.SizeLimitExceededExceptionClassTests<javax.naming.SizeLimitExceededException> {

    @Override
    public Class<javax.naming.SizeLimitExceededException> createNewSUT() {
        return javax.naming.SizeLimitExceededException.class;
    }

}
