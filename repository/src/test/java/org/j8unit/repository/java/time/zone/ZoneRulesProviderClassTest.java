package org.j8unit.repository.java.time.zone;

import java.time.zone.ZoneRulesProvider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ZoneRulesProvider} (by simply reusing the
 * J8Unit test interface {@link ZoneRulesProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ZoneRulesProviderClassTest
implements ZoneRulesProviderClassTests<ZoneRulesProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.zone.ZoneRulesProvider]

    @Override
    public Class<ZoneRulesProvider> createNewSUT() {
        return ZoneRulesProvider.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.zone.ZoneRulesProvider#registerProvider(java.time.zone.ZoneRulesProvider) public static void
     * java.time.zone.ZoneRulesProvider.registerProvider(java.time.zone.ZoneRulesProvider)}.
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
    public void test_registerProvider_ZoneRulesProvider()
    throws Exception {
        // write some test for {@link
        // java.time.zone.ZoneRulesProvider#registerProvider(java.time.zone.ZoneRulesProvider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.zone.ZoneRulesProvider#getRules(String, boolean) public static java.time.zone.ZoneRules
     * java.time.zone.ZoneRulesProvider.getRules(java.lang.String,boolean)}.
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
    public void test_getRules_String_boolean()
    throws Exception {
        // write some test for {@link java.time.zone.ZoneRulesProvider#getRules(String, boolean)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.zone.ZoneRulesProvider#getVersions(String)
     * public static java.util.NavigableMap<java.lang.String, java.time.zone.ZoneRules>
     * java.time.zone.ZoneRulesProvider.getVersions(java.lang.String)}.
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
    public void test_getVersions_String()
    throws Exception {
        // write some test for {@link java.time.zone.ZoneRulesProvider#getVersions(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.zone.ZoneRulesProvider#refresh() public
     * static boolean java.time.zone.ZoneRulesProvider.refresh()}.
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
    public void test_refresh()
    throws Exception {
        // write some test for {@link java.time.zone.ZoneRulesProvider#refresh()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.zone.ZoneRulesProvider#getAvailableZoneIds() public static java.util.Set<java.lang.String>
     * java.time.zone.ZoneRulesProvider.getAvailableZoneIds()}.
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
        // write some test for {@link java.time.zone.ZoneRulesProvider#getAvailableZoneIds()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.zone.ZoneRulesProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.zone.ZoneRulesProvider]

}
