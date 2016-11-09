package org.j8unit.repository.java.util.function;

import java.util.function.BiFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BiFunction} (by simply reusing the
 * J8Unit test interface {@link BiFunctionTests}).
 */

@RunWith(J8Unit4.class)
public class BiFunctionTest<T, U, R>
implements BiFunctionTests<BiFunction<T, U, R>, T, U, R> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.BiFunction]

    @Override
    public BiFunction<T, U, R> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.BiFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.BiFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.BiFunction]

}
