package org.j8unit.repository.java.time;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.ZonedDateTime class java.time.ZonedDateTime}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ZonedDateTimeClassTests}.
 * </p>
 *
 * @see java.time.ZonedDateTime class java.time.ZonedDateTime (the hereby targeted class-under-test class)
 * @see ZonedDateTimeClassTests ZonedDateTimeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ZonedDateTimeTests<SUT extends java.time.ZonedDateTime>
extends org.j8unit.repository.java.time.temporal.TemporalTests<SUT>, org.j8unit.repository.java.time.chrono.ChronoZonedDateTimeTests<SUT, java.time.LocalDate>,
org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plusHours(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusHours(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plusHours(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusHours(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plusHours(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.plusHours(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#toLocalTime() public java.time.LocalTime
     * java.time.ZonedDateTime.toLocalTime()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#toLocalTime() public java.time.LocalTime
     * java.time.ZonedDateTime.toLocalTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#toLocalTime() public java.time.LocalTime java.time.ZonedDateTime.toLocalTime() (the
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
     * Test method for {@link java.time.ZonedDateTime#getDayOfWeek() public java.time.DayOfWeek
     * java.time.ZonedDateTime.getDayOfWeek()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getDayOfWeek() public java.time.DayOfWeek
     * java.time.ZonedDateTime.getDayOfWeek()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getDayOfWeek() public java.time.DayOfWeek java.time.ZonedDateTime.getDayOfWeek()
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
     * Test method for {@link java.time.ZonedDateTime#getMonth() public java.time.Month
     * java.time.ZonedDateTime.getMonth()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getMonth() public java.time.Month
     * java.time.ZonedDateTime.getMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getMonth() public java.time.Month java.time.ZonedDateTime.getMonth() (the hereby
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
     * Test method for {@link java.time.ZonedDateTime#plusNanos(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusNanos(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plusNanos(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusNanos(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plusNanos(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.plusNanos(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#plusSeconds(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusSeconds(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plusSeconds(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusSeconds(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plusSeconds(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.plusSeconds(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#getMinute() public int java.time.ZonedDateTime.getMinute()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getMinute() public int java.time.ZonedDateTime.getMinute()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getMinute() public int java.time.ZonedDateTime.getMinute() (the hereby targeted
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
     * Test method for {@link java.time.ZonedDateTime#query(java.time.temporal.TemporalQuery) public <R> R
     * java.time.ZonedDateTime.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#query(java.time.temporal.TemporalQuery) public java.lang.Object
     * java.time.ZonedDateTime.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#query(java.time.temporal.TemporalQuery) public java.lang.Object
     *      java.time.ZonedDateTime.query(java.time.temporal.TemporalQuery) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#truncatedTo(java.time.temporal.TemporalUnit) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.truncatedTo(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#truncatedTo(java.time.temporal.TemporalUnit) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.truncatedTo(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#truncatedTo(java.time.temporal.TemporalUnit) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.truncatedTo(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#plusYears(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusYears(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plusYears(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusYears(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plusYears(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.plusYears(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#plusMonths(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusMonths(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plusMonths(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusMonths(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plusMonths(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.plusMonths(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#withHour(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withHour(int)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withHour(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withHour(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withHour(int) public java.time.ZonedDateTime java.time.ZonedDateTime.withHour(int)
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
     * Test method for {@link java.time.ZonedDateTime#plus(long, java.time.temporal.TemporalUnit) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plus(long, java.time.temporal.TemporalUnit) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plus(long, java.time.temporal.TemporalUnit) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.plus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#plus(java.time.temporal.TemporalAmount) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.plus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plus(java.time.temporal.TemporalAmount) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plus(java.time.temporal.TemporalAmount) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.plus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.ZonedDateTime.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.ZonedDateTime.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#isSupported(java.time.temporal.TemporalField) public boolean
     *      java.time.ZonedDateTime.isSupported(java.time.temporal.TemporalField) (the hereby targeted
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
     * Test method for {@link java.time.ZonedDateTime#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.ZonedDateTime.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.ZonedDateTime.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#isSupported(java.time.temporal.TemporalUnit) public boolean
     *      java.time.ZonedDateTime.isSupported(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#getZone() public java.time.ZoneId
     * java.time.ZonedDateTime.getZone()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getZone() public java.time.ZoneId
     * java.time.ZonedDateTime.getZone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getZone() public java.time.ZoneId java.time.ZonedDateTime.getZone() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getZone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.ZonedDateTime.format(java.time.format.DateTimeFormatter)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.ZonedDateTime.format(java.time.format.DateTimeFormatter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#format(java.time.format.DateTimeFormatter) public java.lang.String
     *      java.time.ZonedDateTime.format(java.time.format.DateTimeFormatter) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#getNano() public int java.time.ZonedDateTime.getNano()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getNano() public int java.time.ZonedDateTime.getNano()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getNano() public int java.time.ZonedDateTime.getNano() (the hereby targeted
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
     * Test method for {@link java.time.ZonedDateTime#minusNanos(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusNanos(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusNanos(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusNanos(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minusNanos(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minusNanos(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#toLocalDateTime() public java.time.LocalDateTime
     * java.time.ZonedDateTime.toLocalDateTime()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#toLocalDateTime() public java.time.LocalDateTime
     * java.time.ZonedDateTime.toLocalDateTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#toLocalDateTime() public java.time.LocalDateTime
     *      java.time.ZonedDateTime.toLocalDateTime() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toLocalDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getYear() public int java.time.ZonedDateTime.getYear()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getYear() public int java.time.ZonedDateTime.getYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getYear() public int java.time.ZonedDateTime.getYear() (the hereby targeted
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

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#toOffsetDateTime() public java.time.OffsetDateTime
     * java.time.ZonedDateTime.toOffsetDateTime()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#toOffsetDateTime() public java.time.OffsetDateTime
     * java.time.ZonedDateTime.toOffsetDateTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#toOffsetDateTime() public java.time.OffsetDateTime
     *      java.time.ZonedDateTime.toOffsetDateTime() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toOffsetDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withMonth(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withMonth(int)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withMonth(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withMonth(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withMonth(int) public java.time.ZonedDateTime java.time.ZonedDateTime.withMonth(int)
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
     * Test method for {@link java.time.ZonedDateTime#withDayOfMonth(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withDayOfMonth(int)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withDayOfMonth(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withDayOfMonth(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withDayOfMonth(int) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.withDayOfMonth(int) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#getOffset() public java.time.ZoneOffset
     * java.time.ZonedDateTime.getOffset()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getOffset() public java.time.ZoneOffset
     * java.time.ZonedDateTime.getOffset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getOffset() public java.time.ZoneOffset java.time.ZonedDateTime.getOffset() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusHours(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusHours(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusHours(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusHours(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minusHours(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minusHours(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#withFixedOffsetZone() public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withFixedOffsetZone()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withFixedOffsetZone() public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withFixedOffsetZone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withFixedOffsetZone() public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.withFixedOffsetZone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withFixedOffsetZone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minus(java.time.temporal.TemporalAmount) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.minus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minus(java.time.temporal.TemporalAmount) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minus(java.time.temporal.TemporalAmount) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minus(long, java.time.temporal.TemporalUnit) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#withYear(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withYear(int)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withYear(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withYear(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withYear(int) public java.time.ZonedDateTime java.time.ZonedDateTime.withYear(int)
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
     * Test method for {@link java.time.ZonedDateTime#plusMinutes(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusMinutes(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plusMinutes(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusMinutes(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plusMinutes(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.plusMinutes(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.ZonedDateTime.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.ZonedDateTime.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#range(java.time.temporal.TemporalField) public java.time.temporal.ValueRange
     *      java.time.ZonedDateTime.range(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#get(java.time.temporal.TemporalField) public int
     * java.time.ZonedDateTime.get(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#get(java.time.temporal.TemporalField) public int
     * java.time.ZonedDateTime.get(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#get(java.time.temporal.TemporalField) public int
     *      java.time.ZonedDateTime.get(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#hashCode() public int java.time.ZonedDateTime.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#hashCode() public int java.time.ZonedDateTime.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#hashCode() public int java.time.ZonedDateTime.hashCode() (the hereby targeted
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
     * Test method for {@link java.time.ZonedDateTime#withLaterOffsetAtOverlap() public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withLaterOffsetAtOverlap()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withLaterOffsetAtOverlap() public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withLaterOffsetAtOverlap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withLaterOffsetAtOverlap() public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.withLaterOffsetAtOverlap() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_withLaterOffsetAtOverlap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusMinutes(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusMinutes(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusMinutes(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusMinutes(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minusMinutes(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minusMinutes(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#plusDays(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusDays(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plusDays(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusDays(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plusDays(long) public java.time.ZonedDateTime java.time.ZonedDateTime.plusDays(long)
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
     * Test method for {@link java.time.ZonedDateTime#withMinute(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withMinute(int)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withMinute(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withMinute(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withMinute(int) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.withMinute(int) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#getHour() public int java.time.ZonedDateTime.getHour()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getHour() public int java.time.ZonedDateTime.getHour()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getHour() public int java.time.ZonedDateTime.getHour() (the hereby targeted
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
     * Test method for {@link java.time.ZonedDateTime#plusWeeks(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusWeeks(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#plusWeeks(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.plusWeeks(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#plusWeeks(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.plusWeeks(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#getDayOfYear() public int java.time.ZonedDateTime.getDayOfYear()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getDayOfYear() public int java.time.ZonedDateTime.getDayOfYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getDayOfYear() public int java.time.ZonedDateTime.getDayOfYear() (the hereby
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
     * Test method for {@link java.time.ZonedDateTime#withEarlierOffsetAtOverlap() public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withEarlierOffsetAtOverlap()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withEarlierOffsetAtOverlap() public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withEarlierOffsetAtOverlap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withEarlierOffsetAtOverlap() public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.withEarlierOffsetAtOverlap() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_withEarlierOffsetAtOverlap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withZoneSameLocal(java.time.ZoneId) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withZoneSameLocal(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withZoneSameLocal(java.time.ZoneId) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withZoneSameLocal(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withZoneSameLocal(java.time.ZoneId) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.withZoneSameLocal(java.time.ZoneId) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_withZoneSameLocal_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withZoneSameInstant(java.time.ZoneId) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.withZoneSameInstant(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withZoneSameInstant(java.time.ZoneId) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.withZoneSameInstant(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withZoneSameInstant(java.time.ZoneId) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.withZoneSameInstant(java.time.ZoneId) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_withZoneSameInstant_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusYears(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusYears(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusYears(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusYears(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minusYears(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minusYears(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#getMonthValue() public int
     * java.time.ZonedDateTime.getMonthValue()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getMonthValue() public int
     * java.time.ZonedDateTime.getMonthValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getMonthValue() public int java.time.ZonedDateTime.getMonthValue() (the hereby
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
     * Test method for {@link java.time.ZonedDateTime#minusDays(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusDays(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusDays(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusDays(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minusDays(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minusDays(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#withDayOfYear(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withDayOfYear(int)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withDayOfYear(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withDayOfYear(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withDayOfYear(int) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.withDayOfYear(int) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#minusWeeks(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusWeeks(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusWeeks(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusWeeks(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minusWeeks(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minusWeeks(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#equals(Object) public boolean
     * java.time.ZonedDateTime.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#equals(Object) public boolean
     * java.time.ZonedDateTime.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#equals(Object) public boolean java.time.ZonedDateTime.equals(java.lang.Object) (the
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
     * Test method for {@link java.time.ZonedDateTime#toLocalDate() public java.time.LocalDate
     * java.time.ZonedDateTime.toLocalDate()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#toLocalDate() public java.time.LocalDate
     * java.time.ZonedDateTime.toLocalDate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#toLocalDate() public java.time.LocalDate java.time.ZonedDateTime.toLocalDate() (the
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
     * Test method for {@link java.time.ZonedDateTime#with(java.time.temporal.TemporalField, long) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.with(java.time.temporal.TemporalField,long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#with(java.time.temporal.TemporalField, long) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#with(java.time.temporal.TemporalField, long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.with(java.time.temporal.TemporalField,long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#with(java.time.temporal.TemporalAdjuster) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.with(java.time.temporal.TemporalAdjuster)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#with(java.time.temporal.TemporalAdjuster) public
     * java.time.ZonedDateTime java.time.ZonedDateTime.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#with(java.time.temporal.TemporalAdjuster) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.with(java.time.temporal.TemporalAdjuster) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#minusMonths(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusMonths(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusMonths(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusMonths(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minusMonths(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minusMonths(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#getLong(java.time.temporal.TemporalField) public long
     * java.time.ZonedDateTime.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getLong(java.time.temporal.TemporalField) public long
     * java.time.ZonedDateTime.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getLong(java.time.temporal.TemporalField) public long
     *      java.time.ZonedDateTime.getLong(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#withNano(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withNano(int)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withNano(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withNano(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withNano(int) public java.time.ZonedDateTime java.time.ZonedDateTime.withNano(int)
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
     * Test method for {@link java.time.ZonedDateTime#withSecond(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withSecond(int)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#withSecond(int) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.withSecond(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#withSecond(int) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.withSecond(int) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#minusSeconds(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusSeconds(long)}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#minusSeconds(long) public java.time.ZonedDateTime
     * java.time.ZonedDateTime.minusSeconds(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#minusSeconds(long) public java.time.ZonedDateTime
     *      java.time.ZonedDateTime.minusSeconds(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZonedDateTime#getDayOfMonth() public int
     * java.time.ZonedDateTime.getDayOfMonth()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getDayOfMonth() public int
     * java.time.ZonedDateTime.getDayOfMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getDayOfMonth() public int java.time.ZonedDateTime.getDayOfMonth() (the hereby
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
     * Test method for {@link java.time.ZonedDateTime#toString() public java.lang.String
     * java.time.ZonedDateTime.toString()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#toString() public java.lang.String
     * java.time.ZonedDateTime.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#toString() public java.lang.String java.time.ZonedDateTime.toString() (the hereby
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
     * {@link java.time.ZonedDateTime#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     * java.time.ZonedDateTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for
     * {@link java.time.ZonedDateTime#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     * java.time.ZonedDateTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     *      java.time.ZonedDateTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit) (the hereby
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
     * Test method for {@link java.time.ZonedDateTime#getSecond() public int java.time.ZonedDateTime.getSecond()}.
     *
     * <p>
     * Test method for {@link java.time.ZonedDateTime#getSecond() public int java.time.ZonedDateTime.getSecond()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZonedDateTime#getSecond() public int java.time.ZonedDateTime.getSecond() (the hereby targeted
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

}
