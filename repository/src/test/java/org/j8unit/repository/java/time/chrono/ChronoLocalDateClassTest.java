package org.j8unit.repository.java.time.chrono;

import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAccessor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChronoLocalDateClassTest
implements org.j8unit.repository.java.time.chrono.ChronoLocalDateClassTests<ChronoLocalDate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.ChronoLocalDate]

    @Override
    public Class<ChronoLocalDate> createNewSUT() {
        return ChronoLocalDate.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ChronoLocalDate#from(TemporalAccessor) public static
     * java.time.chrono.ChronoLocalDate java.time.chrono.ChronoLocalDate.from(java.time.temporal.TemporalAccessor)}.
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
        // write some test for {@link ChronoLocalDate#from(TemporalAccessor)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ChronoLocalDate#timeLineOrder() public static
     * java.util.Comparator<java.time.chrono.ChronoLocalDate> java.time.chrono.ChronoLocalDate.timeLineOrder()}.
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
    public void test_timeLineOrder()
    throws Exception {
        // write some test for {@link ChronoLocalDate#timeLineOrder()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.ChronoLocalDate]

}
