package org.j8unit.repository.java.time;

import java.time.Clock;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Clock} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.time.ClockClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClockClassTest
implements ClockClassTests<Clock> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.Clock]

    @Override
    public Class<Clock> createNewSUT() {
        return Clock.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Clock#systemUTC() public static
     * java.time.Clock java.time.Clock.systemUTC()}.
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
    public void test_systemUTC()
    throws Exception {
        // write some test for {@link java.time.Clock#systemUTC()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Clock#systemDefaultZone() public static
     * java.time.Clock java.time.Clock.systemDefaultZone()}.
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
    public void test_systemDefaultZone()
    throws Exception {
        // write some test for {@link java.time.Clock#systemDefaultZone()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Clock#tickSeconds(java.time.ZoneId) public
     * static java.time.Clock java.time.Clock.tickSeconds(java.time.ZoneId)}.
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
    public void test_tickSeconds_ZoneId()
    throws Exception {
        // write some test for {@link java.time.Clock#tickSeconds(java.time.ZoneId)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.Clock#tick(java.time.Clock, java.time.Duration) public static java.time.Clock
     * java.time.Clock.tick(java.time.Clock,java.time.Duration)}.
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
    public void test_tick_Clock_Duration()
    throws Exception {
        // write some test for {@link java.time.Clock#tick(java.time.Clock, java.time.Duration)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.Clock#fixed(java.time.Instant, java.time.ZoneId) public static java.time.Clock
     * java.time.Clock.fixed(java.time.Instant,java.time.ZoneId)}.
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
    public void test_fixed_Instant_ZoneId()
    throws Exception {
        // write some test for {@link java.time.Clock#fixed(java.time.Instant, java.time.ZoneId)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Clock#system(java.time.ZoneId) public
     * static java.time.Clock java.time.Clock.system(java.time.ZoneId)}.
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
    public void test_system_ZoneId()
    throws Exception {
        // write some test for {@link java.time.Clock#system(java.time.ZoneId)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Clock#tickMinutes(java.time.ZoneId) public
     * static java.time.Clock java.time.Clock.tickMinutes(java.time.ZoneId)}.
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
    public void test_tickMinutes_ZoneId()
    throws Exception {
        // write some test for {@link java.time.Clock#tickMinutes(java.time.ZoneId)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.Clock#offset(java.time.Clock, java.time.Duration) public static java.time.Clock
     * java.time.Clock.offset(java.time.Clock,java.time.Duration)}.
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
    public void test_offset_Clock_Duration()
    throws Exception {
        // write some test for {@link java.time.Clock#offset(java.time.Clock, java.time.Duration)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.Clock]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.Clock]

}
