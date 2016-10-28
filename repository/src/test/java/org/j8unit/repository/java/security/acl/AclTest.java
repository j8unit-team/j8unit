package org.j8unit.repository.java.security.acl;

import java.security.acl.Acl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclTest
implements org.j8unit.repository.java.security.acl.AclTests<Acl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.Acl]

    @Override
    public Acl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.acl.Acl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.Acl]

}
