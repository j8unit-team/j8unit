package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RoleInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleInfoTest
implements org.j8unit.repository.javax.management.relation.RoleInfoTests<RoleInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RoleInfo]

    @Override
    public RoleInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.relation.RoleInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.RoleInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.RoleInfo]

}
