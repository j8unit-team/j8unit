package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidNameExceptionTest
implements org.j8unit.repository.javax.naming.InvalidNameExceptionTests<javax.naming.InvalidNameException> {

    @Override
    public javax.naming.InvalidNameException createNewSUT() {
        return new javax.naming.InvalidNameException();
    }

}