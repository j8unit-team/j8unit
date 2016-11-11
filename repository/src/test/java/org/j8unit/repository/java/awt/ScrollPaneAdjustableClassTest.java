package org.j8unit.repository.java.awt;

import java.awt.ScrollPaneAdjustable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ScrollPaneAdjustable} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.ScrollPaneAdjustableClassTests}).
 */

@RunWith(J8Unit4.class)
public class ScrollPaneAdjustableClassTest
implements ScrollPaneAdjustableClassTests<ScrollPaneAdjustable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.ScrollPaneAdjustable]

    @Override
    public Class<ScrollPaneAdjustable> createNewSUT() {
        return ScrollPaneAdjustable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.ScrollPaneAdjustable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.ScrollPaneAdjustable]

}
