package org.j8unit.repository.java.util.function;

import java.util.function.ToIntFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ToIntFunction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.ToIntFunctionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ToIntFunctionClassTest
implements ToIntFunctionClassTests<ToIntFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.ToIntFunction]

    @Override
    public Class<ToIntFunction> createNewSUT() {
        return ToIntFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.ToIntFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.ToIntFunction]

}
