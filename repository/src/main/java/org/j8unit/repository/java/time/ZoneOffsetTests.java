package org.j8unit.repository.java.time;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.ZoneOffset class java.time.ZoneOffset}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link ZoneOffsetClassTests}.
 * </p>
 *
 * @see java.time.ZoneOffset class java.time.ZoneOffset (the hereby targeted class-under-test class)
 * @see ZoneOffsetClassTests ZoneOffsetClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ZoneOffsetTests<SUT extends java.time.ZoneOffset>
extends org.j8unit.repository.java.time.temporal.TemporalAccessorTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT>,
org.j8unit.repository.java.lang.ComparableTests<SUT, java.time.ZoneOffset>, org.j8unit.repository.java.io.SerializableTests<SUT>, ZoneIdTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.ZoneOffset#getRules() public java.time.zone.ZoneRules
     * java.time.ZoneOffset.getRules()}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#getRules() public java.time.zone.ZoneRules
     * java.time.ZoneOffset.getRules()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#getRules() public java.time.zone.ZoneRules java.time.ZoneOffset.getRules() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRules()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZoneOffset#toString() public java.lang.String java.time.ZoneOffset.toString()}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#toString() public java.lang.String java.time.ZoneOffset.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#toString() public java.lang.String java.time.ZoneOffset.toString() (the hereby targeted
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
     * Test method for {@link java.time.ZoneOffset#getLong(java.time.temporal.TemporalField) public long
     * java.time.ZoneOffset.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#getLong(java.time.temporal.TemporalField) public long
     * java.time.ZoneOffset.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#getLong(java.time.temporal.TemporalField) public long
     *      java.time.ZoneOffset.getLong(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZoneOffset#get(java.time.temporal.TemporalField) public int
     * java.time.ZoneOffset.get(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#get(java.time.temporal.TemporalField) public int
     * java.time.ZoneOffset.get(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#get(java.time.temporal.TemporalField) public int
     *      java.time.ZoneOffset.get(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZoneOffset#equals(Object) public boolean
     * java.time.ZoneOffset.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#equals(Object) public boolean
     * java.time.ZoneOffset.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#equals(Object) public boolean java.time.ZoneOffset.equals(java.lang.Object) (the hereby
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
     * Test method for {@link java.time.ZoneOffset#hashCode() public int java.time.ZoneOffset.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#hashCode() public int java.time.ZoneOffset.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#hashCode() public int java.time.ZoneOffset.hashCode() (the hereby targeted
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
     * Test method for {@link java.time.ZoneOffset#compareTo(java.time.ZoneOffset) public int
     * java.time.ZoneOffset.compareTo(java.time.ZoneOffset)}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#compareTo(java.time.ZoneOffset) public int
     * java.time.ZoneOffset.compareTo(java.time.ZoneOffset)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#compareTo(java.time.ZoneOffset) public int
     *      java.time.ZoneOffset.compareTo(java.time.ZoneOffset) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_ZoneOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZoneOffset#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.ZoneOffset.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#isSupported(java.time.temporal.TemporalField) public boolean
     * java.time.ZoneOffset.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#isSupported(java.time.temporal.TemporalField) public boolean
     *      java.time.ZoneOffset.isSupported(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZoneOffset#getId() public java.lang.String java.time.ZoneOffset.getId()}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#getId() public java.lang.String java.time.ZoneOffset.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#getId() public java.lang.String java.time.ZoneOffset.getId() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.ZoneOffset#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.ZoneOffset.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.ZoneOffset.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#range(java.time.temporal.TemporalField) public java.time.temporal.ValueRange
     *      java.time.ZoneOffset.range(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZoneOffset#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.ZoneOffset.adjustInto(java.time.temporal.Temporal)}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#adjustInto(java.time.temporal.Temporal) public
     * java.time.temporal.Temporal java.time.ZoneOffset.adjustInto(java.time.temporal.Temporal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#adjustInto(java.time.temporal.Temporal) public java.time.temporal.Temporal
     *      java.time.ZoneOffset.adjustInto(java.time.temporal.Temporal) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZoneOffset#query(java.time.temporal.TemporalQuery) public <R> R
     * java.time.ZoneOffset.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#query(java.time.temporal.TemporalQuery) public java.lang.Object
     * java.time.ZoneOffset.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#query(java.time.temporal.TemporalQuery) public java.lang.Object
     *      java.time.ZoneOffset.query(java.time.temporal.TemporalQuery) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.ZoneOffset#getTotalSeconds() public int java.time.ZoneOffset.getTotalSeconds()}.
     *
     * <p>
     * Test method for {@link java.time.ZoneOffset#getTotalSeconds() public int java.time.ZoneOffset.getTotalSeconds()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.ZoneOffset#getTotalSeconds() public int java.time.ZoneOffset.getTotalSeconds() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTotalSeconds()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
