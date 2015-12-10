package org.j8unit.repository.java.security.acl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclNotFoundExceptionClassTest
implements org.j8unit.repository.java.security.acl.AclNotFoundExceptionClassTests<java.security.acl.AclNotFoundException> {

    @Override
    public Class<java.security.acl.AclNotFoundException> createNewSUT() {
        return java.security.acl.AclNotFoundException.class;
    }

}
