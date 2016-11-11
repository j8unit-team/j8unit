package org.j8unit.repository.java.util.function;

import java.util.function.ToDoubleFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ToDoubleFunction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.ToDoubleFunctionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ToDoubleFunctionClassTest
implements ToDoubleFunctionClassTests<ToDoubleFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.ToDoubleFunction]

    @Override
    public Class<ToDoubleFunction> createNewSUT() {
        return ToDoubleFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.ToDoubleFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.ToDoubleFunction]

}
