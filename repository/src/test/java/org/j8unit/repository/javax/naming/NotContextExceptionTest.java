package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotContextExceptionTest
implements org.j8unit.repository.javax.naming.NotContextExceptionTests<javax.naming.NotContextException> {

    @Override
    public javax.naming.NotContextException createNewSUT() {
        return new javax.naming.NotContextException();
    }

}
