package org.j8unit.repository.java.util.function;

import java.util.function.ToLongFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ToLongFunction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.ToLongFunctionTests}).
 */

@RunWith(J8Unit4.class)
public class ToLongFunctionTest<T>
implements ToLongFunctionTests<ToLongFunction<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ToLongFunction]

    @Override
    public ToLongFunction<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.ToLongFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.ToLongFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.ToLongFunction]

}
