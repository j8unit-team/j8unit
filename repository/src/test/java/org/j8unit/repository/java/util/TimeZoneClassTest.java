package org.j8unit.repository.java.util;

import static org.junit.Assert.fail;
import java.time.ZoneId;
import java.util.TimeZone;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeZoneClassTest
implements org.j8unit.repository.java.util.TimeZoneClassTests<TimeZone> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.TimeZone]

    @Override
    public Class<TimeZone> createNewSUT() {
        return TimeZone.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TimeZone#TimeZone() public
     * java.util.TimeZone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_TimeZone()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link TimeZone#getTimeZone(String) public static
     * synchronized java.util.TimeZone java.util.TimeZone.getTimeZone(java.lang.String)}.
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
    public void test_getTimeZone_String()
    throws Exception {
        // write some test for {@link TimeZone#getTimeZone(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link TimeZone#getTimeZone(ZoneId) public static
     * java.util.TimeZone java.util.TimeZone.getTimeZone(java.time.ZoneId)}.
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
    public void test_getTimeZone_ZoneId()
    throws Exception {
        // write some test for {@link TimeZone#getTimeZone(ZoneId)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link TimeZone#getAvailableIDs(int) public static
     * synchronized java.lang.String[] java.util.TimeZone.getAvailableIDs(int)}.
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
    public void test_getAvailableIDs_int()
    throws Exception {
        // write some test for {@link TimeZone#getAvailableIDs(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link TimeZone#getAvailableIDs() public static
     * synchronized java.lang.String[] java.util.TimeZone.getAvailableIDs()}.
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
    public void test_getAvailableIDs()
    throws Exception {
        // write some test for {@link TimeZone#getAvailableIDs()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link TimeZone#setDefault(TimeZone) public static void
     * java.util.TimeZone.setDefault(java.util.TimeZone)}.
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
    public void test_setDefault_TimeZone()
    throws Exception {
        // write some test for {@link TimeZone#setDefault(TimeZone)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link TimeZone#getDefault() public static
     * java.util.TimeZone java.util.TimeZone.getDefault()}.
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
    public void test_getDefault()
    throws Exception {
        // write some test for {@link TimeZone#getDefault()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.TimeZone]

}
