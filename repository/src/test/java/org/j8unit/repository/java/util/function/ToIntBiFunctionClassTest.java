package org.j8unit.repository.java.util.function;

import java.util.function.ToIntBiFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ToIntBiFunction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.ToIntBiFunctionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ToIntBiFunctionClassTest
implements ToIntBiFunctionClassTests<ToIntBiFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.ToIntBiFunction]

    @Override
    public Class<ToIntBiFunction> createNewSUT() {
        return ToIntBiFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.ToIntBiFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.ToIntBiFunction]

}
