package org.j8unit.repository.java.sql;

import java.sql.Timestamp;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimestampClassTest
implements org.j8unit.repository.java.sql.TimestampClassTests<Timestamp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Timestamp]

    @Override
    public Class<Timestamp> createNewSUT() {
        return Timestamp.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.sql.Timestamp#Timestamp(int, int, int, int, int, int, int) public
     * java.sql.Timestamp(int,int,int,int,int,int,int)}.
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
    public void create_Timestamp_int_int_int_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Timestamp sut = null; // = new Timestamp(int, int, int, int, int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.sql.Timestamp#Timestamp(long) public
     * java.sql.Timestamp(long)}.
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
    public void create_Timestamp_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Timestamp sut = null; // = new Timestamp(long);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.sql.Timestamp#valueOf(String) public static
     * java.sql.Timestamp java.sql.Timestamp.valueOf(java.lang.String)}.
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
        // write some test for {@link java.sql.Timestamp#valueOf(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.sql.Timestamp#valueOf(java.time.LocalDateTime)
     * public static java.sql.Timestamp java.sql.Timestamp.valueOf(java.time.LocalDateTime)}.
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
    public void test_valueOf_LocalDateTime()
    throws Exception {
        // write some test for {@link java.sql.Timestamp#valueOf(java.time.LocalDateTime)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.sql.Timestamp#from(java.time.Instant) public
     * static java.sql.Timestamp java.sql.Timestamp.from(java.time.Instant)}.
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
    public void test_from_Instant()
    throws Exception {
        // write some test for {@link java.sql.Timestamp#from(java.time.Instant)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Timestamp]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Timestamp]

}
