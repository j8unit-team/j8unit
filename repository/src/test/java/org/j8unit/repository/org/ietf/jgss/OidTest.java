package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.Oid;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OidTest
implements org.j8unit.repository.org.ietf.jgss.OidTests<Oid> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.Oid]

    @Override
    public Oid createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.ietf.jgss.Oid], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.Oid]

}
