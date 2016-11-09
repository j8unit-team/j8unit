package org.j8unit.repository.java.util;

import java.util.OptionalInt;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OptionalInt} (by simply reusing the
 * J8Unit test interface {@link OptionalIntTests}).
 */

@RunWith(J8Unit4.class)
public class OptionalIntTest
implements OptionalIntTests<OptionalInt> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.OptionalInt]

    @Override
    public OptionalInt createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.OptionalInt], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.OptionalInt]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.OptionalInt]

}
