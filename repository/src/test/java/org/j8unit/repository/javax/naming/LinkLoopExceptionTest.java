package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkLoopExceptionTest
implements org.j8unit.repository.javax.naming.LinkLoopExceptionTests<javax.naming.LinkLoopException> {

    @Override
    public javax.naming.LinkLoopException createNewSUT() {
        return new javax.naming.LinkLoopException();
    }

}
