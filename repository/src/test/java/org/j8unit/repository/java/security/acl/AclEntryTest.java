package org.j8unit.repository.java.security.acl;

import java.security.acl.AclEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AclEntry} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.acl.AclEntryTests}).
 */

@RunWith(J8Unit4.class)
public class AclEntryTest
implements AclEntryTests<AclEntry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.AclEntry]

    @Override
    public AclEntry createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.acl.AclEntry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.acl.AclEntry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.acl.AclEntry]

}
