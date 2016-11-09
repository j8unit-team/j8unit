package org.j8unit.repository.javax.swing;

import javax.swing.Scrollable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Scrollable} (by simply reusing the J8Unit
 * test interface {@link ScrollableClassTests}).
 */

@RunWith(J8Unit4.class)
public class ScrollableClassTest
implements ScrollableClassTests<Scrollable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Scrollable]

    @Override
    public Class<Scrollable> createNewSUT() {
        return Scrollable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.Scrollable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Scrollable]

}
