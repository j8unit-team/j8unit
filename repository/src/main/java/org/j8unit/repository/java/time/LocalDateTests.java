package org.j8unit.repository.java.time;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.LocalDate class java.time.LocalDate}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link LocalDateClassTests}.
 * </p>
 *
 * @see java.time.LocalDate class java.time.LocalDate (the hereby targeted class-under-test class)
 * @see LocalDateClassTests LocalDateClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LocalDateTests<SUT extends java.time.LocalDate>
extends org.j8unit.repository.java.time.temporal.TemporalTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT>,
org.j8unit.repository.java.time.chrono.ChronoLocalDateTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#getYear() public int java.time.LocalDate.getYear()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#getYear() public int java.time.LocalDate.getYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#getYear() public int java.time.LocalDate.getYear() (the hereby targeted
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
     * Test method for {@link java.time.LocalDate#atTime(java.time.OffsetTime) public java.time.OffsetDateTime
     * java.time.LocalDate.atTime(java.time.OffsetTime)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#atTime(java.time.OffsetTime) public java.time.OffsetDateTime
     * java.time.LocalDate.atTime(java.time.OffsetTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#atTime(java.time.OffsetTime) public java.time.OffsetDateTime
     *      java.time.LocalDate.atTime(java.time.OffsetTime) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atTime_OffsetTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#atTime(int, int, int, int) public java.time.LocalDateTime
     * java.time.LocalDate.atTime(int,int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#atTime(int, int, int, int) public java.time.LocalDateTime
     * java.time.LocalDate.atTime(int,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#atTime(int, int, int, int) public java.time.LocalDateTime
     *      java.time.LocalDate.atTime(int,int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atTime_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#atTime(int, int, int) public java.time.LocalDateTime
     * java.time.LocalDate.atTime(int,int,int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#atTime(int, int, int) public java.time.LocalDateTime
     * java.time.LocalDate.atTime(int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#atTime(int, int, int) public java.time.LocalDateTime
     *      java.time.LocalDate.atTime(int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atTime_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#atTime(int, int) public java.time.LocalDateTime
     * java.time.LocalDate.atTime(int,int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#atTime(int, int) public java.time.LocalDateTime
     * java.time.LocalDate.atTime(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#atTime(int, int) public java.time.LocalDateTime java.time.LocalDate.atTime(int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atTime_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#atTime(java.time.LocalTime) public java.time.LocalDateTime
     * java.time.LocalDate.atTime(java.time.LocalTime)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#atTime(java.time.LocalTime) public java.time.LocalDateTime
     * java.time.LocalDate.atTime(java.time.LocalTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#atTime(java.time.LocalTime) public java.time.LocalDateTime
     *      java.time.LocalDate.atTime(java.time.LocalTime) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_atTime_LocalTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#withMonth(int) public java.time.LocalDate
     * java.time.LocalDate.withMonth(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#withMonth(int) public java.time.LocalDate
     * java.time.LocalDate.withMonth(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#withMonth(int) public java.time.LocalDate java.time.LocalDate.withMonth(int) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#isAfter(java.time.chrono.ChronoLocalDate) public boolean
     * java.time.LocalDate.isAfter(java.time.chrono.ChronoLocalDate)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#isAfter(java.time.chrono.ChronoLocalDate) public boolean
     * java.time.LocalDate.isAfter(java.time.chrono.ChronoLocalDate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#isAfter(java.time.chrono.ChronoLocalDate) public boolean
     *      java.time.LocalDate.isAfter(java.time.chrono.ChronoLocalDate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isAfter_ChronoLocalDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#withDayOfMonth(int) public java.time.LocalDate
     * java.time.LocalDate.withDayOfMonth(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#withDayOfMonth(int) public java.time.LocalDate
     * java.time.LocalDate.withDayOfMonth(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#withDayOfMonth(int) public java.time.LocalDate java.time.LocalDate.withDayOfMonth(int)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#query(java.time.temporal.TemporalQuery) public <R> R
     * java.time.LocalDate.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#query(java.time.temporal.TemporalQuery) public java.lang.Object
     * java.time.LocalDate.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#query(java.time.temporal.TemporalQuery) public java.lang.Object
     *      java.time.LocalDate.query(java.time.temporal.TemporalQuery) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#plusYears(long) public java.time.LocalDate
     * java.time.LocalDate.plusYears(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#plusYears(long) public java.time.LocalDate
     * java.time.LocalDate.plusYears(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#plusYears(long) public java.time.LocalDate java.time.LocalDate.plusYears(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#plusMonths(long) public java.time.LocalDate
     * java.time.LocalDate.plusMonths(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#plusMonths(long) public java.time.LocalDate
     * java.time.LocalDate.plusMonths(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#plusMonths(long) public java.time.LocalDate java.time.LocalDate.plusMonths(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#plus(long, java.time.temporal.TemporalUnit) public java.time.LocalDate
     * java.time.LocalDate.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#plus(long, java.time.temporal.TemporalUnit) public java.time.LocalDate
     * java.time.LocalDate.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#plus(long, java.time.temporal.TemporalUnit) public java.time.LocalDate
     *      java.time.LocalDate.plus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#plus(java.time.temporal.TemporalAmount) public java.time.LocalDate
     * java.time.LocalDate.plus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#plus(java.time.temporal.TemporalAmount) public java.time.LocalDate
     * java.time.LocalDate.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#plus(java.time.temporal.TemporalAmount) public java.time.LocalDate
     *      java.time.LocalDate.plus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.LocalDate.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.LocalDate.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#isSupported(java.time.temporal.TemporalField) public boolean
     *      java.time.LocalDate.isSupported(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.LocalDate.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.LocalDate.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#isSupported(java.time.temporal.TemporalUnit) public boolean
     *      java.time.LocalDate.isSupported(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.LocalDate.format(java.time.format.DateTimeFormatter)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.LocalDate.format(java.time.format.DateTimeFormatter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#format(java.time.format.DateTimeFormatter) public java.lang.String
     *      java.time.LocalDate.format(java.time.format.DateTimeFormatter) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#getEra() public java.time.chrono.Era java.time.LocalDate.getEra()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#getEra() public java.time.chrono.Era java.time.LocalDate.getEra()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#getEra() public java.time.chrono.Era java.time.LocalDate.getEra() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getEra()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#lengthOfMonth() public int java.time.LocalDate.lengthOfMonth()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#lengthOfMonth() public int java.time.LocalDate.lengthOfMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#lengthOfMonth() public int java.time.LocalDate.lengthOfMonth() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lengthOfMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#getDayOfWeek() public java.time.DayOfWeek
     * java.time.LocalDate.getDayOfWeek()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#getDayOfWeek() public java.time.DayOfWeek
     * java.time.LocalDate.getDayOfWeek()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#getDayOfWeek() public java.time.DayOfWeek java.time.LocalDate.getDayOfWeek() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#getMonth() public java.time.Month java.time.LocalDate.getMonth()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#getMonth() public java.time.Month java.time.LocalDate.getMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#getMonth() public java.time.Month java.time.LocalDate.getMonth() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.LocalDate#isEqual(java.time.chrono.ChronoLocalDate) public boolean
     * java.time.LocalDate.isEqual(java.time.chrono.ChronoLocalDate)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#isEqual(java.time.chrono.ChronoLocalDate) public boolean
     * java.time.LocalDate.isEqual(java.time.chrono.ChronoLocalDate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#isEqual(java.time.chrono.ChronoLocalDate) public boolean
     *      java.time.LocalDate.isEqual(java.time.chrono.ChronoLocalDate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isEqual_ChronoLocalDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#toEpochDay() public long java.time.LocalDate.toEpochDay()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#toEpochDay() public long java.time.LocalDate.toEpochDay()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#toEpochDay() public long java.time.LocalDate.toEpochDay() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toEpochDay()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#atStartOfDay() public java.time.LocalDateTime
     * java.time.LocalDate.atStartOfDay()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#atStartOfDay() public java.time.LocalDateTime
     * java.time.LocalDate.atStartOfDay()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#atStartOfDay() public java.time.LocalDateTime java.time.LocalDate.atStartOfDay() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atStartOfDay()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#atStartOfDay(java.time.ZoneId) public java.time.ZonedDateTime
     * java.time.LocalDate.atStartOfDay(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#atStartOfDay(java.time.ZoneId) public java.time.ZonedDateTime
     * java.time.LocalDate.atStartOfDay(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#atStartOfDay(java.time.ZoneId) public java.time.ZonedDateTime
     *      java.time.LocalDate.atStartOfDay(java.time.ZoneId) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atStartOfDay_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#compareTo(java.time.chrono.ChronoLocalDate) public int
     * java.time.LocalDate.compareTo(java.time.chrono.ChronoLocalDate)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#compareTo(java.time.chrono.ChronoLocalDate) public int
     * java.time.LocalDate.compareTo(java.time.chrono.ChronoLocalDate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#compareTo(java.time.chrono.ChronoLocalDate) public int
     *      java.time.LocalDate.compareTo(java.time.chrono.ChronoLocalDate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_compareTo_ChronoLocalDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#equals(Object) public boolean
     * java.time.LocalDate.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#equals(Object) public boolean
     * java.time.LocalDate.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#equals(Object) public boolean java.time.LocalDate.equals(java.lang.Object) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#with(java.time.temporal.TemporalField, long) public
     * java.time.LocalDate java.time.LocalDate.with(java.time.temporal.TemporalField,long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#with(java.time.temporal.TemporalField, long) public
     * java.time.LocalDate java.time.LocalDate.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#with(java.time.temporal.TemporalField, long) public java.time.LocalDate
     *      java.time.LocalDate.with(java.time.temporal.TemporalField,long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#with(java.time.temporal.TemporalAdjuster) public java.time.LocalDate
     * java.time.LocalDate.with(java.time.temporal.TemporalAdjuster)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#with(java.time.temporal.TemporalAdjuster) public java.time.LocalDate
     * java.time.LocalDate.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#with(java.time.temporal.TemporalAdjuster) public java.time.LocalDate
     *      java.time.LocalDate.with(java.time.temporal.TemporalAdjuster) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#minusMonths(long) public java.time.LocalDate
     * java.time.LocalDate.minusMonths(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#minusMonths(long) public java.time.LocalDate
     * java.time.LocalDate.minusMonths(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#minusMonths(long) public java.time.LocalDate java.time.LocalDate.minusMonths(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#getLong(java.time.temporal.TemporalField) public long
     * java.time.LocalDate.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#getLong(java.time.temporal.TemporalField) public long
     * java.time.LocalDate.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#getLong(java.time.temporal.TemporalField) public long
     *      java.time.LocalDate.getLong(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#getDayOfMonth() public int java.time.LocalDate.getDayOfMonth()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#getDayOfMonth() public int java.time.LocalDate.getDayOfMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#getDayOfMonth() public int java.time.LocalDate.getDayOfMonth() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.LocalDate#toString() public java.lang.String java.time.LocalDate.toString()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#toString() public java.lang.String java.time.LocalDate.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#toString() public java.lang.String java.time.LocalDate.toString() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.LocalDate#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * public long java.time.LocalDate.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * public long java.time.LocalDate.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     *      java.time.LocalDate.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.LocalDate#until(java.time.chrono.ChronoLocalDate) public java.time.Period
     * java.time.LocalDate.until(java.time.chrono.ChronoLocalDate)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#until(java.time.chrono.ChronoLocalDate) public java.time.Period
     * java.time.LocalDate.until(java.time.chrono.ChronoLocalDate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#until(java.time.chrono.ChronoLocalDate) public java.time.Period
     *      java.time.LocalDate.until(java.time.chrono.ChronoLocalDate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_until_ChronoLocalDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#minusYears(long) public java.time.LocalDate
     * java.time.LocalDate.minusYears(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#minusYears(long) public java.time.LocalDate
     * java.time.LocalDate.minusYears(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#minusYears(long) public java.time.LocalDate java.time.LocalDate.minusYears(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#getMonthValue() public int java.time.LocalDate.getMonthValue()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#getMonthValue() public int java.time.LocalDate.getMonthValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#getMonthValue() public int java.time.LocalDate.getMonthValue() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.LocalDate#minusDays(long) public java.time.LocalDate
     * java.time.LocalDate.minusDays(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#minusDays(long) public java.time.LocalDate
     * java.time.LocalDate.minusDays(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#minusDays(long) public java.time.LocalDate java.time.LocalDate.minusDays(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#isBefore(java.time.chrono.ChronoLocalDate) public boolean
     * java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#isBefore(java.time.chrono.ChronoLocalDate) public boolean
     * java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#isBefore(java.time.chrono.ChronoLocalDate) public boolean
     *      java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isBefore_ChronoLocalDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#isLeapYear() public boolean java.time.LocalDate.isLeapYear()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#isLeapYear() public boolean java.time.LocalDate.isLeapYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#isLeapYear() public boolean java.time.LocalDate.isLeapYear() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isLeapYear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#withDayOfYear(int) public java.time.LocalDate
     * java.time.LocalDate.withDayOfYear(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#withDayOfYear(int) public java.time.LocalDate
     * java.time.LocalDate.withDayOfYear(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#withDayOfYear(int) public java.time.LocalDate java.time.LocalDate.withDayOfYear(int)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#minusWeeks(long) public java.time.LocalDate
     * java.time.LocalDate.minusWeeks(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#minusWeeks(long) public java.time.LocalDate
     * java.time.LocalDate.minusWeeks(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#minusWeeks(long) public java.time.LocalDate java.time.LocalDate.minusWeeks(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#get(java.time.temporal.TemporalField) public int
     * java.time.LocalDate.get(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#get(java.time.temporal.TemporalField) public int
     * java.time.LocalDate.get(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#get(java.time.temporal.TemporalField) public int
     *      java.time.LocalDate.get(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#hashCode() public int java.time.LocalDate.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#hashCode() public int java.time.LocalDate.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#hashCode() public int java.time.LocalDate.hashCode() (the hereby targeted
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
     * Test method for {@link java.time.LocalDate#plusDays(long) public java.time.LocalDate
     * java.time.LocalDate.plusDays(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#plusDays(long) public java.time.LocalDate
     * java.time.LocalDate.plusDays(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#plusDays(long) public java.time.LocalDate java.time.LocalDate.plusDays(long) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#lengthOfYear() public int java.time.LocalDate.lengthOfYear()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#lengthOfYear() public int java.time.LocalDate.lengthOfYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#lengthOfYear() public int java.time.LocalDate.lengthOfYear() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lengthOfYear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#getChronology() public java.time.chrono.IsoChronology
     * java.time.LocalDate.getChronology()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#getChronology() public java.time.chrono.IsoChronology
     * java.time.LocalDate.getChronology()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#getChronology() public java.time.chrono.IsoChronology
     *      java.time.LocalDate.getChronology() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getChronology()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDate#plusWeeks(long) public java.time.LocalDate
     * java.time.LocalDate.plusWeeks(long)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#plusWeeks(long) public java.time.LocalDate
     * java.time.LocalDate.plusWeeks(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#plusWeeks(long) public java.time.LocalDate java.time.LocalDate.plusWeeks(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#getDayOfYear() public int java.time.LocalDate.getDayOfYear()}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#getDayOfYear() public int java.time.LocalDate.getDayOfYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#getDayOfYear() public int java.time.LocalDate.getDayOfYear() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.LocalDate#minus(java.time.temporal.TemporalAmount) public java.time.LocalDate
     * java.time.LocalDate.minus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#minus(java.time.temporal.TemporalAmount) public java.time.LocalDate
     * java.time.LocalDate.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#minus(java.time.temporal.TemporalAmount) public java.time.LocalDate
     *      java.time.LocalDate.minus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.LocalDate java.time.LocalDate.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.LocalDate java.time.LocalDate.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#minus(long, java.time.temporal.TemporalUnit) public java.time.LocalDate
     *      java.time.LocalDate.minus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#withYear(int) public java.time.LocalDate
     * java.time.LocalDate.withYear(int)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#withYear(int) public java.time.LocalDate
     * java.time.LocalDate.withYear(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#withYear(int) public java.time.LocalDate java.time.LocalDate.withYear(int) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.LocalDate.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.LocalDate.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#range(java.time.temporal.TemporalField) public java.time.temporal.ValueRange
     *      java.time.LocalDate.range(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.LocalDate#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.LocalDate.adjustInto(java.time.temporal.Temporal)}.
     *
     * <p>
     * Test method for {@link java.time.LocalDate#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.LocalDate.adjustInto(java.time.temporal.Temporal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.LocalDate#adjustInto(java.time.temporal.Temporal) public java.time.temporal.Temporal
     *      java.time.LocalDate.adjustInto(java.time.temporal.Temporal) (the hereby targeted method-under-test)
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

}
