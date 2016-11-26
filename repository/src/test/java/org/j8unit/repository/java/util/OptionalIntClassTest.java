package org.j8unit.repository.java.util;

import java.util.OptionalInt;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OptionalInt} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.OptionalIntClassTests}).
 */
@RunWith(J8Unit4.class)
public class OptionalIntClassTest
implements OptionalIntClassTests<OptionalInt> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.OptionalInt]

    @Override
    public Class<OptionalInt> createNewSUT() {
        return OptionalInt.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.OptionalInt#empty() public static
     * java.util.OptionalInt java.util.OptionalInt.empty()}.
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
    public void test_empty()
    throws Exception {
        // write some test for {@link java.util.OptionalInt#empty()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.OptionalInt#of(int) public static
     * java.util.OptionalInt java.util.OptionalInt.of(int)}.
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
    public void test_of_int()
    throws Exception {
        // write some test for {@link java.util.OptionalInt#of(int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.OptionalInt]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.OptionalInt]

}
