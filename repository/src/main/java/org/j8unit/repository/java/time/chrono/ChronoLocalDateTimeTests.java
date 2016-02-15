package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.chrono.ChronoLocalDateTime interface
 * java.time.chrono.ChronoLocalDateTime}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ChronoLocalDateTimeClassTests}.
 * </p>
 *
 * @see java.time.chrono.ChronoLocalDateTime interface java.time.chrono.ChronoLocalDateTime (the hereby targeted
 *      class-under-test class)
 * @see ChronoLocalDateTimeClassTests ChronoLocalDateTimeClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ChronoLocalDateTimeTests<SUT extends java.time.chrono.ChronoLocalDateTime<D>, D extends java.time.chrono.ChronoLocalDate>
extends org.j8unit.repository.java.time.temporal.TemporalTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT>,
org.j8unit.repository.java.lang.ComparableTests<SUT, java.time.chrono.ChronoLocalDateTime<?>> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#query(java.time.temporal.TemporalQuery) public
     * default <R> R java.time.chrono.ChronoLocalDateTime.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#query(java.time.temporal.TemporalQuery) public
     * default java.lang.Object java.time.chrono.ChronoLocalDateTime.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#query(java.time.temporal.TemporalQuery) public default java.lang.Object
     *      java.time.chrono.ChronoLocalDateTime.query(java.time.temporal.TemporalQuery) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isEqual(java.time.chrono.ChronoLocalDateTime) public
     * default boolean java.time.chrono.ChronoLocalDateTime.isEqual(java.time.chrono.ChronoLocalDateTime<?>)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isEqual(java.time.chrono.ChronoLocalDateTime) public
     * default boolean java.time.chrono.ChronoLocalDateTime.isEqual(java.time.chrono.ChronoLocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#isEqual(java.time.chrono.ChronoLocalDateTime) public default boolean
     *      java.time.chrono.ChronoLocalDateTime.isEqual(java.time.chrono.ChronoLocalDateTime) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#minus(java.time.temporal.TemporalAmount) public
     * default java.time.chrono.ChronoLocalDateTime
     * <D> java.time.chrono.ChronoLocalDateTime.minus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#minus(java.time.temporal.TemporalAmount) public
     * default java.time.chrono.ChronoLocalDateTime
     * java.time.chrono.ChronoLocalDateTime.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#minus(java.time.temporal.TemporalAmount) public default
     *      java.time.chrono.ChronoLocalDateTime
     *      java.time.chrono.ChronoLocalDateTime.minus(java.time.temporal.TemporalAmount) (the hereby targeted
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#minus(long, java.time.temporal.TemporalUnit) public
     * default java.time.chrono.ChronoLocalDateTime
     * <D> java.time.chrono.ChronoLocalDateTime.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#minus(long, java.time.temporal.TemporalUnit) public
     * default java.time.chrono.ChronoLocalDateTime
     * java.time.chrono.ChronoLocalDateTime.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#minus(long, java.time.temporal.TemporalUnit) public default
     *      java.time.chrono.ChronoLocalDateTime
     *      java.time.chrono.ChronoLocalDateTime.minus(long,java.time.temporal.TemporalUnit) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toInstant(java.time.ZoneOffset) public default
     * java.time.Instant java.time.chrono.ChronoLocalDateTime.toInstant(java.time.ZoneOffset)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toInstant(java.time.ZoneOffset) public default
     * java.time.Instant java.time.chrono.ChronoLocalDateTime.toInstant(java.time.ZoneOffset)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#toInstant(java.time.ZoneOffset) public default java.time.Instant
     *      java.time.chrono.ChronoLocalDateTime.toInstant(java.time.ZoneOffset) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toInstant_ZoneOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#atZone(java.time.ZoneId) public abstract
     * java.time.chrono.ChronoZonedDateTime<D> java.time.chrono.ChronoLocalDateTime.atZone(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#atZone(java.time.ZoneId) public abstract
     * java.time.chrono.ChronoZonedDateTime java.time.chrono.ChronoLocalDateTime.atZone(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#atZone(java.time.ZoneId) public abstract
     *      java.time.chrono.ChronoZonedDateTime java.time.chrono.ChronoLocalDateTime.atZone(java.time.ZoneId) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#plus(long, java.time.temporal.TemporalUnit) public
     * abstract java.time.chrono.ChronoLocalDateTime
     * <D> java.time.chrono.ChronoLocalDateTime.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#plus(long, java.time.temporal.TemporalUnit) public
     * abstract java.time.chrono.ChronoLocalDateTime
     * java.time.chrono.ChronoLocalDateTime.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#plus(long, java.time.temporal.TemporalUnit) public abstract
     *      java.time.chrono.ChronoLocalDateTime
     *      java.time.chrono.ChronoLocalDateTime.plus(long,java.time.temporal.TemporalUnit) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#plus(java.time.temporal.TemporalAmount) public
     * default java.time.chrono.ChronoLocalDateTime
     * <D> java.time.chrono.ChronoLocalDateTime.plus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#plus(java.time.temporal.TemporalAmount) public
     * default java.time.chrono.ChronoLocalDateTime
     * java.time.chrono.ChronoLocalDateTime.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#plus(java.time.temporal.TemporalAmount) public default
     *      java.time.chrono.ChronoLocalDateTime
     *      java.time.chrono.ChronoLocalDateTime.plus(java.time.temporal.TemporalAmount) (the hereby targeted
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isBefore(java.time.chrono.ChronoLocalDateTime) public
     * default boolean java.time.chrono.ChronoLocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime<?>)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isBefore(java.time.chrono.ChronoLocalDateTime) public
     * default boolean java.time.chrono.ChronoLocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#isBefore(java.time.chrono.ChronoLocalDateTime) public default boolean
     *      java.time.chrono.ChronoLocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#format(java.time.format.DateTimeFormatter) public
     * default java.lang.String java.time.chrono.ChronoLocalDateTime.format(java.time.format.DateTimeFormatter)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#format(java.time.format.DateTimeFormatter) public
     * default java.lang.String java.time.chrono.ChronoLocalDateTime.format(java.time.format.DateTimeFormatter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#format(java.time.format.DateTimeFormatter) public default
     *      java.lang.String java.time.chrono.ChronoLocalDateTime.format(java.time.format.DateTimeFormatter) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toLocalTime() public abstract java.time.LocalTime
     * java.time.chrono.ChronoLocalDateTime.toLocalTime()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toLocalTime() public abstract java.time.LocalTime
     * java.time.chrono.ChronoLocalDateTime.toLocalTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#toLocalTime() public abstract java.time.LocalTime
     *      java.time.chrono.ChronoLocalDateTime.toLocalTime() (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#adjustInto(java.time.temporal.Temporal) public
     * default java.time.temporal.Temporal java.time.chrono.ChronoLocalDateTime.adjustInto(java.time.temporal.Temporal)}
     * .
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#adjustInto(java.time.temporal.Temporal) public
     * default java.time.temporal.Temporal java.time.chrono.ChronoLocalDateTime.adjustInto(java.time.temporal.Temporal)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#adjustInto(java.time.temporal.Temporal) public default
     *      java.time.temporal.Temporal java.time.chrono.ChronoLocalDateTime.adjustInto(java.time.temporal.Temporal)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#compareTo(java.time.chrono.ChronoLocalDateTime)
     * public default int java.time.chrono.ChronoLocalDateTime.compareTo(java.time.chrono.ChronoLocalDateTime<?>)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#compareTo(java.time.chrono.ChronoLocalDateTime)
     * public default int java.time.chrono.ChronoLocalDateTime.compareTo(java.time.chrono.ChronoLocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#compareTo(java.time.chrono.ChronoLocalDateTime) public default int
     *      java.time.chrono.ChronoLocalDateTime.compareTo(java.time.chrono.ChronoLocalDateTime) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isSupported(java.time.temporal.TemporalField) public
     * abstract boolean java.time.chrono.ChronoLocalDateTime.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isSupported(java.time.temporal.TemporalField) public
     * abstract boolean java.time.chrono.ChronoLocalDateTime.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#isSupported(java.time.temporal.TemporalField) public abstract boolean
     *      java.time.chrono.ChronoLocalDateTime.isSupported(java.time.temporal.TemporalField) (the hereby targeted
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isSupported(java.time.temporal.TemporalUnit) public
     * default boolean java.time.chrono.ChronoLocalDateTime.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isSupported(java.time.temporal.TemporalUnit) public
     * default boolean java.time.chrono.ChronoLocalDateTime.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#isSupported(java.time.temporal.TemporalUnit) public default boolean
     *      java.time.chrono.ChronoLocalDateTime.isSupported(java.time.temporal.TemporalUnit) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#equals(Object) public abstract boolean
     * java.time.chrono.ChronoLocalDateTime.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#equals(Object) public abstract boolean
     * java.time.chrono.ChronoLocalDateTime.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#equals(Object) public abstract boolean
     *      java.time.chrono.ChronoLocalDateTime.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#hashCode() public abstract int
     * java.time.chrono.ChronoLocalDateTime.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#hashCode() public abstract int
     * java.time.chrono.ChronoLocalDateTime.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#hashCode() public abstract int
     *      java.time.chrono.ChronoLocalDateTime.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toEpochSecond(java.time.ZoneOffset) public default
     * long java.time.chrono.ChronoLocalDateTime.toEpochSecond(java.time.ZoneOffset)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toEpochSecond(java.time.ZoneOffset) public default
     * long java.time.chrono.ChronoLocalDateTime.toEpochSecond(java.time.ZoneOffset)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#toEpochSecond(java.time.ZoneOffset) public default long
     *      java.time.chrono.ChronoLocalDateTime.toEpochSecond(java.time.ZoneOffset) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toEpochSecond_ZoneOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#with(java.time.temporal.TemporalAdjuster) public
     * default java.time.chrono.ChronoLocalDateTime
     * <D> java.time.chrono.ChronoLocalDateTime.with(java.time.temporal.TemporalAdjuster)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#with(java.time.temporal.TemporalAdjuster) public
     * default java.time.chrono.ChronoLocalDateTime
     * java.time.chrono.ChronoLocalDateTime.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#with(java.time.temporal.TemporalAdjuster) public default
     *      java.time.chrono.ChronoLocalDateTime
     *      java.time.chrono.ChronoLocalDateTime.with(java.time.temporal.TemporalAdjuster) (the hereby targeted
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#with(java.time.temporal.TemporalField, long) public
     * abstract java.time.chrono.ChronoLocalDateTime
     * <D> java.time.chrono.ChronoLocalDateTime.with(java.time.temporal.TemporalField,long)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#with(java.time.temporal.TemporalField, long) public
     * abstract java.time.chrono.ChronoLocalDateTime
     * java.time.chrono.ChronoLocalDateTime.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#with(java.time.temporal.TemporalField, long) public abstract
     *      java.time.chrono.ChronoLocalDateTime
     *      java.time.chrono.ChronoLocalDateTime.with(java.time.temporal.TemporalField,long) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toLocalDate() public abstract D
     * java.time.chrono.ChronoLocalDateTime.toLocalDate()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toLocalDate() public abstract
     * java.time.chrono.ChronoLocalDate java.time.chrono.ChronoLocalDateTime.toLocalDate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#toLocalDate() public abstract java.time.chrono.ChronoLocalDate
     *      java.time.chrono.ChronoLocalDateTime.toLocalDate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isAfter(java.time.chrono.ChronoLocalDateTime) public
     * default boolean java.time.chrono.ChronoLocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime<?>)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#isAfter(java.time.chrono.ChronoLocalDateTime) public
     * default boolean java.time.chrono.ChronoLocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#isAfter(java.time.chrono.ChronoLocalDateTime) public default boolean
     *      java.time.chrono.ChronoLocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#getChronology() public default
     * java.time.chrono.Chronology java.time.chrono.ChronoLocalDateTime.getChronology()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#getChronology() public default
     * java.time.chrono.Chronology java.time.chrono.ChronoLocalDateTime.getChronology()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#getChronology() public default java.time.chrono.Chronology
     *      java.time.chrono.ChronoLocalDateTime.getChronology() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toString() public abstract java.lang.String
     * java.time.chrono.ChronoLocalDateTime.toString()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.ChronoLocalDateTime#toString() public abstract java.lang.String
     * java.time.chrono.ChronoLocalDateTime.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.ChronoLocalDateTime#toString() public abstract java.lang.String
     *      java.time.chrono.ChronoLocalDateTime.toString() (the hereby targeted method-under-test)
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

}
