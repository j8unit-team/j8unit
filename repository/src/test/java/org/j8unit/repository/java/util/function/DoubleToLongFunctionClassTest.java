package org.j8unit.repository.java.util.function;

import java.util.function.DoubleToLongFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DoubleToLongFunction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.DoubleToLongFunctionClassTests}).
 */

@RunWith(J8Unit4.class)
public class DoubleToLongFunctionClassTest
implements DoubleToLongFunctionClassTests<DoubleToLongFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.DoubleToLongFunction]

    @Override
    public Class<DoubleToLongFunction> createNewSUT() {
        return DoubleToLongFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.DoubleToLongFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.DoubleToLongFunction]

}
