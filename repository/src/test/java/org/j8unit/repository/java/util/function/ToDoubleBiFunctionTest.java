package org.j8unit.repository.java.util.function;

import java.util.function.ToDoubleBiFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ToDoubleBiFunction} (by simply
 * reusing the J8Unit test interface {@link ToDoubleBiFunctionTests}).
 */

@RunWith(J8Unit4.class)
public class ToDoubleBiFunctionTest<T, U>
implements ToDoubleBiFunctionTests<ToDoubleBiFunction<T, U>, T, U> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ToDoubleBiFunction]

    @Override
    public ToDoubleBiFunction<T, U> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.ToDoubleBiFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.ToDoubleBiFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.ToDoubleBiFunction]

}
