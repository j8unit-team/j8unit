package org.j8unit.repository.java.security.acl;

import java.security.acl.Group;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GroupClassTest
implements org.j8unit.repository.java.security.acl.GroupClassTests<Group> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.Group]

    @Override
    public Class<Group> createNewSUT() {
        return Group.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.acl.Group]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.Group]

}
