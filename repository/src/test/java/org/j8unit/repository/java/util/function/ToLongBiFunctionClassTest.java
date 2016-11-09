package org.j8unit.repository.java.util.function;

import java.util.function.ToLongBiFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ToLongBiFunction} (by simply reusing the
 * J8Unit test interface {@link ToLongBiFunctionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ToLongBiFunctionClassTest
implements ToLongBiFunctionClassTests<ToLongBiFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.ToLongBiFunction]

    @Override
    public Class<ToLongBiFunction> createNewSUT() {
        return ToLongBiFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.ToLongBiFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.ToLongBiFunction]

}
