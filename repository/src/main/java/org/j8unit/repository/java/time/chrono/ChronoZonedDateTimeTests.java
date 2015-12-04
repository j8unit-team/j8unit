package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.time.chrono.ChronoZonedDateTime interface java.time.chrono.ChronoZonedDateTime},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.chrono.ChronoZonedDateTimeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ChronoZonedDateTimeTests<SUT extends java.time.chrono.ChronoZonedDateTime<D>, D extends java.time.chrono.ChronoLocalDate>
extends org.j8unit.repository.java.time.temporal.TemporalTests<SUT>,
org.j8unit.repository.java.lang.ComparableTests<SUT, java.time.chrono.ChronoZonedDateTime<?>> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#compareTo(java.time.chrono.ChronoZonedDateTime)
     * public default int java.time.chrono.ChronoZonedDateTime.compareTo(java.time.chrono.ChronoZonedDateTime)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_ChronoZonedDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#equals(java.lang.Object) public abstract boolean
     * java.time.chrono.ChronoZonedDateTime.equals(java.lang.Object)}.
     * </p>
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#format(java.time.format.DateTimeFormatter) public
     * default java.lang.String java.time.chrono.ChronoZonedDateTime.format(java.time.format.DateTimeFormatter)}.
     * </p>
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#get(java.time.temporal.TemporalField) public default
     * int java.time.chrono.ChronoZonedDateTime.get(java.time.temporal.TemporalField)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_get_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#getChronology() public default
     * java.time.chrono.Chronology java.time.chrono.ChronoZonedDateTime.getChronology()}.
     * </p>
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#getLong(java.time.temporal.TemporalField) public
     * default long java.time.chrono.ChronoZonedDateTime.getLong(java.time.temporal.TemporalField)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getLong_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#getOffset() public abstract java.time.ZoneOffset
     * java.time.chrono.ChronoZonedDateTime.getOffset()}.
     * </p>
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#getZone() public abstract java.time.ZoneId
     * java.time.chrono.ChronoZonedDateTime.getZone()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#hashCode() public abstract int
     * java.time.chrono.ChronoZonedDateTime.hashCode()}.
     * </p>
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#isAfter(java.time.chrono.ChronoZonedDateTime) public
     * default boolean java.time.chrono.ChronoZonedDateTime.isAfter(java.time.chrono.ChronoZonedDateTime)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAfter_ChronoZonedDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#isBefore(java.time.chrono.ChronoZonedDateTime) public
     * default boolean java.time.chrono.ChronoZonedDateTime.isBefore(java.time.chrono.ChronoZonedDateTime)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBefore_ChronoZonedDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#isEqual(java.time.chrono.ChronoZonedDateTime) public
     * default boolean java.time.chrono.ChronoZonedDateTime.isEqual(java.time.chrono.ChronoZonedDateTime)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEqual_ChronoZonedDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#isSupported(java.time.temporal.TemporalField) public
     * abstract boolean java.time.chrono.ChronoZonedDateTime.isSupported(java.time.temporal.TemporalField)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isSupported_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#isSupported(java.time.temporal.TemporalUnit) public
     * default boolean java.time.chrono.ChronoZonedDateTime.isSupported(java.time.temporal.TemporalUnit)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isSupported_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#minus(long,java.time.temporal.TemporalUnit) public
     * default java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.ChronoZonedDateTime.minus(long,java.time.temporal.TemporalUnit)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_minus_long_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#minus(java.time.temporal.TemporalAmount) public
     * default java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.ChronoZonedDateTime.minus(java.time.temporal.TemporalAmount)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_minus_TemporalAmount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#plus(long,java.time.temporal.TemporalUnit) public
     * abstract java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.ChronoZonedDateTime.plus(long,java.time.temporal.TemporalUnit)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_plus_long_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#plus(java.time.temporal.TemporalAmount) public
     * default java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.ChronoZonedDateTime.plus(java.time.temporal.TemporalAmount)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_plus_TemporalAmount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#query(java.time.temporal.TemporalQuery) public
     * default java.lang.Object java.time.chrono.ChronoZonedDateTime.query(java.time.temporal.TemporalQuery)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_query_TemporalQuery()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#range(java.time.temporal.TemporalField) public
     * default java.time.temporal.ValueRange
     * java.time.chrono.ChronoZonedDateTime.range(java.time.temporal.TemporalField)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_range_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#toEpochSecond() public default long
     * java.time.chrono.ChronoZonedDateTime.toEpochSecond()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toEpochSecond()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#toInstant() public default java.time.Instant
     * java.time.chrono.ChronoZonedDateTime.toInstant()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toInstant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#toLocalDate() public default
     * java.time.chrono.ChronoLocalDate java.time.chrono.ChronoZonedDateTime.toLocalDate()}.
     * </p>
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#toLocalDateTime() public abstract
     * java.time.chrono.ChronoLocalDateTime java.time.chrono.ChronoZonedDateTime.toLocalDateTime()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#toLocalTime() public default java.time.LocalTime
     * java.time.chrono.ChronoZonedDateTime.toLocalTime()}.
     * </p>
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#toString() public abstract java.lang.String
     * java.time.chrono.ChronoZonedDateTime.toString()}.
     * </p>
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#with(java.time.temporal.TemporalAdjuster) public
     * default java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.ChronoZonedDateTime.with(java.time.temporal.TemporalAdjuster)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_with_TemporalAdjuster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#with(java.time.temporal.TemporalField,long) public
     * abstract java.time.chrono.ChronoZonedDateTime
     * java.time.chrono.ChronoZonedDateTime.with(java.time.temporal.TemporalField,long)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_with_TemporalField_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#withEarlierOffsetAtOverlap() public abstract
     * java.time.chrono.ChronoZonedDateTime java.time.chrono.ChronoZonedDateTime.withEarlierOffsetAtOverlap()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#withLaterOffsetAtOverlap() public abstract
     * java.time.chrono.ChronoZonedDateTime java.time.chrono.ChronoZonedDateTime.withLaterOffsetAtOverlap()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#withZoneSameInstant(java.time.ZoneId) public abstract
     * java.time.chrono.ChronoZonedDateTime java.time.chrono.ChronoZonedDateTime.withZoneSameInstant(java.time.ZoneId)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.chrono.ChronoZonedDateTime#withZoneSameLocal(java.time.ZoneId) public abstract
     * java.time.chrono.ChronoZonedDateTime java.time.chrono.ChronoZonedDateTime.withZoneSameLocal(java.time.ZoneId)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withZoneSameLocal_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
