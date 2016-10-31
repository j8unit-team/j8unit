package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleState;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleStateClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleStateClassTests<AccessibleState> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleState]

    @Override
    public Class<AccessibleState> createNewSUT() {
        return AccessibleState.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleState]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleState]

}
