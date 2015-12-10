package org.j8unit.repository.java.security.acl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclClassTest
implements org.j8unit.repository.java.security.acl.AclClassTests<java.security.acl.Acl> {

    @Override
    public Class<java.security.acl.Acl> createNewSUT() {
        return java.security.acl.Acl.class;
    }

}
