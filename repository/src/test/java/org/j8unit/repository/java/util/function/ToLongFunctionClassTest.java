package org.j8unit.repository.java.util.function;

import java.util.function.ToLongFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ToLongFunction} (by simply reusing the
 * J8Unit test interface {@link ToLongFunctionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ToLongFunctionClassTest
implements ToLongFunctionClassTests<ToLongFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.ToLongFunction]

    @Override
    public Class<ToLongFunction> createNewSUT() {
        return ToLongFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.ToLongFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.ToLongFunction]

}
