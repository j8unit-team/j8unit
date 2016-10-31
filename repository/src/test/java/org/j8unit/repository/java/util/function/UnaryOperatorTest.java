package org.j8unit.repository.java.util.function;

import java.util.function.UnaryOperator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnaryOperatorTest<T>
implements org.j8unit.repository.java.util.function.UnaryOperatorTests<UnaryOperator<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.UnaryOperator]

    @Override
    public UnaryOperator<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.UnaryOperator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.UnaryOperator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.UnaryOperator]

}
