package org.j8unit.repository.java.time.temporal;

import java.time.temporal.Temporal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Temporal} (by simply reusing the J8Unit
 * test interface {@link TemporalClassTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalClassTest
implements TemporalClassTests<Temporal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.Temporal]

    @Override
    public Class<Temporal> createNewSUT() {
        return Temporal.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.Temporal]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.Temporal]

}
