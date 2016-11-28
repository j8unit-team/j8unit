package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleAction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleActionClassTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleActionClassTest
implements AccessibleActionClassTests<AccessibleAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleAction]

    @Override
    public Class<AccessibleAction> createNewSUT() {
        return AccessibleAction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleAction]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleAction]

}
