package org.j8unit.repository.java.time;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.Instant class java.time.Instant}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link InstantClassTests}.
 * </p>
 *
 * @see java.time.Instant class java.time.Instant (the hereby targeted class-under-test class)
 * @see InstantClassTests InstantClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InstantTests<SUT extends java.time.Instant>
extends org.j8unit.repository.java.time.temporal.TemporalTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT>,
org.j8unit.repository.java.lang.ComparableTests<SUT, java.time.Instant>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.Instant#atZone(java.time.ZoneId) public java.time.ZonedDateTime
     * java.time.Instant.atZone(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#atZone(java.time.ZoneId) public java.time.ZonedDateTime
     * java.time.Instant.atZone(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#atZone(java.time.ZoneId) public java.time.ZonedDateTime
     *      java.time.Instant.atZone(java.time.ZoneId) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#plus(long, java.time.temporal.TemporalUnit) public java.time.Instant
     * java.time.Instant.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#plus(long, java.time.temporal.TemporalUnit) public java.time.Instant
     * java.time.Instant.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#plus(long, java.time.temporal.TemporalUnit) public java.time.Instant
     *      java.time.Instant.plus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#plus(java.time.temporal.TemporalAmount) public java.time.Instant
     * java.time.Instant.plus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#plus(java.time.temporal.TemporalAmount) public java.time.Instant
     * java.time.Instant.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#plus(java.time.temporal.TemporalAmount) public java.time.Instant
     *      java.time.Instant.plus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#isBefore(java.time.Instant) public boolean
     * java.time.Instant.isBefore(java.time.Instant)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#isBefore(java.time.Instant) public boolean
     * java.time.Instant.isBefore(java.time.Instant)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#isBefore(java.time.Instant) public boolean java.time.Instant.isBefore(java.time.Instant)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBefore_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.Instant#getNano() public int java.time.Instant.getNano()}.
     *
     * <p>
     * Test method for {@link java.time.Instant#getNano() public int java.time.Instant.getNano()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#getNano() public int java.time.Instant.getNano() (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#minusNanos(long) public java.time.Instant
     * java.time.Instant.minusNanos(long)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#minusNanos(long) public java.time.Instant
     * java.time.Instant.minusNanos(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#minusNanos(long) public java.time.Instant java.time.Instant.minusNanos(long) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.Instant#toEpochMilli() public long java.time.Instant.toEpochMilli()}.
     *
     * <p>
     * Test method for {@link java.time.Instant#toEpochMilli() public long java.time.Instant.toEpochMilli()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#toEpochMilli() public long java.time.Instant.toEpochMilli() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toEpochMilli()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.Instant#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.Instant.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.Instant.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#isSupported(java.time.temporal.TemporalField) public boolean
     *      java.time.Instant.isSupported(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.Instant.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#isSupported(java.time.temporal.TemporalUnit) public boolean
     * java.time.Instant.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#isSupported(java.time.temporal.TemporalUnit) public boolean
     *      java.time.Instant.isSupported(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#query(java.time.temporal.TemporalQuery) public <R> R
     * java.time.Instant.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#query(java.time.temporal.TemporalQuery) public java.lang.Object
     * java.time.Instant.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#query(java.time.temporal.TemporalQuery) public java.lang.Object
     *      java.time.Instant.query(java.time.temporal.TemporalQuery) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#atOffset(java.time.ZoneOffset) public java.time.OffsetDateTime
     * java.time.Instant.atOffset(java.time.ZoneOffset)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#atOffset(java.time.ZoneOffset) public java.time.OffsetDateTime
     * java.time.Instant.atOffset(java.time.ZoneOffset)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#atOffset(java.time.ZoneOffset) public java.time.OffsetDateTime
     *      java.time.Instant.atOffset(java.time.ZoneOffset) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#truncatedTo(java.time.temporal.TemporalUnit) public java.time.Instant
     * java.time.Instant.truncatedTo(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#truncatedTo(java.time.temporal.TemporalUnit) public java.time.Instant
     * java.time.Instant.truncatedTo(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#truncatedTo(java.time.temporal.TemporalUnit) public java.time.Instant
     *      java.time.Instant.truncatedTo(java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#getEpochSecond() public long java.time.Instant.getEpochSecond()}.
     *
     * <p>
     * Test method for {@link java.time.Instant#getEpochSecond() public long java.time.Instant.getEpochSecond()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#getEpochSecond() public long java.time.Instant.getEpochSecond() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEpochSecond()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.Instant#minusSeconds(long) public java.time.Instant
     * java.time.Instant.minusSeconds(long)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#minusSeconds(long) public java.time.Instant
     * java.time.Instant.minusSeconds(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#minusSeconds(long) public java.time.Instant java.time.Instant.minusSeconds(long) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#isAfter(java.time.Instant) public boolean
     * java.time.Instant.isAfter(java.time.Instant)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#isAfter(java.time.Instant) public boolean
     * java.time.Instant.isAfter(java.time.Instant)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#isAfter(java.time.Instant) public boolean java.time.Instant.isAfter(java.time.Instant)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAfter_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.Instant#toString() public java.lang.String java.time.Instant.toString()}.
     *
     * <p>
     * Test method for {@link java.time.Instant#toString() public java.lang.String java.time.Instant.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#toString() public java.lang.String java.time.Instant.toString() (the hereby targeted
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
     * Test method for {@link java.time.Instant#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * public long java.time.Instant.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
     * public long java.time.Instant.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public long
     *      java.time.Instant.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit) (the hereby targeted
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
     * Test method for {@link java.time.Instant#plusMillis(long) public java.time.Instant
     * java.time.Instant.plusMillis(long)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#plusMillis(long) public java.time.Instant
     * java.time.Instant.plusMillis(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#plusMillis(long) public java.time.Instant java.time.Instant.plusMillis(long) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_plusMillis_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.Instant#equals(Object) public boolean
     * java.time.Instant.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#equals(Object) public boolean
     * java.time.Instant.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#equals(Object) public boolean java.time.Instant.equals(java.lang.Object) (the hereby
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
     * Test method for {@link java.time.Instant#getLong(java.time.temporal.TemporalField) public long
     * java.time.Instant.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#getLong(java.time.temporal.TemporalField) public long
     * java.time.Instant.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#getLong(java.time.temporal.TemporalField) public long
     *      java.time.Instant.getLong(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#with(java.time.temporal.TemporalField, long) public java.time.Instant
     * java.time.Instant.with(java.time.temporal.TemporalField,long)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#with(java.time.temporal.TemporalField, long) public java.time.Instant
     * java.time.Instant.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#with(java.time.temporal.TemporalField, long) public java.time.Instant
     *      java.time.Instant.with(java.time.temporal.TemporalField,long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#with(java.time.temporal.TemporalAdjuster) public java.time.Instant
     * java.time.Instant.with(java.time.temporal.TemporalAdjuster)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#with(java.time.temporal.TemporalAdjuster) public java.time.Instant
     * java.time.Instant.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#with(java.time.temporal.TemporalAdjuster) public java.time.Instant
     *      java.time.Instant.with(java.time.temporal.TemporalAdjuster) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.Instant.adjustInto(java.time.temporal.Temporal)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.Instant.adjustInto(java.time.temporal.Temporal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#adjustInto(java.time.temporal.Temporal) public java.time.temporal.Temporal
     *      java.time.Instant.adjustInto(java.time.temporal.Temporal) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.Instant.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.Instant.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#range(java.time.temporal.TemporalField) public java.time.temporal.ValueRange
     *      java.time.Instant.range(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#minusMillis(long) public java.time.Instant
     * java.time.Instant.minusMillis(long)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#minusMillis(long) public java.time.Instant
     * java.time.Instant.minusMillis(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#minusMillis(long) public java.time.Instant java.time.Instant.minusMillis(long) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minusMillis_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.Instant#compareTo(java.time.Instant) public int
     * java.time.Instant.compareTo(java.time.Instant)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#compareTo(java.time.Instant) public int
     * java.time.Instant.compareTo(java.time.Instant)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#compareTo(java.time.Instant) public int java.time.Instant.compareTo(java.time.Instant)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.Instant#minus(long, java.time.temporal.TemporalUnit) public java.time.Instant
     * java.time.Instant.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#minus(long, java.time.temporal.TemporalUnit) public java.time.Instant
     * java.time.Instant.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#minus(long, java.time.temporal.TemporalUnit) public java.time.Instant
     *      java.time.Instant.minus(long,java.time.temporal.TemporalUnit) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#minus(java.time.temporal.TemporalAmount) public java.time.Instant
     * java.time.Instant.minus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#minus(java.time.temporal.TemporalAmount) public java.time.Instant
     * java.time.Instant.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#minus(java.time.temporal.TemporalAmount) public java.time.Instant
     *      java.time.Instant.minus(java.time.temporal.TemporalAmount) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#plusSeconds(long) public java.time.Instant
     * java.time.Instant.plusSeconds(long)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#plusSeconds(long) public java.time.Instant
     * java.time.Instant.plusSeconds(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#plusSeconds(long) public java.time.Instant java.time.Instant.plusSeconds(long) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.Instant#plusNanos(long) public java.time.Instant
     * java.time.Instant.plusNanos(long)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#plusNanos(long) public java.time.Instant
     * java.time.Instant.plusNanos(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#plusNanos(long) public java.time.Instant java.time.Instant.plusNanos(long) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.Instant#hashCode() public int java.time.Instant.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.Instant#hashCode() public int java.time.Instant.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#hashCode() public int java.time.Instant.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.Instant#get(java.time.temporal.TemporalField) public int
     * java.time.Instant.get(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.Instant#get(java.time.temporal.TemporalField) public int
     * java.time.Instant.get(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.Instant#get(java.time.temporal.TemporalField) public int
     *      java.time.Instant.get(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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

}
