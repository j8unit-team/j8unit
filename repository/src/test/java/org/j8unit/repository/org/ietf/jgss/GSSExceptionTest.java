package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSExceptionTest
implements org.j8unit.repository.org.ietf.jgss.GSSExceptionTests<GSSException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.GSSException]

    @Override
    public GSSException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.ietf.jgss.GSSException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.GSSException]

}
