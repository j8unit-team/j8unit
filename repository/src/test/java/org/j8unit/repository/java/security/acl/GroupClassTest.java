package org.j8unit.repository.java.security.acl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GroupClassTest
implements org.j8unit.repository.java.security.acl.GroupClassTests<java.security.acl.Group> {

    @Override
    public Class<java.security.acl.Group> createNewSUT() {
        return java.security.acl.Group.class;
    }

}
