package org.j8unit.repository.java.time.chrono;

import java.time.chrono.ChronoPeriod;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ChronoPeriod} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.chrono.ChronoPeriodClassTests}).
 */
@RunWith(J8Unit4.class)
public class ChronoPeriodClassTest
implements ChronoPeriodClassTests<ChronoPeriod> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.ChronoPeriod]

    @Override
    public Class<ChronoPeriod> createNewSUT() {
        return ChronoPeriod.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.chrono.ChronoPeriod#between(java.time.chrono.ChronoLocalDate, java.time.chrono.ChronoLocalDate)
     * public static java.time.chrono.ChronoPeriod
     * java.time.chrono.ChronoPeriod.between(java.time.chrono.ChronoLocalDate,java.time.chrono.ChronoLocalDate)}.
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
    public void test_between_ChronoLocalDate_ChronoLocalDate()
    throws Exception {
        // write some test for {@link java.time.chrono.ChronoPeriod#between(java.time.chrono.ChronoLocalDate,
        // java.time.chrono.ChronoLocalDate)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.chrono.ChronoPeriod]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.ChronoPeriod]

}
