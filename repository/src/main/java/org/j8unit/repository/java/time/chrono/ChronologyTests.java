package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.chrono.Chronology interface java.time.chrono.Chronology}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ChronologyClassTests}.
 * </p>
 *
 * @see java.time.chrono.Chronology interface java.time.chrono.Chronology (the hereby targeted class-under-test class)
 * @see ChronologyClassTests ChronologyClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ChronologyTests<SUT extends java.time.chrono.Chronology>
extends org.j8unit.repository.java.lang.ComparableTests<SUT, java.time.chrono.Chronology> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#eras() public abstract java.util.List
     * <java.time.chrono.Era> java.time.chrono.Chronology.eras()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#eras() public abstract java.util.List
     * java.time.chrono.Chronology.eras()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#eras() public abstract java.util.List java.time.chrono.Chronology.eras() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_eras()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#equals(Object) public abstract boolean
     * java.time.chrono.Chronology.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#equals(Object) public abstract boolean
     * java.time.chrono.Chronology.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#equals(Object) public abstract boolean
     *      java.time.chrono.Chronology.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#getDisplayName(java.time.format.TextStyle, java.util.Locale)
     * public default java.lang.String
     * java.time.chrono.Chronology.getDisplayName(java.time.format.TextStyle,java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#getDisplayName(java.time.format.TextStyle, java.util.Locale)
     * public default java.lang.String
     * java.time.chrono.Chronology.getDisplayName(java.time.format.TextStyle,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#getDisplayName(java.time.format.TextStyle, java.util.Locale) public default
     *      java.lang.String java.time.chrono.Chronology.getDisplayName(java.time.format.TextStyle,java.util.Locale)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayName_TextStyle_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#toString() public abstract java.lang.String
     * java.time.chrono.Chronology.toString()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#toString() public abstract java.lang.String
     * java.time.chrono.Chronology.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#toString() public abstract java.lang.String
     *      java.time.chrono.Chronology.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#period(int, int, int) public default
     * java.time.chrono.ChronoPeriod java.time.chrono.Chronology.period(int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#period(int, int, int) public default
     * java.time.chrono.ChronoPeriod java.time.chrono.Chronology.period(int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#period(int, int, int) public default java.time.chrono.ChronoPeriod
     *      java.time.chrono.Chronology.period(int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_period_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#getCalendarType() public abstract java.lang.String
     * java.time.chrono.Chronology.getCalendarType()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#getCalendarType() public abstract java.lang.String
     * java.time.chrono.Chronology.getCalendarType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#getCalendarType() public abstract java.lang.String
     *      java.time.chrono.Chronology.getCalendarType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCalendarType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateYearDay(java.time.chrono.Era, int, int) public default
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateYearDay(java.time.chrono.Era,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateYearDay(java.time.chrono.Era, int, int) public default
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateYearDay(java.time.chrono.Era,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#dateYearDay(java.time.chrono.Era, int, int) public default
     *      java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateYearDay(java.time.chrono.Era,int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dateYearDay_Era_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateYearDay(int, int) public abstract
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateYearDay(int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateYearDay(int, int) public abstract
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateYearDay(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#dateYearDay(int, int) public abstract java.time.chrono.ChronoLocalDate
     *      java.time.chrono.Chronology.dateYearDay(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dateYearDay_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#resolveDate(java.util.Map, java.time.format.ResolverStyle)
     * public abstract java.time.chrono.ChronoLocalDate
     * java.time.chrono.Chronology.resolveDate(java.util.Map<java.time.temporal.TemporalField,
     * java.lang.Long>,java.time.format.ResolverStyle)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#resolveDate(java.util.Map, java.time.format.ResolverStyle)
     * public abstract java.time.chrono.ChronoLocalDate
     * java.time.chrono.Chronology.resolveDate(java.util.Map,java.time.format.ResolverStyle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#resolveDate(java.util.Map, java.time.format.ResolverStyle) public abstract
     *      java.time.chrono.ChronoLocalDate
     *      java.time.chrono.Chronology.resolveDate(java.util.Map,java.time.format.ResolverStyle) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolveDate_Map_ResolverStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateEpochDay(long) public abstract
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateEpochDay(long)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateEpochDay(long) public abstract
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateEpochDay(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#dateEpochDay(long) public abstract java.time.chrono.ChronoLocalDate
     *      java.time.chrono.Chronology.dateEpochDay(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dateEpochDay_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#isLeapYear(long) public abstract boolean
     * java.time.chrono.Chronology.isLeapYear(long)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#isLeapYear(long) public abstract boolean
     * java.time.chrono.Chronology.isLeapYear(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#isLeapYear(long) public abstract boolean
     *      java.time.chrono.Chronology.isLeapYear(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isLeapYear_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#prolepticYear(java.time.chrono.Era, int) public abstract int
     * java.time.chrono.Chronology.prolepticYear(java.time.chrono.Era,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#prolepticYear(java.time.chrono.Era, int) public abstract int
     * java.time.chrono.Chronology.prolepticYear(java.time.chrono.Era,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#prolepticYear(java.time.chrono.Era, int) public abstract int
     *      java.time.chrono.Chronology.prolepticYear(java.time.chrono.Era,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_prolepticYear_Era_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#hashCode() public abstract int
     * java.time.chrono.Chronology.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#hashCode() public abstract int
     * java.time.chrono.Chronology.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#hashCode() public abstract int java.time.chrono.Chronology.hashCode() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#zonedDateTime(java.time.Instant, java.time.ZoneId) public
     * default java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate>
     * java.time.chrono.Chronology.zonedDateTime(java.time.Instant,java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#zonedDateTime(java.time.Instant, java.time.ZoneId) public
     * default java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.Chronology.zonedDateTime(java.time.Instant,java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#zonedDateTime(java.time.Instant, java.time.ZoneId) public default
     *      java.time.chrono.ChronoZonedDateTime
     *      java.time.chrono.Chronology.zonedDateTime(java.time.Instant,java.time.ZoneId) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_zonedDateTime_Instant_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#zonedDateTime(java.time.temporal.TemporalAccessor) public
     * default java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate>
     * java.time.chrono.Chronology.zonedDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#zonedDateTime(java.time.temporal.TemporalAccessor) public
     * default java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.Chronology.zonedDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#zonedDateTime(java.time.temporal.TemporalAccessor) public default
     *      java.time.chrono.ChronoZonedDateTime
     *      java.time.chrono.Chronology.zonedDateTime(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_zonedDateTime_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#date(java.time.temporal.TemporalAccessor) public abstract
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.date(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#date(java.time.temporal.TemporalAccessor) public abstract
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.date(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#date(java.time.temporal.TemporalAccessor) public abstract
     *      java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.date(java.time.temporal.TemporalAccessor) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_date_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#date(int, int, int) public abstract
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.date(int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#date(int, int, int) public abstract
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.date(int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#date(int, int, int) public abstract java.time.chrono.ChronoLocalDate
     *      java.time.chrono.Chronology.date(int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_date_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#date(java.time.chrono.Era, int, int, int) public default
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.date(java.time.chrono.Era,int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#date(java.time.chrono.Era, int, int, int) public default
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.date(java.time.chrono.Era,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#date(java.time.chrono.Era, int, int, int) public default
     *      java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.date(java.time.chrono.Era,int,int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_date_Era_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#localDateTime(java.time.temporal.TemporalAccessor) public
     * default java.time.chrono.ChronoLocalDateTime<? extends java.time.chrono.ChronoLocalDate>
     * java.time.chrono.Chronology.localDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#localDateTime(java.time.temporal.TemporalAccessor) public
     * default java.time.chrono.ChronoLocalDateTime
     * java.time.chrono.Chronology.localDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#localDateTime(java.time.temporal.TemporalAccessor) public default
     *      java.time.chrono.ChronoLocalDateTime
     *      java.time.chrono.Chronology.localDateTime(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_localDateTime_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#getId() public abstract java.lang.String
     * java.time.chrono.Chronology.getId()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#getId() public abstract java.lang.String
     * java.time.chrono.Chronology.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#getId() public abstract java.lang.String java.time.chrono.Chronology.getId()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#compareTo(java.time.chrono.Chronology) public abstract int
     * java.time.chrono.Chronology.compareTo(java.time.chrono.Chronology)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#compareTo(java.time.chrono.Chronology) public abstract int
     * java.time.chrono.Chronology.compareTo(java.time.chrono.Chronology)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#compareTo(java.time.chrono.Chronology) public abstract int
     *      java.time.chrono.Chronology.compareTo(java.time.chrono.Chronology) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_Chronology()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#range(java.time.temporal.ChronoField) public abstract
     * java.time.temporal.ValueRange java.time.chrono.Chronology.range(java.time.temporal.ChronoField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#range(java.time.temporal.ChronoField) public abstract
     * java.time.temporal.ValueRange java.time.chrono.Chronology.range(java.time.temporal.ChronoField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#range(java.time.temporal.ChronoField) public abstract
     *      java.time.temporal.ValueRange java.time.chrono.Chronology.range(java.time.temporal.ChronoField) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_range_ChronoField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateNow() public default java.time.chrono.ChronoLocalDate
     * java.time.chrono.Chronology.dateNow()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateNow() public default java.time.chrono.ChronoLocalDate
     * java.time.chrono.Chronology.dateNow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#dateNow() public default java.time.chrono.ChronoLocalDate
     *      java.time.chrono.Chronology.dateNow() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dateNow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateNow(java.time.Clock) public default
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateNow(java.time.Clock)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateNow(java.time.Clock) public default
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateNow(java.time.Clock)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#dateNow(java.time.Clock) public default java.time.chrono.ChronoLocalDate
     *      java.time.chrono.Chronology.dateNow(java.time.Clock) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dateNow_Clock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateNow(java.time.ZoneId) public default
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateNow(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#dateNow(java.time.ZoneId) public default
     * java.time.chrono.ChronoLocalDate java.time.chrono.Chronology.dateNow(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#dateNow(java.time.ZoneId) public default java.time.chrono.ChronoLocalDate
     *      java.time.chrono.Chronology.dateNow(java.time.ZoneId) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dateNow_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Chronology#eraOf(int) public abstract java.time.chrono.Era
     * java.time.chrono.Chronology.eraOf(int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Chronology#eraOf(int) public abstract java.time.chrono.Era
     * java.time.chrono.Chronology.eraOf(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Chronology#eraOf(int) public abstract java.time.chrono.Era
     *      java.time.chrono.Chronology.eraOf(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_eraOf_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
