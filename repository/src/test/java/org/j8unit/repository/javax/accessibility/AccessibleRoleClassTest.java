package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleRole;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleRoleClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleRoleClassTests<AccessibleRole> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleRole]

    @Override
    public Class<AccessibleRole> createNewSUT() {
        return AccessibleRole.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleRole]

}
