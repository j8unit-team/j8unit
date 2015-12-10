package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSExceptionTest
implements org.j8unit.repository.org.ietf.jgss.GSSExceptionTests<org.ietf.jgss.GSSException> {

    @Override
    public org.ietf.jgss.GSSException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.ietf.jgss.GSSException] available.");
    }

}
