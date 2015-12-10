package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContextNotEmptyExceptionTest
implements org.j8unit.repository.javax.naming.ContextNotEmptyExceptionTests<javax.naming.ContextNotEmptyException> {

    @Override
    public javax.naming.ContextNotEmptyException createNewSUT() {
        return new javax.naming.ContextNotEmptyException();
    }

}
