package org.j8unit.repository.java.time;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.LocalDateTime class java.time.LocalDateTime}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link LocalDateTimeClassTests}.
 * </p>
 *
 * @see java.time.LocalDateTime class java.time.LocalDateTime (the hereby targeted class-under-test class)
 * @see LocalDateTimeClassTests LocalDateTimeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LocalDateTimeTests<SUT extends java.time.LocalDateTime>
extends org.j8unit.repository.java.time.temporal.TemporalTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT>,
org.j8unit.repository.java.time.chrono.ChronoLocalDateTimeTests<SUT, java.time.LocalDate>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.LocalDateTime.adjustInto(java.time.temporal.Temporal)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.LocalDateTime.adjustInto(java.time.temporal.Temporal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#adjustInto(java.time.temporal.Temporal) public java.time.temporal.Temporal
     *      java.time.LocalDateTime.adjustInto(java.time.temporal.Temporal) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_adjustInto_Temporal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.LocalDateTime.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.LocalDateTime.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#range(java.time.temporal.TemporalField) public java.time.temporal.ValueRange
     *      java.time.LocalDateTime.range(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_range_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#withYear(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withYear(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#withYear(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withYear(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#withYear(int) public java.time.LocalDateTime java.time.LocalDateTime.withYear(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withYear_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusMinutes(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusMinutes(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusMinutes(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusMinutes(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plusMinutes(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.plusMinutes(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_plusMinutes_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.LocalDateTime java.time.LocalDateTime.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.LocalDateTime java.time.LocalDateTime.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minus(long, java.time.temporal.TemporalUnit) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_minus_long_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minus(java.time.temporal.TemporalAmount) public
     * java.time.LocalDateTime java.time.LocalDateTime.minus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minus(java.time.temporal.TemporalAmount) public
     * java.time.LocalDateTime java.time.LocalDateTime.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minus(java.time.temporal.TemporalAmount) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_minus_TemporalAmount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusHours(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusHours(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusHours(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusHours(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minusHours(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minusHours(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minusHours_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getDayOfYear() public int java.time.LocalDateTime.getDayOfYear()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getDayOfYear() public int java.time.LocalDateTime.getDayOfYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getDayOfYear() public int java.time.LocalDateTime.getDayOfYear() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDayOfYear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getHour() public int java.time.LocalDateTime.getHour()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getHour() public int java.time.LocalDateTime.getHour()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getHour() public int java.time.LocalDateTime.getHour() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHour()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusWeeks(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusWeeks(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusWeeks(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusWeeks(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plusWeeks(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.plusWeeks(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_plusWeeks_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#withMinute(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withMinute(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#withMinute(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withMinute(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#withMinute(int) public java.time.LocalDateTime
     *      java.time.LocalDateTime.withMinute(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withMinute_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusMinutes(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusMinutes(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusMinutes(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusMinutes(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minusMinutes(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minusMinutes(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minusMinutes_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusDays(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusDays(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusDays(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusDays(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plusDays(long) public java.time.LocalDateTime java.time.LocalDateTime.plusDays(long)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_plusDays_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#hashCode() public int java.time.LocalDateTime.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#hashCode() public int java.time.LocalDateTime.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#hashCode() public int java.time.LocalDateTime.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.LocalDateTime#get(java.time.temporal.TemporalField) public int
     * java.time.LocalDateTime.get(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#get(java.time.temporal.TemporalField) public int
     * java.time.LocalDateTime.get(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#get(java.time.temporal.TemporalField) public int
     *      java.time.LocalDateTime.get(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusWeeks(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusWeeks(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusWeeks(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusWeeks(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minusWeeks(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minusWeeks(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minusWeeks_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#withDayOfYear(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withDayOfYear(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#withDayOfYear(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withDayOfYear(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#withDayOfYear(int) public java.time.LocalDateTime
     *      java.time.LocalDateTime.withDayOfYear(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withDayOfYear_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#atZone(java.time.ZoneId) public java.time.ZonedDateTime
     * java.time.LocalDateTime.atZone(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#atZone(java.time.ZoneId) public java.time.ZonedDateTime
     * java.time.LocalDateTime.atZone(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#atZone(java.time.ZoneId) public java.time.ZonedDateTime
     *      java.time.LocalDateTime.atZone(java.time.ZoneId) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_atZone_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#isBefore(java.time.chrono.ChronoLocalDateTime) public boolean
     * java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime<?>)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#isBefore(java.time.chrono.ChronoLocalDateTime) public boolean
     * java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#isBefore(java.time.chrono.ChronoLocalDateTime) public boolean
     *      java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isBefore_ChronoLocalDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusDays(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusDays(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusDays(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusDays(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minusDays(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minusDays(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minusDays_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getMonthValue() public int
     * java.time.LocalDateTime.getMonthValue()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getMonthValue() public int
     * java.time.LocalDateTime.getMonthValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getMonthValue() public int java.time.LocalDateTime.getMonthValue() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMonthValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusYears(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusYears(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusYears(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusYears(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minusYears(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minusYears(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minusYears_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#atOffset(java.time.ZoneOffset) public java.time.OffsetDateTime
     * java.time.LocalDateTime.atOffset(java.time.ZoneOffset)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#atOffset(java.time.ZoneOffset) public java.time.OffsetDateTime
     * java.time.LocalDateTime.atOffset(java.time.ZoneOffset)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#atOffset(java.time.ZoneOffset) public java.time.OffsetDateTime
     *      java.time.LocalDateTime.atOffset(java.time.ZoneOffset) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atOffset_ZoneOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getSecond() public int java.time.LocalDateTime.getSecond()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getSecond() public int java.time.LocalDateTime.getSecond()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getSecond() public int java.time.LocalDateTime.getSecond() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSecond()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#toString() public java.lang.String
     * java.time.LocalDateTime.toString()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#toString() public java.lang.String
     * java.time.LocalDateTime.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#toString() public java.lang.String java.time.LocalDateTime.toString() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link java.time.LocalDateTime#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     * java.time.LocalDateTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for
     * {@link java.time.LocalDateTime#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     * java.time.LocalDateTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     *      java.time.LocalDateTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_until_Temporal_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getDayOfMonth() public int
     * java.time.LocalDateTime.getDayOfMonth()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getDayOfMonth() public int
     * java.time.LocalDateTime.getDayOfMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getDayOfMonth() public int java.time.LocalDateTime.getDayOfMonth() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDayOfMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusSeconds(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusSeconds(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusSeconds(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusSeconds(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minusSeconds(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minusSeconds(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minusSeconds_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#withSecond(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withSecond(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#withSecond(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withSecond(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#withSecond(int) public java.time.LocalDateTime
     *      java.time.LocalDateTime.withSecond(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withSecond_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getLong(java.time.temporal.TemporalField) public long
     * java.time.LocalDateTime.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getLong(java.time.temporal.TemporalField) public long
     * java.time.LocalDateTime.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getLong(java.time.temporal.TemporalField) public long
     *      java.time.LocalDateTime.getLong(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getLong_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#withNano(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withNano(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#withNano(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withNano(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#withNano(int) public java.time.LocalDateTime java.time.LocalDateTime.withNano(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withNano_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#with(java.time.temporal.TemporalAdjuster) public
     * java.time.LocalDateTime java.time.LocalDateTime.with(java.time.temporal.TemporalAdjuster)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#with(java.time.temporal.TemporalAdjuster) public
     * java.time.LocalDateTime java.time.LocalDateTime.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#with(java.time.temporal.TemporalAdjuster) public java.time.LocalDateTime
     *      java.time.LocalDateTime.with(java.time.temporal.TemporalAdjuster) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_with_TemporalAdjuster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#with(java.time.temporal.TemporalField, long) public
     * java.time.LocalDateTime java.time.LocalDateTime.with(java.time.temporal.TemporalField,long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#with(java.time.temporal.TemporalField, long) public
     * java.time.LocalDateTime java.time.LocalDateTime.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#with(java.time.temporal.TemporalField, long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.with(java.time.temporal.TemporalField,long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_with_TemporalField_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusMonths(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusMonths(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusMonths(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusMonths(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minusMonths(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minusMonths(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minusMonths_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#toLocalDate() public java.time.LocalDate
     * java.time.LocalDateTime.toLocalDate()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#toLocalDate() public java.time.LocalDate
     * java.time.LocalDateTime.toLocalDate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#toLocalDate() public java.time.LocalDate java.time.LocalDateTime.toLocalDate() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toLocalDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#equals(Object) public boolean
     * java.time.LocalDateTime.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#equals(Object) public boolean
     * java.time.LocalDateTime.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#equals(Object) public boolean java.time.LocalDateTime.equals(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.LocalDateTime#toLocalTime() public java.time.LocalTime
     * java.time.LocalDateTime.toLocalTime()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#toLocalTime() public java.time.LocalTime
     * java.time.LocalDateTime.toLocalTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#toLocalTime() public java.time.LocalTime java.time.LocalDateTime.toLocalTime() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toLocalTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#compareTo(java.time.chrono.ChronoLocalDateTime) public int
     * java.time.LocalDateTime.compareTo(java.time.chrono.ChronoLocalDateTime<?>)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#compareTo(java.time.chrono.ChronoLocalDateTime) public int
     * java.time.LocalDateTime.compareTo(java.time.chrono.ChronoLocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#compareTo(java.time.chrono.ChronoLocalDateTime) public int
     *      java.time.LocalDateTime.compareTo(java.time.chrono.ChronoLocalDateTime) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_compareTo_ChronoLocalDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusHours(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusHours(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusHours(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusHours(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plusHours(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.plusHours(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_plusHours_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#isEqual(java.time.chrono.ChronoLocalDateTime) public boolean
     * java.time.LocalDateTime.isEqual(java.time.chrono.ChronoLocalDateTime<?>)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#isEqual(java.time.chrono.ChronoLocalDateTime) public boolean
     * java.time.LocalDateTime.isEqual(java.time.chrono.ChronoLocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#isEqual(java.time.chrono.ChronoLocalDateTime) public boolean
     *      java.time.LocalDateTime.isEqual(java.time.chrono.ChronoLocalDateTime) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isEqual_ChronoLocalDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusSeconds(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusSeconds(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusSeconds(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusSeconds(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plusSeconds(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.plusSeconds(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_plusSeconds_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getMinute() public int java.time.LocalDateTime.getMinute()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getMinute() public int java.time.LocalDateTime.getMinute()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getMinute() public int java.time.LocalDateTime.getMinute() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getMonth() public java.time.Month
     * java.time.LocalDateTime.getMonth()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getMonth() public java.time.Month
     * java.time.LocalDateTime.getMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getMonth() public java.time.Month java.time.LocalDateTime.getMonth() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusNanos(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusNanos(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusNanos(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusNanos(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plusNanos(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.plusNanos(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_plusNanos_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getDayOfWeek() public java.time.DayOfWeek
     * java.time.LocalDateTime.getDayOfWeek()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getDayOfWeek() public java.time.DayOfWeek
     * java.time.LocalDateTime.getDayOfWeek()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getDayOfWeek() public java.time.DayOfWeek java.time.LocalDateTime.getDayOfWeek()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDayOfWeek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#format(java.time.format.DateTimeFormatter) public java.lang.String
     *      java.time.LocalDateTime.format(java.time.format.DateTimeFormatter) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_format_DateTimeFormatter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getNano() public int java.time.LocalDateTime.getNano()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getNano() public int java.time.LocalDateTime.getNano()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getNano() public int java.time.LocalDateTime.getNano() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNano()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusNanos(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusNanos(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#minusNanos(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.minusNanos(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#minusNanos(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.minusNanos(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minusNanos_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.LocalDateTime.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.LocalDateTime.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#isSupported(java.time.temporal.TemporalField) public boolean
     *      java.time.LocalDateTime.isSupported(java.time.temporal.TemporalField) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isSupported_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.LocalDateTime.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.LocalDateTime.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#isSupported(java.time.temporal.TemporalUnit) public boolean
     *      java.time.LocalDateTime.isSupported(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isSupported_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plus(long, java.time.temporal.TemporalUnit) public
     * java.time.LocalDateTime java.time.LocalDateTime.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plus(long, java.time.temporal.TemporalUnit) public
     * java.time.LocalDateTime java.time.LocalDateTime.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plus(long, java.time.temporal.TemporalUnit) public java.time.LocalDateTime
     *      java.time.LocalDateTime.plus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_plus_long_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plus(java.time.temporal.TemporalAmount) public
     * java.time.LocalDateTime java.time.LocalDateTime.plus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plus(java.time.temporal.TemporalAmount) public
     * java.time.LocalDateTime java.time.LocalDateTime.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plus(java.time.temporal.TemporalAmount) public java.time.LocalDateTime
     *      java.time.LocalDateTime.plus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_plus_TemporalAmount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#withHour(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withHour(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#withHour(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withHour(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#withHour(int) public java.time.LocalDateTime java.time.LocalDateTime.withHour(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withHour_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusMonths(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusMonths(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusMonths(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusMonths(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plusMonths(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.plusMonths(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_plusMonths_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#query(java.time.temporal.TemporalQuery) public <R> R
     * java.time.LocalDateTime.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#query(java.time.temporal.TemporalQuery) public java.lang.Object
     * java.time.LocalDateTime.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#query(java.time.temporal.TemporalQuery) public java.lang.Object
     *      java.time.LocalDateTime.query(java.time.temporal.TemporalQuery) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_query_TemporalQuery()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#truncatedTo(java.time.temporal.TemporalUnit) public
     * java.time.LocalDateTime java.time.LocalDateTime.truncatedTo(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#truncatedTo(java.time.temporal.TemporalUnit) public
     * java.time.LocalDateTime java.time.LocalDateTime.truncatedTo(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#truncatedTo(java.time.temporal.TemporalUnit) public java.time.LocalDateTime
     *      java.time.LocalDateTime.truncatedTo(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_truncatedTo_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusYears(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusYears(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#plusYears(long) public java.time.LocalDateTime
     * java.time.LocalDateTime.plusYears(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#plusYears(long) public java.time.LocalDateTime
     *      java.time.LocalDateTime.plusYears(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_plusYears_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#withDayOfMonth(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withDayOfMonth(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#withDayOfMonth(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withDayOfMonth(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#withDayOfMonth(int) public java.time.LocalDateTime
     *      java.time.LocalDateTime.withDayOfMonth(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withDayOfMonth_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#withMonth(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withMonth(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#withMonth(int) public java.time.LocalDateTime
     * java.time.LocalDateTime.withMonth(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#withMonth(int) public java.time.LocalDateTime java.time.LocalDateTime.withMonth(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withMonth_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#isAfter(java.time.chrono.ChronoLocalDateTime) public boolean
     * java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime<?>)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#isAfter(java.time.chrono.ChronoLocalDateTime) public boolean
     * java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#isAfter(java.time.chrono.ChronoLocalDateTime) public boolean
     *      java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isAfter_ChronoLocalDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#getYear() public int java.time.LocalDateTime.getYear()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDateTime#getYear() public int java.time.LocalDateTime.getYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDateTime#getYear() public int java.time.LocalDateTime.getYear() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getYear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
