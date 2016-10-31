package org.j8unit.repository.java.security.acl;

import java.security.acl.AclEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclEntryTest
implements org.j8unit.repository.java.security.acl.AclEntryTests<AclEntry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.AclEntry]

    @Override
    public AclEntry createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.acl.AclEntry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.acl.AclEntry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.acl.AclEntry]

}
