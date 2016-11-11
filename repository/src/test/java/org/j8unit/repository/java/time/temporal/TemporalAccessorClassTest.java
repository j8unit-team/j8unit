package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalAccessor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TemporalAccessor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalAccessorClassTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalAccessorClassTest
implements TemporalAccessorClassTests<TemporalAccessor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.TemporalAccessor]

    @Override
    public Class<TemporalAccessor> createNewSUT() {
        return TemporalAccessor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.TemporalAccessor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.TemporalAccessor]

}
