package org.j8unit.repository.java.security.acl;

import java.security.acl.AclEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AclEntry} (by simply reusing the J8Unit
 * test interface {@link AclEntryClassTests}).
 */

@RunWith(J8Unit4.class)
public class AclEntryClassTest
implements AclEntryClassTests<AclEntry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.AclEntry]

    @Override
    public Class<AclEntry> createNewSUT() {
        return AclEntry.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.acl.AclEntry]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.AclEntry]

}
