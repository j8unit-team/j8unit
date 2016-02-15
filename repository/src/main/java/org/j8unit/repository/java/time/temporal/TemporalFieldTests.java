package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.temporal.TemporalField interface
 * java.time.temporal.TemporalField}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link TemporalFieldClassTests}.
 * </p>
 *
 * @see java.time.temporal.TemporalField interface java.time.temporal.TemporalField (the hereby targeted
 *      class-under-test class)
 * @see TemporalFieldClassTests TemporalFieldClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalFieldTests<SUT extends java.time.temporal.TemporalField>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#isTimeBased() public abstract boolean
     * java.time.temporal.TemporalField.isTimeBased()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#isTimeBased() public abstract boolean
     * java.time.temporal.TemporalField.isTimeBased()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#isTimeBased() public abstract boolean
     *      java.time.temporal.TemporalField.isTimeBased() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTimeBased()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#getDisplayName(java.util.Locale) public default
     * java.lang.String java.time.temporal.TemporalField.getDisplayName(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#getDisplayName(java.util.Locale) public default
     * java.lang.String java.time.temporal.TemporalField.getDisplayName(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#getDisplayName(java.util.Locale) public default java.lang.String
     *      java.time.temporal.TemporalField.getDisplayName(java.util.Locale) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayName_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#getBaseUnit() public abstract
     * java.time.temporal.TemporalUnit java.time.temporal.TemporalField.getBaseUnit()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#getBaseUnit() public abstract
     * java.time.temporal.TemporalUnit java.time.temporal.TemporalField.getBaseUnit()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#getBaseUnit() public abstract java.time.temporal.TemporalUnit
     *      java.time.temporal.TemporalField.getBaseUnit() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBaseUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#rangeRefinedBy(java.time.temporal.TemporalAccessor)
     * public abstract java.time.temporal.ValueRange
     * java.time.temporal.TemporalField.rangeRefinedBy(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#rangeRefinedBy(java.time.temporal.TemporalAccessor)
     * public abstract java.time.temporal.ValueRange
     * java.time.temporal.TemporalField.rangeRefinedBy(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#rangeRefinedBy(java.time.temporal.TemporalAccessor) public abstract
     *      java.time.temporal.ValueRange
     *      java.time.temporal.TemporalField.rangeRefinedBy(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rangeRefinedBy_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.time.temporal.TemporalField#resolve(java.util.Map, java.time.temporal.TemporalAccessor, java.time.format.ResolverStyle)
     * public default java.time.temporal.TemporalAccessor
     * java.time.temporal.TemporalField.resolve(java.util.Map<java.time.temporal.TemporalField,
     * java.lang.Long>,java.time.temporal.TemporalAccessor,java.time.format.ResolverStyle)}.
     *
     * <p>
     * Test method for
     * {@link java.time.temporal.TemporalField#resolve(java.util.Map, java.time.temporal.TemporalAccessor, java.time.format.ResolverStyle)
     * public default java.time.temporal.TemporalAccessor
     * java.time.temporal.TemporalField.resolve(java.util.Map,java.time.temporal.TemporalAccessor,java.time.format.ResolverStyle)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#resolve(java.util.Map, java.time.temporal.TemporalAccessor,
     *      java.time.format.ResolverStyle) public default java.time.temporal.TemporalAccessor
     *      java.time.temporal.TemporalField.resolve(java.util.Map,java.time.temporal.TemporalAccessor,java.time.format.
     *      ResolverStyle) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolve_Map_TemporalAccessor_ResolverStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#isSupportedBy(java.time.temporal.TemporalAccessor) public
     * abstract boolean java.time.temporal.TemporalField.isSupportedBy(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#isSupportedBy(java.time.temporal.TemporalAccessor) public
     * abstract boolean java.time.temporal.TemporalField.isSupportedBy(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#isSupportedBy(java.time.temporal.TemporalAccessor) public abstract boolean
     *      java.time.temporal.TemporalField.isSupportedBy(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSupportedBy_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#getFrom(java.time.temporal.TemporalAccessor) public
     * abstract long java.time.temporal.TemporalField.getFrom(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#getFrom(java.time.temporal.TemporalAccessor) public
     * abstract long java.time.temporal.TemporalField.getFrom(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#getFrom(java.time.temporal.TemporalAccessor) public abstract long
     *      java.time.temporal.TemporalField.getFrom(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFrom_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#isDateBased() public abstract boolean
     * java.time.temporal.TemporalField.isDateBased()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#isDateBased() public abstract boolean
     * java.time.temporal.TemporalField.isDateBased()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#isDateBased() public abstract boolean
     *      java.time.temporal.TemporalField.isDateBased() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDateBased()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#toString() public abstract java.lang.String
     * java.time.temporal.TemporalField.toString()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#toString() public abstract java.lang.String
     * java.time.temporal.TemporalField.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#toString() public abstract java.lang.String
     *      java.time.temporal.TemporalField.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.temporal.TemporalField#getRangeUnit() public abstract
     * java.time.temporal.TemporalUnit java.time.temporal.TemporalField.getRangeUnit()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#getRangeUnit() public abstract
     * java.time.temporal.TemporalUnit java.time.temporal.TemporalField.getRangeUnit()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#getRangeUnit() public abstract java.time.temporal.TemporalUnit
     *      java.time.temporal.TemporalField.getRangeUnit() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRangeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#range() public abstract java.time.temporal.ValueRange
     * java.time.temporal.TemporalField.range()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#range() public abstract java.time.temporal.ValueRange
     * java.time.temporal.TemporalField.range()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#range() public abstract java.time.temporal.ValueRange
     *      java.time.temporal.TemporalField.range() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_range()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#adjustInto(java.time.temporal.Temporal, long) public
     * abstract <R> R java.time.temporal.TemporalField.adjustInto(R,long)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalField#adjustInto(java.time.temporal.Temporal, long) public
     * abstract java.time.temporal.Temporal
     * java.time.temporal.TemporalField.adjustInto(java.time.temporal.Temporal,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalField#adjustInto(java.time.temporal.Temporal, long) public abstract
     *      java.time.temporal.Temporal java.time.temporal.TemporalField.adjustInto(java.time.temporal.Temporal,long)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_adjustInto_Temporal_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
