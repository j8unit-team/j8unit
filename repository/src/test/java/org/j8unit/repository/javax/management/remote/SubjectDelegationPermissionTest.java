package org.j8unit.repository.javax.management.remote;

import javax.management.remote.SubjectDelegationPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SubjectDelegationPermission} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.remote.SubjectDelegationPermissionTests}).
 */
@RunWith(J8Unit4.class)
public class SubjectDelegationPermissionTest
implements SubjectDelegationPermissionTests<SubjectDelegationPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.SubjectDelegationPermission]

    @Override
    public SubjectDelegationPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.remote.SubjectDelegationPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.SubjectDelegationPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.SubjectDelegationPermission]

}
