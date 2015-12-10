package org.j8unit.repository.java.security.acl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclEntryClassTest
implements org.j8unit.repository.java.security.acl.AclEntryClassTests<java.security.acl.AclEntry> {

    @Override
    public Class<java.security.acl.AclEntry> createNewSUT() {
        return java.security.acl.AclEntry.class;
    }

}
