package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MalformedLinkExceptionClassTest
implements org.j8unit.repository.javax.naming.MalformedLinkExceptionClassTests<javax.naming.MalformedLinkException> {

    @Override
    public Class<javax.naming.MalformedLinkException> createNewSUT() {
        return javax.naming.MalformedLinkException.class;
    }

}
