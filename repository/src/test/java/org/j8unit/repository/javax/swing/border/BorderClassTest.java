package org.j8unit.repository.javax.swing.border;

import javax.swing.border.Border;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Border} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.border.BorderClassTests}).
 */

@RunWith(J8Unit4.class)
public class BorderClassTest
implements BorderClassTests<Border> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.border.Border]

    @Override
    public Class<Border> createNewSUT() {
        return Border.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.border.Border]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.border.Border]

}
