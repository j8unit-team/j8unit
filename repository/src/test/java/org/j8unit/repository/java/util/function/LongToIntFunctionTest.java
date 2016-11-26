package org.j8unit.repository.java.util.function;

import java.util.function.LongToIntFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LongToIntFunction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.LongToIntFunctionTests}).
 */
@RunWith(J8Unit4.class)
public class LongToIntFunctionTest
implements LongToIntFunctionTests<LongToIntFunction> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.LongToIntFunction]

    @Override
    public LongToIntFunction createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.LongToIntFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.LongToIntFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.LongToIntFunction]

}
