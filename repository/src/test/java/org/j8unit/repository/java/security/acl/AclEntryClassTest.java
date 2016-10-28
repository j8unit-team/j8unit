package org.j8unit.repository.java.security.acl;

import java.security.acl.AclEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclEntryClassTest
implements org.j8unit.repository.java.security.acl.AclEntryClassTests<AclEntry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.AclEntry]

    @Override
    public Class<AclEntry> createNewSUT() {
        return AclEntry.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.AclEntry]

}
