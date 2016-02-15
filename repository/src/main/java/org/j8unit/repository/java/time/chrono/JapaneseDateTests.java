package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.chrono.JapaneseDate class java.time.chrono.JapaneseDate}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JapaneseDateClassTests}.
 * </p>
 *
 * @see java.time.chrono.JapaneseDate class java.time.chrono.JapaneseDate (the hereby targeted class-under-test class)
 * @see JapaneseDateClassTests JapaneseDateClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JapaneseDateTests<SUT extends java.time.chrono.JapaneseDate>
extends ChronoLocalDateTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalTests<SUT>,
org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#minus(java.time.temporal.TemporalAmount) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.minus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#minus(java.time.temporal.TemporalAmount) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#minus(java.time.temporal.TemporalAmount) public java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseDate.minus(java.time.temporal.TemporalAmount) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#minus(long, java.time.temporal.TemporalUnit) public
     *      java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.minus(long,java.time.temporal.TemporalUnit) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#toEpochDay() public long
     * java.time.chrono.JapaneseDate.toEpochDay()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#toEpochDay() public long
     * java.time.chrono.JapaneseDate.toEpochDay()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#toEpochDay() public long java.time.chrono.JapaneseDate.toEpochDay() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.chrono.JapaneseDate.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.chrono.JapaneseDate.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#range(java.time.temporal.TemporalField) public java.time.temporal.ValueRange
     *      java.time.chrono.JapaneseDate.range(java.time.temporal.TemporalField) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.chrono.JapaneseDate.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.chrono.JapaneseDate.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#isSupported(java.time.temporal.TemporalField) public boolean
     *      java.time.chrono.JapaneseDate.isSupported(java.time.temporal.TemporalField) (the hereby targeted
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
     * Test method for {@link java.time.chrono.JapaneseDate#plus(java.time.temporal.TemporalAmount) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.plus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#plus(java.time.temporal.TemporalAmount) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#plus(java.time.temporal.TemporalAmount) public java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseDate.plus(java.time.temporal.TemporalAmount) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#plus(long, java.time.temporal.TemporalUnit) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#plus(long, java.time.temporal.TemporalUnit) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#plus(long, java.time.temporal.TemporalUnit) public
     *      java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.plus(long,java.time.temporal.TemporalUnit) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#with(java.time.temporal.TemporalAdjuster) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.with(java.time.temporal.TemporalAdjuster)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#with(java.time.temporal.TemporalAdjuster) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#with(java.time.temporal.TemporalAdjuster) public java.time.chrono.JapaneseDate
     *      java.time.chrono.JapaneseDate.with(java.time.temporal.TemporalAdjuster) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#with(java.time.temporal.TemporalField, long) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.with(java.time.temporal.TemporalField,long)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#with(java.time.temporal.TemporalField, long) public
     * java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#with(java.time.temporal.TemporalField, long) public
     *      java.time.chrono.JapaneseDate java.time.chrono.JapaneseDate.with(java.time.temporal.TemporalField,long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#getLong(java.time.temporal.TemporalField) public long
     * java.time.chrono.JapaneseDate.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#getLong(java.time.temporal.TemporalField) public long
     * java.time.chrono.JapaneseDate.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#getLong(java.time.temporal.TemporalField) public long
     *      java.time.chrono.JapaneseDate.getLong(java.time.temporal.TemporalField) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#atTime(java.time.LocalTime) public final
     * java.time.chrono.ChronoLocalDateTime
     * <java.time.chrono.JapaneseDate> java.time.chrono.JapaneseDate.atTime(java.time.LocalTime)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#atTime(java.time.LocalTime) public final
     * java.time.chrono.ChronoLocalDateTime java.time.chrono.JapaneseDate.atTime(java.time.LocalTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#atTime(java.time.LocalTime) public final java.time.chrono.ChronoLocalDateTime
     *      java.time.chrono.JapaneseDate.atTime(java.time.LocalTime) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#lengthOfYear() public int
     * java.time.chrono.JapaneseDate.lengthOfYear()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#lengthOfYear() public int
     * java.time.chrono.JapaneseDate.lengthOfYear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#lengthOfYear() public int java.time.chrono.JapaneseDate.lengthOfYear() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#lengthOfMonth() public int
     * java.time.chrono.JapaneseDate.lengthOfMonth()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#lengthOfMonth() public int
     * java.time.chrono.JapaneseDate.lengthOfMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#lengthOfMonth() public int java.time.chrono.JapaneseDate.lengthOfMonth() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#equals(Object) public boolean
     * java.time.chrono.JapaneseDate.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#equals(Object) public boolean
     * java.time.chrono.JapaneseDate.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#equals(Object) public boolean
     *      java.time.chrono.JapaneseDate.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#hashCode() public int
     * java.time.chrono.JapaneseDate.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#hashCode() public int
     * java.time.chrono.JapaneseDate.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#hashCode() public int java.time.chrono.JapaneseDate.hashCode() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#getEra() public java.time.chrono.JapaneseEra
     * java.time.chrono.JapaneseDate.getEra()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#getEra() public java.time.chrono.JapaneseEra
     * java.time.chrono.JapaneseDate.getEra()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#getEra() public java.time.chrono.JapaneseEra
     *      java.time.chrono.JapaneseDate.getEra() (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#until(java.time.chrono.ChronoLocalDate) public
     * java.time.chrono.ChronoPeriod java.time.chrono.JapaneseDate.until(java.time.chrono.ChronoLocalDate)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#until(java.time.chrono.ChronoLocalDate) public
     * java.time.chrono.ChronoPeriod java.time.chrono.JapaneseDate.until(java.time.chrono.ChronoLocalDate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#until(java.time.chrono.ChronoLocalDate) public java.time.chrono.ChronoPeriod
     *      java.time.chrono.JapaneseDate.until(java.time.chrono.ChronoLocalDate) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.JapaneseDate#getChronology() public java.time.chrono.JapaneseChronology
     * java.time.chrono.JapaneseDate.getChronology()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.JapaneseDate#getChronology() public java.time.chrono.JapaneseChronology
     * java.time.chrono.JapaneseDate.getChronology()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.JapaneseDate#getChronology() public java.time.chrono.JapaneseChronology
     *      java.time.chrono.JapaneseDate.getChronology() (the hereby targeted method-under-test)
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.time.chrono.ChronoLocalDate#query(java.time.temporal.TemporalQuery) interface
     * java.time.chrono.ChronoLocalDate}</li>
     * <li>{@linkplain java.time.temporal.TemporalAccessor#query(java.time.temporal.TemporalQuery) interface
     * java.time.temporal.TemporalAccessor}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_query_TemporalQuery()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.time.chrono.ChronoLocalDate#adjustInto(java.time.temporal.Temporal) interface
     * java.time.chrono.ChronoLocalDate}</li>
     * <li>{@linkplain java.time.temporal.TemporalAdjuster#adjustInto(java.time.temporal.Temporal) interface
     * java.time.temporal.TemporalAdjuster}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_adjustInto_Temporal()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.time.chrono.ChronoLocalDate#isSupported(java.time.temporal.TemporalUnit) interface
     * java.time.chrono.ChronoLocalDate}</li>
     * <li>{@linkplain java.time.temporal.Temporal#isSupported(java.time.temporal.TemporalUnit) interface
     * java.time.temporal.Temporal}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isSupported_TemporalUnit()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.time.chrono.ChronoLocalDate#toString() interface java.time.chrono.ChronoLocalDate}</li>
     * <li>{@linkplain Object#toString() class java.lang.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.time.chrono.ChronoLocalDate#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * interface java.time.chrono.ChronoLocalDate}</li>
     * <li>{@linkplain java.time.temporal.Temporal#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * interface java.time.temporal.Temporal}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_until_Temporal_TemporalUnit()
    throws Exception {
    }

}
