package org.j8unit.repository.java.util.function;

import java.util.function.LongUnaryOperator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongUnaryOperator} (by simply reusing the
 * J8Unit test interface {@link LongUnaryOperatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class LongUnaryOperatorClassTest
implements LongUnaryOperatorClassTests<LongUnaryOperator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongUnaryOperator]

    @Override
    public Class<LongUnaryOperator> createNewSUT() {
        return LongUnaryOperator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.function.LongUnaryOperator#identity()
     * public static java.util.function.LongUnaryOperator java.util.function.LongUnaryOperator.identity()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_identity()
    throws Exception {
        // write some test for {@link java.util.function.LongUnaryOperator#identity()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.LongUnaryOperator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongUnaryOperator]

}
