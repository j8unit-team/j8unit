package org.j8unit.repository.java.util.function;

import java.util.function.LongConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LongConsumer} (by simply reusing the
 * J8Unit test interface {@link LongConsumerTests}).
 */

@RunWith(J8Unit4.class)
public class LongConsumerTest
implements LongConsumerTests<LongConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.LongConsumer]

    @Override
    public LongConsumer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.LongConsumer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.LongConsumer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.LongConsumer]

}
