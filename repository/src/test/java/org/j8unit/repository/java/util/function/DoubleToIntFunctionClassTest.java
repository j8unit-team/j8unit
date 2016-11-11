package org.j8unit.repository.java.util.function;

import java.util.function.DoubleToIntFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DoubleToIntFunction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.DoubleToIntFunctionClassTests}).
 */

@RunWith(J8Unit4.class)
public class DoubleToIntFunctionClassTest
implements DoubleToIntFunctionClassTests<DoubleToIntFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.DoubleToIntFunction]

    @Override
    public Class<DoubleToIntFunction> createNewSUT() {
        return DoubleToIntFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.DoubleToIntFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.DoubleToIntFunction]

}
