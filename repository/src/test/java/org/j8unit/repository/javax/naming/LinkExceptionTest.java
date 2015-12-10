package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkExceptionTest
implements org.j8unit.repository.javax.naming.LinkExceptionTests<javax.naming.LinkException> {

    @Override
    public javax.naming.LinkException createNewSUT() {
        return new javax.naming.LinkException();
    }

}
