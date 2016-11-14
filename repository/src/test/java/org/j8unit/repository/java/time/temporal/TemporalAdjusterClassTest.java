package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalAdjuster;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TemporalAdjuster} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalAdjusterClassTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalAdjusterClassTest
implements TemporalAdjusterClassTests<TemporalAdjuster> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.TemporalAdjuster]

    @Override
    public Class<TemporalAdjuster> createNewSUT() {
        return TemporalAdjuster.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.TemporalAdjuster]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.TemporalAdjuster]

}
