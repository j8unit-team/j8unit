package org.j8unit.repository.java.awt;

import java.awt.LayoutManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LayoutManager} (by simply reusing the
 * J8Unit test interface {@link LayoutManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class LayoutManagerClassTest
implements LayoutManagerClassTests<LayoutManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.LayoutManager]

    @Override
    public Class<LayoutManager> createNewSUT() {
        return LayoutManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.LayoutManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.LayoutManager]

}
