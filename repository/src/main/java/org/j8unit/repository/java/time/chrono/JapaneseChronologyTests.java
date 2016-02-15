package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.chrono.JapaneseChronology class
 * java.time.chrono.JapaneseChronology}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link JapaneseChronologyClassTests}.
 * </p>
 *
 * @see java.time.chrono.JapaneseChronology class java.time.chrono.JapaneseChronology (the hereby targeted
 *      class-under-test class)
 * @see JapaneseChronologyClassTests JapaneseChronologyClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JapaneseChronologyTests<SUT extends java.time.chrono.JapaneseChronology>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, AbstractChronologyTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#zonedDateTime(java.time.Instant, java.time.ZoneId)
     * public java.time.chrono.ChronoZonedDateTime<java.time.chrono.JapaneseDate>
     * java.time.chrono.JapaneseChronology.zonedDateTime(java.time.Instant,java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#zonedDateTime(java.time.Instant, java.time.ZoneId)
     * public java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.JapaneseChronology.zonedDateTime(java.time.Instant,java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#zonedDateTime(java.time.Instant, java.time.ZoneId) public
     *      java.time.chrono.ChronoZonedDateTime
     *      java.time.chrono.JapaneseChronology.zonedDateTime(java.time.Instant,java.time.ZoneId) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#zonedDateTime(java.time.temporal.TemporalAccessor)
     * public java.time.chrono.ChronoZonedDateTime<java.time.chrono.JapaneseDate>
     * java.time.chrono.JapaneseChronology.zonedDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#zonedDateTime(java.time.temporal.TemporalAccessor)
     * public java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.JapaneseChronology.zonedDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#zonedDateTime(java.time.temporal.TemporalAccessor) public
     *      java.time.chrono.ChronoZonedDateTime
     *      java.time.chrono.JapaneseChronology.zonedDateTime(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#eras() public java.util.List
     * <java.time.chrono.Era> java.time.chrono.JapaneseChronology.eras()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#eras() public java.util.List
     * java.time.chrono.JapaneseChronology.eras()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#eras() public java.util.List java.time.chrono.JapaneseChronology.eras()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#prolepticYear(java.time.chrono.Era, int) public int
     * java.time.chrono.JapaneseChronology.prolepticYear(java.time.chrono.Era,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#prolepticYear(java.time.chrono.Era, int) public int
     * java.time.chrono.JapaneseChronology.prolepticYear(java.time.chrono.Era,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#prolepticYear(java.time.chrono.Era, int) public int
     *      java.time.chrono.JapaneseChronology.prolepticYear(java.time.chrono.Era,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link java.time.chrono.JapaneseChronology#resolveDate(java.util.Map, java.time.format.ResolverStyle) public
     * java.time.chrono.JapaneseDate
     * java.time.chrono.JapaneseChronology.resolveDate(java.util.Map<java.time.temporal.TemporalField,
     * java.lang.Long>,java.time.format.ResolverStyle)}.
     *
     * <p>
     * Test method for
     * {@link java.time.chrono.JapaneseChronology#resolveDate(java.util.Map, java.time.format.ResolverStyle) public
     * java.time.chrono.JapaneseDate
     * java.time.chrono.JapaneseChronology.resolveDate(java.util.Map,java.time.format.ResolverStyle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#resolveDate(java.util.Map, java.time.format.ResolverStyle) public
     *      java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseChronology.resolveDate(java.util.Map,java.time.format.ResolverStyle) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#date(java.time.temporal.TemporalAccessor) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.date(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#date(java.time.temporal.TemporalAccessor) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.date(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#date(java.time.temporal.TemporalAccessor) public
     *      java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.date(java.time.temporal.TemporalAccessor)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#date(int, int, int) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.date(int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#date(int, int, int) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.date(int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#date(int, int, int) public java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseChronology.date(int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#date(java.time.chrono.Era, int, int, int) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.date(java.time.chrono.Era,int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#date(java.time.chrono.Era, int, int, int) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.date(java.time.chrono.Era,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#date(java.time.chrono.Era, int, int, int) public
     *      java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.date(java.time.chrono.Era,int,int,int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#localDateTime(java.time.temporal.TemporalAccessor)
     * public java.time.chrono.ChronoLocalDateTime<java.time.chrono.JapaneseDate>
     * java.time.chrono.JapaneseChronology.localDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#localDateTime(java.time.temporal.TemporalAccessor)
     * public java.time.chrono.ChronoLocalDateTime
     * java.time.chrono.JapaneseChronology.localDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#localDateTime(java.time.temporal.TemporalAccessor) public
     *      java.time.chrono.ChronoLocalDateTime
     *      java.time.chrono.JapaneseChronology.localDateTime(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#getCalendarType() public java.lang.String
     * java.time.chrono.JapaneseChronology.getCalendarType()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#getCalendarType() public java.lang.String
     * java.time.chrono.JapaneseChronology.getCalendarType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#getCalendarType() public java.lang.String
     *      java.time.chrono.JapaneseChronology.getCalendarType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#dateYearDay(int, int) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateYearDay(int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#dateYearDay(int, int) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateYearDay(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#dateYearDay(int, int) public java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseChronology.dateYearDay(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#dateYearDay(java.time.chrono.Era, int, int) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateYearDay(java.time.chrono.Era,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#dateYearDay(java.time.chrono.Era, int, int) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateYearDay(java.time.chrono.Era,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#dateYearDay(java.time.chrono.Era, int, int) public
     *      java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateYearDay(java.time.chrono.Era,int,int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#dateNow(java.time.Clock) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateNow(java.time.Clock)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#dateNow(java.time.Clock) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateNow(java.time.Clock)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#dateNow(java.time.Clock) public java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseChronology.dateNow(java.time.Clock) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#dateNow(java.time.ZoneId) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateNow(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#dateNow(java.time.ZoneId) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateNow(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#dateNow(java.time.ZoneId) public java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseChronology.dateNow(java.time.ZoneId) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#dateNow() public java.time.chrono.JapaneseDate
     * java.time.chrono.JapaneseChronology.dateNow()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#dateNow() public java.time.chrono.JapaneseDate
     * java.time.chrono.JapaneseChronology.dateNow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#dateNow() public java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseChronology.dateNow() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#eraOf(int) public java.time.chrono.JapaneseEra
     * java.time.chrono.JapaneseChronology.eraOf(int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#eraOf(int) public java.time.chrono.JapaneseEra
     * java.time.chrono.JapaneseChronology.eraOf(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#eraOf(int) public java.time.chrono.JapaneseEra
     *      java.time.chrono.JapaneseChronology.eraOf(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_eraOf_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#range(java.time.temporal.ChronoField) public
     * java.time.temporal.ValueRange java.time.chrono.JapaneseChronology.range(java.time.temporal.ChronoField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#range(java.time.temporal.ChronoField) public
     * java.time.temporal.ValueRange java.time.chrono.JapaneseChronology.range(java.time.temporal.ChronoField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#range(java.time.temporal.ChronoField) public
     *      java.time.temporal.ValueRange java.time.chrono.JapaneseChronology.range(java.time.temporal.ChronoField) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#isLeapYear(long) public boolean
     * java.time.chrono.JapaneseChronology.isLeapYear(long)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#isLeapYear(long) public boolean
     * java.time.chrono.JapaneseChronology.isLeapYear(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#isLeapYear(long) public boolean
     *      java.time.chrono.JapaneseChronology.isLeapYear(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#getId() public java.lang.String
     * java.time.chrono.JapaneseChronology.getId()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#getId() public java.lang.String
     * java.time.chrono.JapaneseChronology.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#getId() public java.lang.String
     *      java.time.chrono.JapaneseChronology.getId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.JapaneseChronology#dateEpochDay(long) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateEpochDay(long)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseChronology#dateEpochDay(long) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseChronology.dateEpochDay(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseChronology#dateEpochDay(long) public java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseChronology.dateEpochDay(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dateEpochDay_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
