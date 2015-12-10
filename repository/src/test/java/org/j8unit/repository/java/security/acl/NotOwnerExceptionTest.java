package org.j8unit.repository.java.security.acl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotOwnerExceptionTest
implements org.j8unit.repository.java.security.acl.NotOwnerExceptionTests<java.security.acl.NotOwnerException> {

    @Override
    public java.security.acl.NotOwnerException createNewSUT() {
        return new java.security.acl.NotOwnerException();
    }

}
