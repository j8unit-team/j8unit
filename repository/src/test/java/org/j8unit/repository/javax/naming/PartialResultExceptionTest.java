package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PartialResultExceptionTest
implements org.j8unit.repository.javax.naming.PartialResultExceptionTests<javax.naming.PartialResultException> {

    @Override
    public javax.naming.PartialResultException createNewSUT() {
        return new javax.naming.PartialResultException();
    }

}
