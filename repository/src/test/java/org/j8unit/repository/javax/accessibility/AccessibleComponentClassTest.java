package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleComponent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleComponentClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleComponentClassTests<AccessibleComponent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleComponent]

    @Override
    public Class<AccessibleComponent> createNewSUT() {
        return AccessibleComponent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleComponent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleComponent]

}
