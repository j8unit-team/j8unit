package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleSelection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleSelectionClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleSelectionClassTests<AccessibleSelection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleSelection]

    @Override
    public Class<AccessibleSelection> createNewSUT() {
        return AccessibleSelection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleSelection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleSelection]

}
