package org.j8unit.repository.java.time;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.YearMonth class java.time.YearMonth}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link YearMonthClassTests}.
 * </p>
 *
 * @see java.time.YearMonth class java.time.YearMonth (the hereby targeted class-under-test class)
 * @see YearMonthClassTests YearMonthClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface YearMonthTests<SUT extends java.time.YearMonth>
extends org.j8unit.repository.java.time.temporal.TemporalTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT>,
org.j8unit.repository.java.lang.ComparableTests<SUT, java.time.YearMonth>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.YearMonth#toString() public java.lang.String java.time.YearMonth.toString()}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#toString() public java.lang.String java.time.YearMonth.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#toString() public java.lang.String java.time.YearMonth.toString() (the hereby targeted
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
     * Test method for {@link java.time.YearMonth#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * public long java.time.YearMonth.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * public long java.time.YearMonth.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     *      java.time.YearMonth.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit) (the hereby targeted
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
     * Test method for {@link java.time.YearMonth#withMonth(int) public java.time.YearMonth
     * java.time.YearMonth.withMonth(int)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#withMonth(int) public java.time.YearMonth
     * java.time.YearMonth.withMonth(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#withMonth(int) public java.time.YearMonth java.time.YearMonth.withMonth(int) (the hereby
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
     * Test method for {@link java.time.YearMonth#isAfter(java.time.YearMonth) public boolean
     * java.time.YearMonth.isAfter(java.time.YearMonth)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#isAfter(java.time.YearMonth) public boolean
     * java.time.YearMonth.isAfter(java.time.YearMonth)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#isAfter(java.time.YearMonth) public boolean
     *      java.time.YearMonth.isAfter(java.time.YearMonth) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAfter_YearMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.YearMonth#getLong(java.time.temporal.TemporalField) public long
     * java.time.YearMonth.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#getLong(java.time.temporal.TemporalField) public long
     * java.time.YearMonth.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#getLong(java.time.temporal.TemporalField) public long
     *      java.time.YearMonth.getLong(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#with(java.time.temporal.TemporalField, long) public
     * java.time.YearMonth java.time.YearMonth.with(java.time.temporal.TemporalField,long)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#with(java.time.temporal.TemporalField, long) public
     * java.time.YearMonth java.time.YearMonth.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#with(java.time.temporal.TemporalField, long) public java.time.YearMonth
     *      java.time.YearMonth.with(java.time.temporal.TemporalField,long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#with(java.time.temporal.TemporalAdjuster) public java.time.YearMonth
     * java.time.YearMonth.with(java.time.temporal.TemporalAdjuster)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#with(java.time.temporal.TemporalAdjuster) public java.time.YearMonth
     * java.time.YearMonth.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#with(java.time.temporal.TemporalAdjuster) public java.time.YearMonth
     *      java.time.YearMonth.with(java.time.temporal.TemporalAdjuster) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#minusMonths(long) public java.time.YearMonth
     * java.time.YearMonth.minusMonths(long)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#minusMonths(long) public java.time.YearMonth
     * java.time.YearMonth.minusMonths(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#minusMonths(long) public java.time.YearMonth java.time.YearMonth.minusMonths(long) (the
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
     * Test method for {@link java.time.YearMonth#getYear() public int java.time.YearMonth.getYear()}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#getYear() public int java.time.YearMonth.getYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#getYear() public int java.time.YearMonth.getYear() (the hereby targeted
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
     * Test method for {@link java.time.YearMonth#equals(Object) public boolean
     * java.time.YearMonth.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#equals(Object) public boolean
     * java.time.YearMonth.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#equals(Object) public boolean java.time.YearMonth.equals(java.lang.Object) (the hereby
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
     * Test method for {@link java.time.YearMonth#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.YearMonth.format(java.time.format.DateTimeFormatter)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.YearMonth.format(java.time.format.DateTimeFormatter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#format(java.time.format.DateTimeFormatter) public java.lang.String
     *      java.time.YearMonth.format(java.time.format.DateTimeFormatter) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.YearMonth#isLeapYear() public boolean java.time.YearMonth.isLeapYear()}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#isLeapYear() public boolean java.time.YearMonth.isLeapYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#isLeapYear() public boolean java.time.YearMonth.isLeapYear() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.YearMonth#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.YearMonth.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.YearMonth.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#isSupported(java.time.temporal.TemporalField) public boolean
     *      java.time.YearMonth.isSupported(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.YearMonth.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.YearMonth.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#isSupported(java.time.temporal.TemporalUnit) public boolean
     *      java.time.YearMonth.isSupported(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#plus(java.time.temporal.TemporalAmount) public java.time.YearMonth
     * java.time.YearMonth.plus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#plus(java.time.temporal.TemporalAmount) public java.time.YearMonth
     * java.time.YearMonth.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#plus(java.time.temporal.TemporalAmount) public java.time.YearMonth
     *      java.time.YearMonth.plus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#plus(long, java.time.temporal.TemporalUnit) public java.time.YearMonth
     * java.time.YearMonth.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#plus(long, java.time.temporal.TemporalUnit) public java.time.YearMonth
     * java.time.YearMonth.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#plus(long, java.time.temporal.TemporalUnit) public java.time.YearMonth
     *      java.time.YearMonth.plus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#isBefore(java.time.YearMonth) public boolean
     * java.time.YearMonth.isBefore(java.time.YearMonth)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#isBefore(java.time.YearMonth) public boolean
     * java.time.YearMonth.isBefore(java.time.YearMonth)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#isBefore(java.time.YearMonth) public boolean
     *      java.time.YearMonth.isBefore(java.time.YearMonth) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBefore_YearMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.YearMonth#getMonthValue() public int java.time.YearMonth.getMonthValue()}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#getMonthValue() public int java.time.YearMonth.getMonthValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#getMonthValue() public int java.time.YearMonth.getMonthValue() (the hereby targeted
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
     * Test method for {@link java.time.YearMonth#atDay(int) public java.time.LocalDate java.time.YearMonth.atDay(int)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#atDay(int) public java.time.LocalDate java.time.YearMonth.atDay(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#atDay(int) public java.time.LocalDate java.time.YearMonth.atDay(int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atDay_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.YearMonth#minusYears(long) public java.time.YearMonth
     * java.time.YearMonth.minusYears(long)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#minusYears(long) public java.time.YearMonth
     * java.time.YearMonth.minusYears(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#minusYears(long) public java.time.YearMonth java.time.YearMonth.minusYears(long) (the
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
     * Test method for {@link java.time.YearMonth#plusMonths(long) public java.time.YearMonth
     * java.time.YearMonth.plusMonths(long)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#plusMonths(long) public java.time.YearMonth
     * java.time.YearMonth.plusMonths(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#plusMonths(long) public java.time.YearMonth java.time.YearMonth.plusMonths(long) (the
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
     * Test method for {@link java.time.YearMonth#query(java.time.temporal.TemporalQuery) public <R> R
     * java.time.YearMonth.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#query(java.time.temporal.TemporalQuery) public java.lang.Object
     * java.time.YearMonth.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#query(java.time.temporal.TemporalQuery) public java.lang.Object
     *      java.time.YearMonth.query(java.time.temporal.TemporalQuery) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#plusYears(long) public java.time.YearMonth
     * java.time.YearMonth.plusYears(long)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#plusYears(long) public java.time.YearMonth
     * java.time.YearMonth.plusYears(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#plusYears(long) public java.time.YearMonth java.time.YearMonth.plusYears(long) (the
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
     * Test method for {@link java.time.YearMonth#getMonth() public java.time.Month java.time.YearMonth.getMonth()}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#getMonth() public java.time.Month java.time.YearMonth.getMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#getMonth() public java.time.Month java.time.YearMonth.getMonth() (the hereby targeted
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
     * Test method for {@link java.time.YearMonth#lengthOfYear() public int java.time.YearMonth.lengthOfYear()}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#lengthOfYear() public int java.time.YearMonth.lengthOfYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#lengthOfYear() public int java.time.YearMonth.lengthOfYear() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.YearMonth#lengthOfMonth() public int java.time.YearMonth.lengthOfMonth()}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#lengthOfMonth() public int java.time.YearMonth.lengthOfMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#lengthOfMonth() public int java.time.YearMonth.lengthOfMonth() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.YearMonth#hashCode() public int java.time.YearMonth.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#hashCode() public int java.time.YearMonth.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#hashCode() public int java.time.YearMonth.hashCode() (the hereby targeted
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
     * Test method for {@link java.time.YearMonth#get(java.time.temporal.TemporalField) public int
     * java.time.YearMonth.get(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#get(java.time.temporal.TemporalField) public int
     * java.time.YearMonth.get(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#get(java.time.temporal.TemporalField) public int
     *      java.time.YearMonth.get(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.YearMonth.adjustInto(java.time.temporal.Temporal)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.YearMonth.adjustInto(java.time.temporal.Temporal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#adjustInto(java.time.temporal.Temporal) public java.time.temporal.Temporal
     *      java.time.YearMonth.adjustInto(java.time.temporal.Temporal) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.YearMonth.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.YearMonth.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#range(java.time.temporal.TemporalField) public java.time.temporal.ValueRange
     *      java.time.YearMonth.range(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#isValidDay(int) public boolean java.time.YearMonth.isValidDay(int)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#isValidDay(int) public boolean java.time.YearMonth.isValidDay(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#isValidDay(int) public boolean java.time.YearMonth.isValidDay(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isValidDay_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.YearMonth#compareTo(java.time.YearMonth) public int
     * java.time.YearMonth.compareTo(java.time.YearMonth)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#compareTo(java.time.YearMonth) public int
     * java.time.YearMonth.compareTo(java.time.YearMonth)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#compareTo(java.time.YearMonth) public int
     *      java.time.YearMonth.compareTo(java.time.YearMonth) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_YearMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.YearMonth#withYear(int) public java.time.YearMonth
     * java.time.YearMonth.withYear(int)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#withYear(int) public java.time.YearMonth
     * java.time.YearMonth.withYear(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#withYear(int) public java.time.YearMonth java.time.YearMonth.withYear(int) (the hereby
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
     * Test method for {@link java.time.YearMonth#minus(java.time.temporal.TemporalAmount) public java.time.YearMonth
     * java.time.YearMonth.minus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#minus(java.time.temporal.TemporalAmount) public java.time.YearMonth
     * java.time.YearMonth.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#minus(java.time.temporal.TemporalAmount) public java.time.YearMonth
     *      java.time.YearMonth.minus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.YearMonth java.time.YearMonth.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.YearMonth java.time.YearMonth.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#minus(long, java.time.temporal.TemporalUnit) public java.time.YearMonth
     *      java.time.YearMonth.minus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.YearMonth#atEndOfMonth() public java.time.LocalDate
     * java.time.YearMonth.atEndOfMonth()}.
     *
     * <p>
     * Test method for {@link java.time.YearMonth#atEndOfMonth() public java.time.LocalDate
     * java.time.YearMonth.atEndOfMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.YearMonth#atEndOfMonth() public java.time.LocalDate java.time.YearMonth.atEndOfMonth() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atEndOfMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
