package org.j8unit.repository.java.util.function;

import java.util.function.IntToLongFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntToLongFunction} (by simply reusing the
 * J8Unit test interface {@link IntToLongFunctionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IntToLongFunctionClassTest
implements IntToLongFunctionClassTests<IntToLongFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.IntToLongFunction]

    @Override
    public Class<IntToLongFunction> createNewSUT() {
        return IntToLongFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.IntToLongFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.IntToLongFunction]

}
