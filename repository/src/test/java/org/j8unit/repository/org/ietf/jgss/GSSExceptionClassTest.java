package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSExceptionClassTest
implements org.j8unit.repository.org.ietf.jgss.GSSExceptionClassTests<org.ietf.jgss.GSSException> {

    @Override
    public Class<org.ietf.jgss.GSSException> createNewSUT() {
        return org.ietf.jgss.GSSException.class;
    }

}
