package org.j8unit.repository.java.util.function;

import java.util.function.IntToDoubleFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntToDoubleFunction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.IntToDoubleFunctionClassTests}).
 */
@RunWith(J8Unit4.class)
public class IntToDoubleFunctionClassTest
implements IntToDoubleFunctionClassTests<IntToDoubleFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.IntToDoubleFunction]

    @Override
    public Class<IntToDoubleFunction> createNewSUT() {
        return IntToDoubleFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.IntToDoubleFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.IntToDoubleFunction]

}
