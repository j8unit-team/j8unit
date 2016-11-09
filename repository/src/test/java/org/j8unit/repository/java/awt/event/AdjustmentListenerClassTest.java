package org.j8unit.repository.java.awt.event;

import java.awt.event.AdjustmentListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AdjustmentListener} (by simply reusing
 * the J8Unit test interface {@link AdjustmentListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class AdjustmentListenerClassTest
implements AdjustmentListenerClassTests<AdjustmentListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.AdjustmentListener]

    @Override
    public Class<AdjustmentListener> createNewSUT() {
        return AdjustmentListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.AdjustmentListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.AdjustmentListener]

}
