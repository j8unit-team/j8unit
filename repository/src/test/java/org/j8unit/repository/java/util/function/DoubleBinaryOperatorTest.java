package org.j8unit.repository.java.util.function;

import java.util.function.DoubleBinaryOperator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DoubleBinaryOperator} (by simply
 * reusing the J8Unit test interface {@link DoubleBinaryOperatorTests}).
 */

@RunWith(J8Unit4.class)
public class DoubleBinaryOperatorTest
implements DoubleBinaryOperatorTests<DoubleBinaryOperator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.DoubleBinaryOperator]

    @Override
    public DoubleBinaryOperator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.DoubleBinaryOperator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.DoubleBinaryOperator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.DoubleBinaryOperator]

}
