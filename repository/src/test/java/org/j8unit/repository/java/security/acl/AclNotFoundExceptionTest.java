package org.j8unit.repository.java.security.acl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclNotFoundExceptionTest
implements org.j8unit.repository.java.security.acl.AclNotFoundExceptionTests<java.security.acl.AclNotFoundException> {

    @Override
    public java.security.acl.AclNotFoundException createNewSUT() {
        return new java.security.acl.AclNotFoundException();
    }

}
