package org.j8unit.repository.java.awt;

import java.awt.SecondaryLoop;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SecondaryLoop} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.SecondaryLoopClassTests}).
 */
@RunWith(J8Unit4.class)
public class SecondaryLoopClassTest
implements SecondaryLoopClassTests<SecondaryLoop> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.SecondaryLoop]

    @Override
    public Class<SecondaryLoop> createNewSUT() {
        return SecondaryLoop.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.SecondaryLoop]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.SecondaryLoop]

}
