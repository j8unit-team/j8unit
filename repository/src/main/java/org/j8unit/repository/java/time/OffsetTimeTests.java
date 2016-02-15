package org.j8unit.repository.java.time;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.OffsetTime class java.time.OffsetTime}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link OffsetTimeClassTests}.
 * </p>
 *
 * @see java.time.OffsetTime class java.time.OffsetTime (the hereby targeted class-under-test class)
 * @see OffsetTimeClassTests OffsetTimeClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OffsetTimeTests<SUT extends java.time.OffsetTime>
extends org.j8unit.repository.java.time.temporal.TemporalTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT>,
org.j8unit.repository.java.lang.ComparableTests<SUT, java.time.OffsetTime>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.OffsetTime#withHour(int) public java.time.OffsetTime
     * java.time.OffsetTime.withHour(int)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#withHour(int) public java.time.OffsetTime
     * java.time.OffsetTime.withHour(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#withHour(int) public java.time.OffsetTime java.time.OffsetTime.withHour(int) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#query(java.time.temporal.TemporalQuery) public <R> R
     * java.time.OffsetTime.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#query(java.time.temporal.TemporalQuery) public java.lang.Object
     * java.time.OffsetTime.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#query(java.time.temporal.TemporalQuery) public java.lang.Object
     *      java.time.OffsetTime.query(java.time.temporal.TemporalQuery) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#truncatedTo(java.time.temporal.TemporalUnit) public
     * java.time.OffsetTime java.time.OffsetTime.truncatedTo(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#truncatedTo(java.time.temporal.TemporalUnit) public
     * java.time.OffsetTime java.time.OffsetTime.truncatedTo(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#truncatedTo(java.time.temporal.TemporalUnit) public java.time.OffsetTime
     *      java.time.OffsetTime.truncatedTo(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.OffsetTime.format(java.time.format.DateTimeFormatter)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#format(java.time.format.DateTimeFormatter) public java.lang.String
     * java.time.OffsetTime.format(java.time.format.DateTimeFormatter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#format(java.time.format.DateTimeFormatter) public java.lang.String
     *      java.time.OffsetTime.format(java.time.format.DateTimeFormatter) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#getNano() public int java.time.OffsetTime.getNano()}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#getNano() public int java.time.OffsetTime.getNano()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#getNano() public int java.time.OffsetTime.getNano() (the hereby targeted
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
     * Test method for {@link java.time.OffsetTime#minusNanos(long) public java.time.OffsetTime
     * java.time.OffsetTime.minusNanos(long)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#minusNanos(long) public java.time.OffsetTime
     * java.time.OffsetTime.minusNanos(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#minusNanos(long) public java.time.OffsetTime java.time.OffsetTime.minusNanos(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.OffsetTime.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.OffsetTime.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#isSupported(java.time.temporal.TemporalUnit) public boolean
     *      java.time.OffsetTime.isSupported(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.OffsetTime.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.OffsetTime.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#isSupported(java.time.temporal.TemporalField) public boolean
     *      java.time.OffsetTime.isSupported(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#plus(long, java.time.temporal.TemporalUnit) public
     * java.time.OffsetTime java.time.OffsetTime.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#plus(long, java.time.temporal.TemporalUnit) public
     * java.time.OffsetTime java.time.OffsetTime.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#plus(long, java.time.temporal.TemporalUnit) public java.time.OffsetTime
     *      java.time.OffsetTime.plus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#plus(java.time.temporal.TemporalAmount) public java.time.OffsetTime
     * java.time.OffsetTime.plus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#plus(java.time.temporal.TemporalAmount) public java.time.OffsetTime
     * java.time.OffsetTime.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#plus(java.time.temporal.TemporalAmount) public java.time.OffsetTime
     *      java.time.OffsetTime.plus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#isBefore(java.time.OffsetTime) public boolean
     * java.time.OffsetTime.isBefore(java.time.OffsetTime)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#isBefore(java.time.OffsetTime) public boolean
     * java.time.OffsetTime.isBefore(java.time.OffsetTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#isBefore(java.time.OffsetTime) public boolean
     *      java.time.OffsetTime.isBefore(java.time.OffsetTime) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBefore_OffsetTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetTime#getLong(java.time.temporal.TemporalField) public long
     * java.time.OffsetTime.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#getLong(java.time.temporal.TemporalField) public long
     * java.time.OffsetTime.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#getLong(java.time.temporal.TemporalField) public long
     *      java.time.OffsetTime.getLong(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#withNano(int) public java.time.OffsetTime
     * java.time.OffsetTime.withNano(int)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#withNano(int) public java.time.OffsetTime
     * java.time.OffsetTime.withNano(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#withNano(int) public java.time.OffsetTime java.time.OffsetTime.withNano(int) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#with(java.time.temporal.TemporalField, long) public
     * java.time.OffsetTime java.time.OffsetTime.with(java.time.temporal.TemporalField,long)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#with(java.time.temporal.TemporalField, long) public
     * java.time.OffsetTime java.time.OffsetTime.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#with(java.time.temporal.TemporalField, long) public java.time.OffsetTime
     *      java.time.OffsetTime.with(java.time.temporal.TemporalField,long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#with(java.time.temporal.TemporalAdjuster) public java.time.OffsetTime
     * java.time.OffsetTime.with(java.time.temporal.TemporalAdjuster)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#with(java.time.temporal.TemporalAdjuster) public java.time.OffsetTime
     * java.time.OffsetTime.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#with(java.time.temporal.TemporalAdjuster) public java.time.OffsetTime
     *      java.time.OffsetTime.with(java.time.temporal.TemporalAdjuster) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#withOffsetSameInstant(java.time.ZoneOffset) public
     * java.time.OffsetTime java.time.OffsetTime.withOffsetSameInstant(java.time.ZoneOffset)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#withOffsetSameInstant(java.time.ZoneOffset) public
     * java.time.OffsetTime java.time.OffsetTime.withOffsetSameInstant(java.time.ZoneOffset)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#withOffsetSameInstant(java.time.ZoneOffset) public java.time.OffsetTime
     *      java.time.OffsetTime.withOffsetSameInstant(java.time.ZoneOffset) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withOffsetSameInstant_ZoneOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetTime#equals(Object) public boolean
     * java.time.OffsetTime.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#equals(Object) public boolean
     * java.time.OffsetTime.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#equals(Object) public boolean java.time.OffsetTime.equals(java.lang.Object) (the hereby
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
     * Test method for {@link java.time.OffsetTime#getSecond() public int java.time.OffsetTime.getSecond()}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#getSecond() public int java.time.OffsetTime.getSecond()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#getSecond() public int java.time.OffsetTime.getSecond() (the hereby targeted
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
     * Test method for {@link java.time.OffsetTime#toString() public java.lang.String java.time.OffsetTime.toString()}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#toString() public java.lang.String java.time.OffsetTime.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#toString() public java.lang.String java.time.OffsetTime.toString() (the hereby targeted
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
     * Test method for {@link java.time.OffsetTime#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * public long java.time.OffsetTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * public long java.time.OffsetTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     *      java.time.OffsetTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit) (the hereby targeted
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
     * Test method for {@link java.time.OffsetTime#minusSeconds(long) public java.time.OffsetTime
     * java.time.OffsetTime.minusSeconds(long)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#minusSeconds(long) public java.time.OffsetTime
     * java.time.OffsetTime.minusSeconds(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#minusSeconds(long) public java.time.OffsetTime java.time.OffsetTime.minusSeconds(long)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#isAfter(java.time.OffsetTime) public boolean
     * java.time.OffsetTime.isAfter(java.time.OffsetTime)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#isAfter(java.time.OffsetTime) public boolean
     * java.time.OffsetTime.isAfter(java.time.OffsetTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#isAfter(java.time.OffsetTime) public boolean
     *      java.time.OffsetTime.isAfter(java.time.OffsetTime) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAfter_OffsetTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetTime#withSecond(int) public java.time.OffsetTime
     * java.time.OffsetTime.withSecond(int)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#withSecond(int) public java.time.OffsetTime
     * java.time.OffsetTime.withSecond(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#withSecond(int) public java.time.OffsetTime java.time.OffsetTime.withSecond(int) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.OffsetTime java.time.OffsetTime.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.OffsetTime java.time.OffsetTime.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#minus(long, java.time.temporal.TemporalUnit) public java.time.OffsetTime
     *      java.time.OffsetTime.minus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#minus(java.time.temporal.TemporalAmount) public java.time.OffsetTime
     * java.time.OffsetTime.minus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#minus(java.time.temporal.TemporalAmount) public java.time.OffsetTime
     * java.time.OffsetTime.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#minus(java.time.temporal.TemporalAmount) public java.time.OffsetTime
     *      java.time.OffsetTime.minus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#plusHours(long) public java.time.OffsetTime
     * java.time.OffsetTime.plusHours(long)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#plusHours(long) public java.time.OffsetTime
     * java.time.OffsetTime.plusHours(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#plusHours(long) public java.time.OffsetTime java.time.OffsetTime.plusHours(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#minusHours(long) public java.time.OffsetTime
     * java.time.OffsetTime.minusHours(long)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#minusHours(long) public java.time.OffsetTime
     * java.time.OffsetTime.minusHours(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#minusHours(long) public java.time.OffsetTime java.time.OffsetTime.minusHours(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#getOffset() public java.time.ZoneOffset
     * java.time.OffsetTime.getOffset()}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#getOffset() public java.time.ZoneOffset
     * java.time.OffsetTime.getOffset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#getOffset() public java.time.ZoneOffset java.time.OffsetTime.getOffset() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.OffsetTime#isEqual(java.time.OffsetTime) public boolean
     * java.time.OffsetTime.isEqual(java.time.OffsetTime)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#isEqual(java.time.OffsetTime) public boolean
     * java.time.OffsetTime.isEqual(java.time.OffsetTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#isEqual(java.time.OffsetTime) public boolean
     *      java.time.OffsetTime.isEqual(java.time.OffsetTime) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEqual_OffsetTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetTime#toLocalTime() public java.time.LocalTime
     * java.time.OffsetTime.toLocalTime()}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#toLocalTime() public java.time.LocalTime
     * java.time.OffsetTime.toLocalTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#toLocalTime() public java.time.LocalTime java.time.OffsetTime.toLocalTime() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.OffsetTime#atDate(java.time.LocalDate) public java.time.OffsetDateTime
     * java.time.OffsetTime.atDate(java.time.LocalDate)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#atDate(java.time.LocalDate) public java.time.OffsetDateTime
     * java.time.OffsetTime.atDate(java.time.LocalDate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#atDate(java.time.LocalDate) public java.time.OffsetDateTime
     *      java.time.OffsetTime.atDate(java.time.LocalDate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_atDate_LocalDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetTime#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.OffsetTime.adjustInto(java.time.temporal.Temporal)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.OffsetTime.adjustInto(java.time.temporal.Temporal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#adjustInto(java.time.temporal.Temporal) public java.time.temporal.Temporal
     *      java.time.OffsetTime.adjustInto(java.time.temporal.Temporal) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.OffsetTime.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.OffsetTime.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#range(java.time.temporal.TemporalField) public java.time.temporal.ValueRange
     *      java.time.OffsetTime.range(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#compareTo(java.time.OffsetTime) public int
     * java.time.OffsetTime.compareTo(java.time.OffsetTime)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#compareTo(java.time.OffsetTime) public int
     * java.time.OffsetTime.compareTo(java.time.OffsetTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#compareTo(java.time.OffsetTime) public int
     *      java.time.OffsetTime.compareTo(java.time.OffsetTime) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_OffsetTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetTime#plusMinutes(long) public java.time.OffsetTime
     * java.time.OffsetTime.plusMinutes(long)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#plusMinutes(long) public java.time.OffsetTime
     * java.time.OffsetTime.plusMinutes(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#plusMinutes(long) public java.time.OffsetTime java.time.OffsetTime.plusMinutes(long)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#withOffsetSameLocal(java.time.ZoneOffset) public java.time.OffsetTime
     * java.time.OffsetTime.withOffsetSameLocal(java.time.ZoneOffset)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#withOffsetSameLocal(java.time.ZoneOffset) public java.time.OffsetTime
     * java.time.OffsetTime.withOffsetSameLocal(java.time.ZoneOffset)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#withOffsetSameLocal(java.time.ZoneOffset) public java.time.OffsetTime
     *      java.time.OffsetTime.withOffsetSameLocal(java.time.ZoneOffset) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withOffsetSameLocal_ZoneOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetTime#minusMinutes(long) public java.time.OffsetTime
     * java.time.OffsetTime.minusMinutes(long)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#minusMinutes(long) public java.time.OffsetTime
     * java.time.OffsetTime.minusMinutes(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#minusMinutes(long) public java.time.OffsetTime java.time.OffsetTime.minusMinutes(long)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#hashCode() public int java.time.OffsetTime.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#hashCode() public int java.time.OffsetTime.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#hashCode() public int java.time.OffsetTime.hashCode() (the hereby targeted
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
     * Test method for {@link java.time.OffsetTime#get(java.time.temporal.TemporalField) public int
     * java.time.OffsetTime.get(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#get(java.time.temporal.TemporalField) public int
     * java.time.OffsetTime.get(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#get(java.time.temporal.TemporalField) public int
     *      java.time.OffsetTime.get(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#plusSeconds(long) public java.time.OffsetTime
     * java.time.OffsetTime.plusSeconds(long)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#plusSeconds(long) public java.time.OffsetTime
     * java.time.OffsetTime.plusSeconds(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#plusSeconds(long) public java.time.OffsetTime java.time.OffsetTime.plusSeconds(long)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#getMinute() public int java.time.OffsetTime.getMinute()}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#getMinute() public int java.time.OffsetTime.getMinute()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#getMinute() public int java.time.OffsetTime.getMinute() (the hereby targeted
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
     * Test method for {@link java.time.OffsetTime#getHour() public int java.time.OffsetTime.getHour()}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#getHour() public int java.time.OffsetTime.getHour()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#getHour() public int java.time.OffsetTime.getHour() (the hereby targeted
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
     * Test method for {@link java.time.OffsetTime#plusNanos(long) public java.time.OffsetTime
     * java.time.OffsetTime.plusNanos(long)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#plusNanos(long) public java.time.OffsetTime
     * java.time.OffsetTime.plusNanos(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#plusNanos(long) public java.time.OffsetTime java.time.OffsetTime.plusNanos(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.OffsetTime#withMinute(int) public java.time.OffsetTime
     * java.time.OffsetTime.withMinute(int)}.
     *
     * <p>
     * Test method for {@link java.time.OffsetTime#withMinute(int) public java.time.OffsetTime
     * java.time.OffsetTime.withMinute(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.OffsetTime#withMinute(int) public java.time.OffsetTime java.time.OffsetTime.withMinute(int) (the
     *      hereby targeted method-under-test)
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

}
