package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleActionClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleActionClassTests<javax.accessibility.AccessibleAction> {

    @Override
    public Class<javax.accessibility.AccessibleAction> createNewSUT() {
        return javax.accessibility.AccessibleAction.class;
    }

}
