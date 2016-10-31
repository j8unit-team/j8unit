package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RoleUnresolved;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleUnresolvedTest
implements org.j8unit.repository.javax.management.relation.RoleUnresolvedTests<RoleUnresolved> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RoleUnresolved]

    @Override
    public RoleUnresolved createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.relation.RoleUnresolved], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.RoleUnresolved]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.RoleUnresolved]

}
