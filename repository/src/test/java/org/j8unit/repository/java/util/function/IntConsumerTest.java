package org.j8unit.repository.java.util.function;

import java.util.function.IntConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IntConsumer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.IntConsumerTests}).
 */
@RunWith(J8Unit4.class)
public class IntConsumerTest
implements IntConsumerTests<IntConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.IntConsumer]

    @Override
    public IntConsumer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.IntConsumer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.IntConsumer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.IntConsumer]

}
