package org.j8unit.repository.java.util.function;

import java.util.function.LongBinaryOperator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LongBinaryOperator} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.function.LongBinaryOperatorTests}).
 */
@RunWith(J8Unit4.class)
public class LongBinaryOperatorTest
implements LongBinaryOperatorTests<LongBinaryOperator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.LongBinaryOperator]

    @Override
    public LongBinaryOperator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.LongBinaryOperator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.LongBinaryOperator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.LongBinaryOperator]

}
