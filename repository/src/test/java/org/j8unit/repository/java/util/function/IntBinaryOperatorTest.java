package org.j8unit.repository.java.util.function;

import java.util.function.IntBinaryOperator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IntBinaryOperator} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.IntBinaryOperatorTests}).
 */
@RunWith(J8Unit4.class)
public class IntBinaryOperatorTest
implements IntBinaryOperatorTests<IntBinaryOperator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.IntBinaryOperator]

    @Override
    public IntBinaryOperator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.IntBinaryOperator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.IntBinaryOperator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.IntBinaryOperator]

}
