package org.j8unit.repository.java.util.function;

import java.util.function.LongFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LongFunction} (by simply reusing the
 * J8Unit test interface {@link LongFunctionTests}).
 */

@RunWith(J8Unit4.class)
public class LongFunctionTest<R>
implements LongFunctionTests<LongFunction<R>, R> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.LongFunction]

    @Override
    public LongFunction<R> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.LongFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.LongFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.LongFunction]

}
