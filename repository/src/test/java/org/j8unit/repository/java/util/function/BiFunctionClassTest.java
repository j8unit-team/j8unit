package org.j8unit.repository.java.util.function;

import java.util.function.BiFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BiFunction} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.function.BiFunctionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BiFunctionClassTest
implements BiFunctionClassTests<BiFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.BiFunction]

    @Override
    public Class<BiFunction> createNewSUT() {
        return BiFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.BiFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.BiFunction]

}
