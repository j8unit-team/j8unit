package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.FlavorListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FlavorListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.datatransfer.FlavorListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class FlavorListenerClassTest
implements FlavorListenerClassTests<FlavorListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.datatransfer.FlavorListener]

    @Override
    public Class<FlavorListener> createNewSUT() {
        return FlavorListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.datatransfer.FlavorListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.datatransfer.FlavorListener]

}
