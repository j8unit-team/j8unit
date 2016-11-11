package org.j8unit.repository.java.util.function;

import java.util.function.IntBinaryOperator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntBinaryOperator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.IntBinaryOperatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class IntBinaryOperatorClassTest
implements IntBinaryOperatorClassTests<IntBinaryOperator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.IntBinaryOperator]

    @Override
    public Class<IntBinaryOperator> createNewSUT() {
        return IntBinaryOperator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.IntBinaryOperator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.IntBinaryOperator]

}
