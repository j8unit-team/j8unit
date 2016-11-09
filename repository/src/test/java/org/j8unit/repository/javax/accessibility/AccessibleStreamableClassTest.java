package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleStreamable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleStreamable} (by simply reusing
 * the J8Unit test interface {@link AccessibleStreamableClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleStreamableClassTest
implements AccessibleStreamableClassTests<AccessibleStreamable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleStreamable]

    @Override
    public Class<AccessibleStreamable> createNewSUT() {
        return AccessibleStreamable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleStreamable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleStreamable]

}
