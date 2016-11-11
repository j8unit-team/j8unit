package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleSelection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleSelection} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleSelectionClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleSelectionClassTest
implements AccessibleSelectionClassTests<AccessibleSelection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleSelection]

    @Override
    public Class<AccessibleSelection> createNewSUT() {
        return AccessibleSelection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleSelection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleSelection]

}
