package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalField;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TemporalField} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalFieldClassTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalFieldClassTest
implements TemporalFieldClassTests<TemporalField> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.TemporalField]

    @Override
    public Class<TemporalField> createNewSUT() {
        return TemporalField.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.TemporalField]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.TemporalField]

}
