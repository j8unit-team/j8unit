package org.j8unit.repository.java.security.acl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OwnerClassTest
implements org.j8unit.repository.java.security.acl.OwnerClassTests<java.security.acl.Owner> {

    @Override
    public Class<java.security.acl.Owner> createNewSUT() {
        return java.security.acl.Owner.class;
    }

}
