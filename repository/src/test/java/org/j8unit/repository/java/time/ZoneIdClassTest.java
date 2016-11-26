package org.j8unit.repository.java.time;

import java.time.ZoneId;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ZoneId} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.time.ZoneIdClassTests}).
 */
@RunWith(J8Unit4.class)
public class ZoneIdClassTest
implements ZoneIdClassTests<ZoneId> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.ZoneId]

    @Override
    public Class<ZoneId> createNewSUT() {
        return ZoneId.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.ZoneId#from(java.time.temporal.TemporalAccessor) public static java.time.ZoneId
     * java.time.ZoneId.from(java.time.temporal.TemporalAccessor)}.
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
        // write some test for {@link java.time.ZoneId#from(java.time.temporal.TemporalAccessor)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.ZoneId#of(String, java.util.Map) public
     * static java.time.ZoneId java.time.ZoneId.of(java.lang.String,java.util.Map<java.lang.String, java.lang.String>)}.
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
    public void test_of_String_Map()
    throws Exception {
        // write some test for {@link java.time.ZoneId#of(String, java.util.Map)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.ZoneId#of(String) public static
     * java.time.ZoneId java.time.ZoneId.of(java.lang.String)}.
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
    public void test_of_String()
    throws Exception {
        // write some test for {@link java.time.ZoneId#of(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.ZoneId#getAvailableZoneIds() public static
     * java.util.Set<java.lang.String> java.time.ZoneId.getAvailableZoneIds()}.
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
    public void test_getAvailableZoneIds()
    throws Exception {
        // write some test for {@link java.time.ZoneId#getAvailableZoneIds()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.ZoneId#ofOffset(String, java.time.ZoneOffset) public static java.time.ZoneId
     * java.time.ZoneId.ofOffset(java.lang.String,java.time.ZoneOffset)}.
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
    public void test_ofOffset_String_ZoneOffset()
    throws Exception {
        // write some test for {@link java.time.ZoneId#ofOffset(String, java.time.ZoneOffset)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.ZoneId#systemDefault() public static
     * java.time.ZoneId java.time.ZoneId.systemDefault()}.
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
    public void test_systemDefault()
    throws Exception {
        // write some test for {@link java.time.ZoneId#systemDefault()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.ZoneId]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.ZoneId]

}
