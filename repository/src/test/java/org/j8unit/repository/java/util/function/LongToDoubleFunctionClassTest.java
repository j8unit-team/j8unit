package org.j8unit.repository.java.util.function;

import java.util.function.LongToDoubleFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongToDoubleFunction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.LongToDoubleFunctionClassTests}).
 */

@RunWith(J8Unit4.class)
public class LongToDoubleFunctionClassTest
implements LongToDoubleFunctionClassTests<LongToDoubleFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongToDoubleFunction]

    @Override
    public Class<LongToDoubleFunction> createNewSUT() {
        return LongToDoubleFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.LongToDoubleFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongToDoubleFunction]

}
