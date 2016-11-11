package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.ReverbType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ReverbType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.ReverbTypeTests}).
 */

@RunWith(J8Unit4.class)
public class ReverbTypeTest
implements ReverbTypeTests<ReverbType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.ReverbType]

    @Override
    public ReverbType createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.sampled.ReverbType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.ReverbType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.ReverbType]

}
