package org.j8unit.repository.java.util.function;

import java.util.function.BiConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BiConsumer} (by simply reusing the
 * J8Unit test interface {@link BiConsumerTests}).
 */

@RunWith(J8Unit4.class)
public class BiConsumerTest<T, U>
implements BiConsumerTests<BiConsumer<T, U>, T, U> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.BiConsumer]

    @Override
    public BiConsumer<T, U> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.BiConsumer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.BiConsumer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.BiConsumer]

}
