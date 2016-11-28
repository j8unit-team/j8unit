package org.j8unit.repository.javax.swing;

import javax.swing.SwingConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SwingConstants} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.SwingConstantsClassTests}).
 */
@RunWith(J8Unit4.class)
public class SwingConstantsClassTest
implements SwingConstantsClassTests<SwingConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SwingConstants]

    @Override
    public Class<SwingConstants> createNewSUT() {
        return SwingConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.SwingConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SwingConstants]

}
