package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleIcon;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleIcon} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleIconClassTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleIconClassTest
implements AccessibleIconClassTests<AccessibleIcon> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleIcon]

    @Override
    public Class<AccessibleIcon> createNewSUT() {
        return AccessibleIcon.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleIcon]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleIcon]

}
