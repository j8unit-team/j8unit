package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleActionClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleActionClassTests<AccessibleAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleAction]

    @Override
    public Class<AccessibleAction> createNewSUT() {
        return AccessibleAction.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleAction]

}
