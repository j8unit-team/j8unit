package org.j8unit.repository.java.util.function;

import java.util.function.UnaryOperator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class UnaryOperatorClassTest
implements org.j8unit.repository.java.util.function.UnaryOperatorClassTests<UnaryOperator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.UnaryOperator]

    @Override
    public Class<UnaryOperator> createNewSUT() {
        return UnaryOperator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link UnaryOperator#identity() public static
     * <T> java.util.function.UnaryOperator<T> java.util.function.UnaryOperator.identity()}.
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
        // write some test for {@link UnaryOperator#identity()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.UnaryOperator]

}
