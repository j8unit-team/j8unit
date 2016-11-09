package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.TimeUnit;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TimeUnit} (by simply reusing the J8Unit
 * test interface {@link TimeUnitClassTests}).
 */

@RunWith(J8Unit4.class)
public class TimeUnitClassTest
implements TimeUnitClassTests<TimeUnit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.TimeUnit]

    @Override
    public Class<TimeUnit> createNewSUT() {
        return TimeUnit.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.concurrent.TimeUnit#valueOf(String) public
     * static java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit.valueOf(java.lang.String)}.
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
        // write some test for {@link java.util.concurrent.TimeUnit#valueOf(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.concurrent.TimeUnit#values() public static
     * java.util.concurrent.TimeUnit[] java.util.concurrent.TimeUnit.values()}.
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
        // write some test for {@link java.util.concurrent.TimeUnit#values()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.TimeUnit]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.TimeUnit]

}
