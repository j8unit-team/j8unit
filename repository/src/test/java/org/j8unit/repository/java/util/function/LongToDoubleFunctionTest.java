package org.j8unit.repository.java.util.function;

import java.util.function.LongToDoubleFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LongToDoubleFunction} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.function.LongToDoubleFunctionTests}).
 */
@RunWith(J8Unit4.class)
public class LongToDoubleFunctionTest
implements LongToDoubleFunctionTests<LongToDoubleFunction> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.LongToDoubleFunction]

    @Override
    public LongToDoubleFunction createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.LongToDoubleFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.LongToDoubleFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.LongToDoubleFunction]

}
