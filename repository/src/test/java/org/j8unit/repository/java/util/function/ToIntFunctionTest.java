package org.j8unit.repository.java.util.function;

import java.util.function.ToIntFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToIntFunctionTest<T>
implements org.j8unit.repository.java.util.function.ToIntFunctionTests<ToIntFunction<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ToIntFunction]

    @Override
    public ToIntFunction<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.ToIntFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.ToIntFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.ToIntFunction]

}
