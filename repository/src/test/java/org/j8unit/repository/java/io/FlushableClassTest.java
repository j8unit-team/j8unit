package org.j8unit.repository.java.io;

import java.io.Flushable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Flushable} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.io.FlushableClassTests}).
 */

@RunWith(J8Unit4.class)
public class FlushableClassTest
implements FlushableClassTests<Flushable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Flushable]

    @Override
    public Class<Flushable> createNewSUT() {
        return Flushable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.Flushable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Flushable]

}
