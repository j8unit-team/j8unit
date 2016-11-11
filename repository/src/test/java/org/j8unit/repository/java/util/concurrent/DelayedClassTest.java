package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Delayed;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Delayed} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.concurrent.DelayedClassTests}).
 */

@RunWith(J8Unit4.class)
public class DelayedClassTest
implements DelayedClassTests<Delayed> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Delayed]

    @Override
    public Class<Delayed> createNewSUT() {
        return Delayed.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.Delayed]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Delayed]

}
