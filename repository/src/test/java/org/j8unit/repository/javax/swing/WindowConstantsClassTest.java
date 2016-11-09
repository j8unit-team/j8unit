package org.j8unit.repository.javax.swing;

import javax.swing.WindowConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WindowConstants} (by simply reusing the
 * J8Unit test interface {@link WindowConstantsClassTests}).
 */

@RunWith(J8Unit4.class)
public class WindowConstantsClassTest
implements WindowConstantsClassTests<WindowConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.WindowConstants]

    @Override
    public Class<WindowConstants> createNewSUT() {
        return WindowConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.WindowConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.WindowConstants]

}
