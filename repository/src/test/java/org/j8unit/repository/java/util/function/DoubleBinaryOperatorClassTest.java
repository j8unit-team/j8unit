package org.j8unit.repository.java.util.function;

import java.util.function.DoubleBinaryOperator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DoubleBinaryOperator} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.DoubleBinaryOperatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class DoubleBinaryOperatorClassTest
implements DoubleBinaryOperatorClassTests<DoubleBinaryOperator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.DoubleBinaryOperator]

    @Override
    public Class<DoubleBinaryOperator> createNewSUT() {
        return DoubleBinaryOperator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.DoubleBinaryOperator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.DoubleBinaryOperator]

}
