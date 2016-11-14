package org.j8unit.repository.java.util.function;

import java.util.function.LongFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongFunction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.LongFunctionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class LongFunctionClassTest
implements LongFunctionClassTests<LongFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongFunction]

    @Override
    public Class<LongFunction> createNewSUT() {
        return LongFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.LongFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongFunction]

}
