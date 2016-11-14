package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleHypertext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleHypertext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleHypertextClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleHypertextClassTest
implements AccessibleHypertextClassTests<AccessibleHypertext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleHypertext]

    @Override
    public Class<AccessibleHypertext> createNewSUT() {
        return AccessibleHypertext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleHypertext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleHypertext]

}
