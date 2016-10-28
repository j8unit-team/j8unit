package org.j8unit.repository.java.security.acl;

import java.security.acl.Group;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GroupTest
implements org.j8unit.repository.java.security.acl.GroupTests<Group> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.Group]

    @Override
    public Group createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.acl.Group], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.Group]

}
