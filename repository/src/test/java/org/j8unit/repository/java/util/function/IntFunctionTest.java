package org.j8unit.repository.java.util.function;

import java.util.function.IntFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntFunctionTest<R>
implements org.j8unit.repository.java.util.function.IntFunctionTests<IntFunction<R>, R> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.IntFunction]

    @Override
    public IntFunction<R> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.IntFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.IntFunction]

}
