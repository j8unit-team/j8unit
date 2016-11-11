package org.j8unit.repository.java.time.zone;

import java.time.zone.ZoneOffsetTransition;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ZoneOffsetTransition} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.time.zone.ZoneOffsetTransitionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ZoneOffsetTransitionClassTest
implements ZoneOffsetTransitionClassTests<ZoneOffsetTransition> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.zone.ZoneOffsetTransition]

    @Override
    public Class<ZoneOffsetTransition> createNewSUT() {
        return ZoneOffsetTransition.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.zone.ZoneOffsetTransition#of(java.time.LocalDateTime, java.time.ZoneOffset, java.time.ZoneOffset)
     * public static java.time.zone.ZoneOffsetTransition
     * java.time.zone.ZoneOffsetTransition.of(java.time.LocalDateTime,java.time.ZoneOffset,java.time.ZoneOffset)}.
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
    public void test_of_LocalDateTime_ZoneOffset_ZoneOffset()
    throws Exception {
        // write some test for {@link java.time.zone.ZoneOffsetTransition#of(java.time.LocalDateTime,
        // java.time.ZoneOffset, java.time.ZoneOffset)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.zone.ZoneOffsetTransition]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.zone.ZoneOffsetTransition]

}
