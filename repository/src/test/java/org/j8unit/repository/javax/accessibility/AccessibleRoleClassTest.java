package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleRole;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleRole} (by simply reusing the
 * J8Unit test interface {@link AccessibleRoleClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleRoleClassTest
implements AccessibleRoleClassTests<AccessibleRole> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleRole]

    @Override
    public Class<AccessibleRole> createNewSUT() {
        return AccessibleRole.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleRole]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleRole]

}
