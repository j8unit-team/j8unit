package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.chrono.IsoChronology class java.time.chrono.IsoChronology}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link IsoChronologyClassTests}.
 * </p>
 *
 * @see java.time.chrono.IsoChronology class java.time.chrono.IsoChronology (the hereby targeted class-under-test class)
 * @see IsoChronologyClassTests IsoChronologyClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IsoChronologyTests<SUT extends java.time.chrono.IsoChronology>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, AbstractChronologyTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#zonedDateTime(java.time.temporal.TemporalAccessor) public
     * java.time.ZonedDateTime java.time.chrono.IsoChronology.zonedDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#zonedDateTime(java.time.temporal.TemporalAccessor) public
     * java.time.ZonedDateTime java.time.chrono.IsoChronology.zonedDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#zonedDateTime(java.time.temporal.TemporalAccessor) public
     *      java.time.ZonedDateTime java.time.chrono.IsoChronology.zonedDateTime(java.time.temporal.TemporalAccessor)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#zonedDateTime(java.time.Instant, java.time.ZoneId) public
     * java.time.ZonedDateTime java.time.chrono.IsoChronology.zonedDateTime(java.time.Instant,java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#zonedDateTime(java.time.Instant, java.time.ZoneId) public
     * java.time.ZonedDateTime java.time.chrono.IsoChronology.zonedDateTime(java.time.Instant,java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#zonedDateTime(java.time.Instant, java.time.ZoneId) public
     *      java.time.ZonedDateTime java.time.chrono.IsoChronology.zonedDateTime(java.time.Instant,java.time.ZoneId)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#eras() public java.util.List
     * <java.time.chrono.Era> java.time.chrono.IsoChronology.eras()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#eras() public java.util.List
     * java.time.chrono.IsoChronology.eras()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#eras() public java.util.List java.time.chrono.IsoChronology.eras() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#prolepticYear(java.time.chrono.Era, int) public int
     * java.time.chrono.IsoChronology.prolepticYear(java.time.chrono.Era,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#prolepticYear(java.time.chrono.Era, int) public int
     * java.time.chrono.IsoChronology.prolepticYear(java.time.chrono.Era,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#prolepticYear(java.time.chrono.Era, int) public int
     *      java.time.chrono.IsoChronology.prolepticYear(java.time.chrono.Era,int) (the hereby targeted
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
     * Test method for {@link java.time.chrono.IsoChronology#resolveDate(java.util.Map, java.time.format.ResolverStyle)
     * public java.time.LocalDate
     * java.time.chrono.IsoChronology.resolveDate(java.util.Map<java.time.temporal.TemporalField,
     * java.lang.Long>,java.time.format.ResolverStyle)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#resolveDate(java.util.Map, java.time.format.ResolverStyle)
     * public java.time.LocalDate
     * java.time.chrono.IsoChronology.resolveDate(java.util.Map,java.time.format.ResolverStyle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#resolveDate(java.util.Map, java.time.format.ResolverStyle) public
     *      java.time.LocalDate java.time.chrono.IsoChronology.resolveDate(java.util.Map,java.time.format.ResolverStyle)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#date(int, int, int) public java.time.LocalDate
     * java.time.chrono.IsoChronology.date(int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#date(int, int, int) public java.time.LocalDate
     * java.time.chrono.IsoChronology.date(int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#date(int, int, int) public java.time.LocalDate
     *      java.time.chrono.IsoChronology.date(int,int,int) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#date(java.time.chrono.Era, int, int, int) public
     * java.time.LocalDate java.time.chrono.IsoChronology.date(java.time.chrono.Era,int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#date(java.time.chrono.Era, int, int, int) public
     * java.time.LocalDate java.time.chrono.IsoChronology.date(java.time.chrono.Era,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#date(java.time.chrono.Era, int, int, int) public java.time.LocalDate
     *      java.time.chrono.IsoChronology.date(java.time.chrono.Era,int,int,int) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#date(java.time.temporal.TemporalAccessor) public
     * java.time.LocalDate java.time.chrono.IsoChronology.date(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#date(java.time.temporal.TemporalAccessor) public
     * java.time.LocalDate java.time.chrono.IsoChronology.date(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#date(java.time.temporal.TemporalAccessor) public java.time.LocalDate
     *      java.time.chrono.IsoChronology.date(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#localDateTime(java.time.temporal.TemporalAccessor) public
     * java.time.LocalDateTime java.time.chrono.IsoChronology.localDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#localDateTime(java.time.temporal.TemporalAccessor) public
     * java.time.LocalDateTime java.time.chrono.IsoChronology.localDateTime(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#localDateTime(java.time.temporal.TemporalAccessor) public
     *      java.time.LocalDateTime java.time.chrono.IsoChronology.localDateTime(java.time.temporal.TemporalAccessor)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#period(int, int, int) public java.time.Period
     * java.time.chrono.IsoChronology.period(int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#period(int, int, int) public java.time.Period
     * java.time.chrono.IsoChronology.period(int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#period(int, int, int) public java.time.Period
     *      java.time.chrono.IsoChronology.period(int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.chrono.IsoChronology#getCalendarType() public java.lang.String
     * java.time.chrono.IsoChronology.getCalendarType()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#getCalendarType() public java.lang.String
     * java.time.chrono.IsoChronology.getCalendarType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#getCalendarType() public java.lang.String
     *      java.time.chrono.IsoChronology.getCalendarType() (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#dateYearDay(java.time.chrono.Era, int, int) public
     * java.time.LocalDate java.time.chrono.IsoChronology.dateYearDay(java.time.chrono.Era,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#dateYearDay(java.time.chrono.Era, int, int) public
     * java.time.LocalDate java.time.chrono.IsoChronology.dateYearDay(java.time.chrono.Era,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#dateYearDay(java.time.chrono.Era, int, int) public java.time.LocalDate
     *      java.time.chrono.IsoChronology.dateYearDay(java.time.chrono.Era,int,int) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#dateYearDay(int, int) public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateYearDay(int,int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#dateYearDay(int, int) public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateYearDay(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#dateYearDay(int, int) public java.time.LocalDate
     *      java.time.chrono.IsoChronology.dateYearDay(int,int) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#dateNow() public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateNow()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#dateNow() public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateNow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#dateNow() public java.time.LocalDate java.time.chrono.IsoChronology.dateNow()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#dateNow(java.time.ZoneId) public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateNow(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#dateNow(java.time.ZoneId) public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateNow(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#dateNow(java.time.ZoneId) public java.time.LocalDate
     *      java.time.chrono.IsoChronology.dateNow(java.time.ZoneId) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#dateNow(java.time.Clock) public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateNow(java.time.Clock)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#dateNow(java.time.Clock) public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateNow(java.time.Clock)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#dateNow(java.time.Clock) public java.time.LocalDate
     *      java.time.chrono.IsoChronology.dateNow(java.time.Clock) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#eraOf(int) public java.time.chrono.IsoEra
     * java.time.chrono.IsoChronology.eraOf(int)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#eraOf(int) public java.time.chrono.IsoEra
     * java.time.chrono.IsoChronology.eraOf(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#eraOf(int) public java.time.chrono.IsoEra
     *      java.time.chrono.IsoChronology.eraOf(int) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#range(java.time.temporal.ChronoField) public
     * java.time.temporal.ValueRange java.time.chrono.IsoChronology.range(java.time.temporal.ChronoField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#range(java.time.temporal.ChronoField) public
     * java.time.temporal.ValueRange java.time.chrono.IsoChronology.range(java.time.temporal.ChronoField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#range(java.time.temporal.ChronoField) public java.time.temporal.ValueRange
     *      java.time.chrono.IsoChronology.range(java.time.temporal.ChronoField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#isLeapYear(long) public boolean
     * java.time.chrono.IsoChronology.isLeapYear(long)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#isLeapYear(long) public boolean
     * java.time.chrono.IsoChronology.isLeapYear(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#isLeapYear(long) public boolean
     *      java.time.chrono.IsoChronology.isLeapYear(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#getId() public java.lang.String
     * java.time.chrono.IsoChronology.getId()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#getId() public java.lang.String
     * java.time.chrono.IsoChronology.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#getId() public java.lang.String java.time.chrono.IsoChronology.getId() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.IsoChronology#dateEpochDay(long) public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateEpochDay(long)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoChronology#dateEpochDay(long) public java.time.LocalDate
     * java.time.chrono.IsoChronology.dateEpochDay(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoChronology#dateEpochDay(long) public java.time.LocalDate
     *      java.time.chrono.IsoChronology.dateEpochDay(long) (the hereby targeted method-under-test)
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
