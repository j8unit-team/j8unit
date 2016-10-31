package org.j8unit.repository.java.util.function;

import java.util.function.Function;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FunctionTest<T, R>
implements org.j8unit.repository.java.util.function.FunctionTests<Function<T, R>, T, R> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.Function]

    @Override
    public Function<T, R> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.Function], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.Function]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.Function]

}
