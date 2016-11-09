package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalAmount;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TemporalAmount} (by simply reusing the
 * J8Unit test interface {@link TemporalAmountClassTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalAmountClassTest
implements TemporalAmountClassTests<TemporalAmount> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.TemporalAmount]

    @Override
    public Class<TemporalAmount> createNewSUT() {
        return TemporalAmount.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.TemporalAmount]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.TemporalAmount]

}
