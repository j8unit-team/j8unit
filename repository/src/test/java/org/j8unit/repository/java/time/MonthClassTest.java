package org.j8unit.repository.java.time;

import java.time.Month;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Month} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.time.MonthClassTests}).
 */

@RunWith(J8Unit4.class)
public class MonthClassTest
implements MonthClassTests<Month> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.Month]

    @Override
    public Class<Month> createNewSUT() {
        return Month.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Month#values() public static
     * java.time.Month[] java.time.Month.values()}.
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
    public void test_values()
    throws Exception {
        // write some test for {@link java.time.Month#values()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Month#of(int) public static
     * java.time.Month java.time.Month.of(int)}.
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
        // write some test for {@link java.time.Month#of(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Month#valueOf(String) public static
     * java.time.Month java.time.Month.valueOf(java.lang.String)}.
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
    public void test_valueOf_String()
    throws Exception {
        // write some test for {@link java.time.Month#valueOf(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.Month#from(java.time.temporal.TemporalAccessor) public static java.time.Month
     * java.time.Month.from(java.time.temporal.TemporalAccessor)}.
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
    public void test_from_TemporalAccessor()
    throws Exception {
        // write some test for {@link java.time.Month#from(java.time.temporal.TemporalAccessor)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.Month]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.Month]

}
