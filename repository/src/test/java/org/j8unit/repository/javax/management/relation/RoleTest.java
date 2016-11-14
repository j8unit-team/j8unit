package org.j8unit.repository.javax.management.relation;

import javax.management.relation.Role;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Role} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.management.relation.RoleTests}).
 */

@RunWith(J8Unit4.class)
public class RoleTest
implements RoleTests<Role> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.Role]

    @Override
    public Role createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.relation.Role], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.Role]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.Role]

}
