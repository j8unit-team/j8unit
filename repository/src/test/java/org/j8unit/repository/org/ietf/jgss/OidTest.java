package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OidTest
implements org.j8unit.repository.org.ietf.jgss.OidTests<org.ietf.jgss.Oid> {

    @Override
    public org.ietf.jgss.Oid createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.ietf.jgss.Oid] available.");
    }

}
