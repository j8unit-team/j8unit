package org.j8unit.repository.java.util.function;

import java.util.function.LongBinaryOperator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongBinaryOperator} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.LongBinaryOperatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class LongBinaryOperatorClassTest
implements LongBinaryOperatorClassTests<LongBinaryOperator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongBinaryOperator]

    @Override
    public Class<LongBinaryOperator> createNewSUT() {
        return LongBinaryOperator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.LongBinaryOperator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongBinaryOperator]

}
