package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MalformedLinkExceptionTest
implements org.j8unit.repository.javax.naming.MalformedLinkExceptionTests<javax.naming.MalformedLinkException> {

    @Override
    public javax.naming.MalformedLinkException createNewSUT() {
        return new javax.naming.MalformedLinkException();
    }

}
