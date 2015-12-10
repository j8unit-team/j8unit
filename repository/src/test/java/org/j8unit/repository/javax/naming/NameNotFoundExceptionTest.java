package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameNotFoundExceptionTest
implements org.j8unit.repository.javax.naming.NameNotFoundExceptionTests<javax.naming.NameNotFoundException> {

    @Override
    public javax.naming.NameNotFoundException createNewSUT() {
        return new javax.naming.NameNotFoundException();
    }

}
