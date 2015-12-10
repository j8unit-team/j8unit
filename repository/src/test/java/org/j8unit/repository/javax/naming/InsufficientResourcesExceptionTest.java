package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InsufficientResourcesExceptionTest
implements org.j8unit.repository.javax.naming.InsufficientResourcesExceptionTests<javax.naming.InsufficientResourcesException> {

    @Override
    public javax.naming.InsufficientResourcesException createNewSUT() {
        return new javax.naming.InsufficientResourcesException();
    }

}
