package org.j8unit.repository.java.util.function;

import java.util.function.ToDoubleBiFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ToDoubleBiFunction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.ToDoubleBiFunctionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ToDoubleBiFunctionClassTest
implements ToDoubleBiFunctionClassTests<ToDoubleBiFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.ToDoubleBiFunction]

    @Override
    public Class<ToDoubleBiFunction> createNewSUT() {
        return ToDoubleBiFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.ToDoubleBiFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.ToDoubleBiFunction]

}
