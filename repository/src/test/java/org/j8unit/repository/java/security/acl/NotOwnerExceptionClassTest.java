package org.j8unit.repository.java.security.acl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotOwnerExceptionClassTest
implements org.j8unit.repository.java.security.acl.NotOwnerExceptionClassTests<java.security.acl.NotOwnerException> {

    @Override
    public Class<java.security.acl.NotOwnerException> createNewSUT() {
        return java.security.acl.NotOwnerException.class;
    }

}
