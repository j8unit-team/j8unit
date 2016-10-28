package org.j8unit.repository.java.sql;

import java.sql.Date;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateClassTest
implements org.j8unit.repository.java.sql.DateClassTests<Date> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Date]

    @Override
    public Class<Date> createNewSUT() {
        return Date.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.sql.Date#Date(int, int, int) public
     * java.sql.Date(int,int,int)}.
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
    public void create_Date_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Date sut = null; // = new Date(int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.sql.Date#Date(long) public
     * java.sql.Date(long)}.
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
    public void create_Date_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Date sut = null; // = new Date(long);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.sql.Date#valueOf(java.time.LocalDate) public
     * static java.sql.Date java.sql.Date.valueOf(java.time.LocalDate)}.
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
    public void test_valueOf_LocalDate()
    throws Exception {
        // write some test for {@link java.sql.Date#valueOf(java.time.LocalDate)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.sql.Date#valueOf(String) public static
     * java.sql.Date java.sql.Date.valueOf(java.lang.String)}.
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
        // write some test for {@link java.sql.Date#valueOf(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Date]

}
