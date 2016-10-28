package org.j8unit.repository.java.time.zone;

import java.time.ZoneOffset;
import java.time.zone.ZoneRules;
import java.util.List;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneRulesClassTest
implements org.j8unit.repository.java.time.zone.ZoneRulesClassTests<ZoneRules> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.zone.ZoneRules]

    @Override
    public Class<ZoneRules> createNewSUT() {
        return ZoneRules.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link ZoneRules#of(ZoneOffset, ZoneOffset, List, List, List) public static java.time.zone.ZoneRules
     * java.time.zone.ZoneRules.of(java.time.ZoneOffset,java.time.ZoneOffset,java.util.List
     * <java.time.zone.ZoneOffsetTransition>,java.util.List<java.time.zone.ZoneOffsetTransition>,java.util.List
     * <java.time.zone.ZoneOffsetTransitionRule>)}.
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
    public void test_of_ZoneOffset_ZoneOffset_List_List_List()
    throws Exception {
        // write some test for {@link ZoneRules#of(ZoneOffset, ZoneOffset, List, List, List)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ZoneRules#of(ZoneOffset) public static
     * java.time.zone.ZoneRules java.time.zone.ZoneRules.of(java.time.ZoneOffset)}.
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
    public void test_of_ZoneOffset()
    throws Exception {
        // write some test for {@link ZoneRules#of(ZoneOffset)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.zone.ZoneRules]

}
