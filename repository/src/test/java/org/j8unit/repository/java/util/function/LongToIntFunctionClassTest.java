package org.j8unit.repository.java.util.function;

import java.util.function.LongToIntFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongToIntFunction} (by simply reusing the
 * J8Unit test interface {@link LongToIntFunctionClassTests}).
 */

@RunWith(J8Unit4.class)
public class LongToIntFunctionClassTest
implements LongToIntFunctionClassTests<LongToIntFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongToIntFunction]

    @Override
    public Class<LongToIntFunction> createNewSUT() {
        return LongToIntFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.LongToIntFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongToIntFunction]

}
