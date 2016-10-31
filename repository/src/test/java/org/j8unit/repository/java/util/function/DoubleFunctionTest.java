package org.j8unit.repository.java.util.function;

import java.util.function.DoubleFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleFunctionTest<R>
implements org.j8unit.repository.java.util.function.DoubleFunctionTests<DoubleFunction<R>, R> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.DoubleFunction]

    @Override
    public DoubleFunction<R> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.DoubleFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.DoubleFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.DoubleFunction]

}
