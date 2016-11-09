package org.j8unit.repository.java.security.acl;

import java.security.acl.Group;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Group} (by simply reusing the J8Unit test
 * interface {@link GroupClassTests}).
 */

@RunWith(J8Unit4.class)
public class GroupClassTest
implements GroupClassTests<Group> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.Group]

    @Override
    public Class<Group> createNewSUT() {
        return Group.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.acl.Group]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.Group]

}
