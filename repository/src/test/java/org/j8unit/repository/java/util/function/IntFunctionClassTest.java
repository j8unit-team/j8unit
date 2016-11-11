package org.j8unit.repository.java.util.function;

import java.util.function.IntFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntFunction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.IntFunctionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class IntFunctionClassTest
implements IntFunctionClassTests<IntFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.IntFunction]

    @Override
    public Class<IntFunction> createNewSUT() {
        return IntFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.IntFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.IntFunction]

}
