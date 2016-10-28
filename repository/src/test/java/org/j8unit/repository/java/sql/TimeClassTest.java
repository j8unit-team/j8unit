package org.j8unit.repository.java.sql;

import java.sql.Time;
import java.time.LocalTime;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeClassTest
implements org.j8unit.repository.java.sql.TimeClassTests<Time> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Time]

    @Override
    public Class<Time> createNewSUT() {
        return Time.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Time#Time(int, int, int) public
     * java.sql.Time(int,int,int)}.
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
    public void create_Time_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Time sut = null; // = new Time(int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Time#Time(long) public java.sql.Time(long)}.
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
    public void create_Time_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Time sut = null; // = new Time(long);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Time#valueOf(String) public static java.sql.Time
     * java.sql.Time.valueOf(java.lang.String)}.
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
        // write some test for {@link Time#valueOf(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Time#valueOf(LocalTime) public static java.sql.Time
     * java.sql.Time.valueOf(java.time.LocalTime)}.
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
    public void test_valueOf_LocalTime()
    throws Exception {
        // write some test for {@link Time#valueOf(LocalTime)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Time]

}
