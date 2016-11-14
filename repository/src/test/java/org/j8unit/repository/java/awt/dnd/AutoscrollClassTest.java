package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.Autoscroll;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Autoscroll} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.dnd.AutoscrollClassTests}).
 */

@RunWith(J8Unit4.class)
public class AutoscrollClassTest
implements AutoscrollClassTests<Autoscroll> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.Autoscroll]

    @Override
    public Class<Autoscroll> createNewSUT() {
        return Autoscroll.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.Autoscroll]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.Autoscroll]

}
