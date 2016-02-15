package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.temporal.ChronoField class java.time.temporal.ChronoField}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ChronoFieldClassTests}.
 * </p>
 *
 * @see java.time.temporal.ChronoField class java.time.temporal.ChronoField (the hereby targeted class-under-test class)
 * @see ChronoFieldClassTests ChronoFieldClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ChronoFieldTests<SUT extends java.time.temporal.ChronoField>
extends TemporalFieldTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.time.temporal.ChronoField> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#range() public java.time.temporal.ValueRange
     * java.time.temporal.ChronoField.range()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#range() public java.time.temporal.ValueRange
     * java.time.temporal.ChronoField.range()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#range() public java.time.temporal.ValueRange
     *      java.time.temporal.ChronoField.range() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.temporal.ChronoField#adjustInto(java.time.temporal.Temporal, long) public <R> R
     * java.time.temporal.ChronoField.adjustInto(R,long)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#adjustInto(java.time.temporal.Temporal, long) public
     * java.time.temporal.Temporal java.time.temporal.ChronoField.adjustInto(java.time.temporal.Temporal,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#adjustInto(java.time.temporal.Temporal, long) public
     *      java.time.temporal.Temporal java.time.temporal.ChronoField.adjustInto(java.time.temporal.Temporal,long) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_adjustInto_Temporal_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#getRangeUnit() public java.time.temporal.TemporalUnit
     * java.time.temporal.ChronoField.getRangeUnit()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#getRangeUnit() public java.time.temporal.TemporalUnit
     * java.time.temporal.ChronoField.getRangeUnit()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#getRangeUnit() public java.time.temporal.TemporalUnit
     *      java.time.temporal.ChronoField.getRangeUnit() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.temporal.ChronoField#getDisplayName(java.util.Locale) public java.lang.String
     * java.time.temporal.ChronoField.getDisplayName(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#getDisplayName(java.util.Locale) public java.lang.String
     * java.time.temporal.ChronoField.getDisplayName(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#getDisplayName(java.util.Locale) public java.lang.String
     *      java.time.temporal.ChronoField.getDisplayName(java.util.Locale) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.temporal.ChronoField#getBaseUnit() public java.time.temporal.TemporalUnit
     * java.time.temporal.ChronoField.getBaseUnit()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#getBaseUnit() public java.time.temporal.TemporalUnit
     * java.time.temporal.ChronoField.getBaseUnit()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#getBaseUnit() public java.time.temporal.TemporalUnit
     *      java.time.temporal.ChronoField.getBaseUnit() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.temporal.ChronoField#rangeRefinedBy(java.time.temporal.TemporalAccessor) public
     * java.time.temporal.ValueRange java.time.temporal.ChronoField.rangeRefinedBy(java.time.temporal.TemporalAccessor)}
     * .
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#rangeRefinedBy(java.time.temporal.TemporalAccessor) public
     * java.time.temporal.ValueRange java.time.temporal.ChronoField.rangeRefinedBy(java.time.temporal.TemporalAccessor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#rangeRefinedBy(java.time.temporal.TemporalAccessor) public
     *      java.time.temporal.ValueRange
     *      java.time.temporal.ChronoField.rangeRefinedBy(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.temporal.ChronoField#isTimeBased() public boolean
     * java.time.temporal.ChronoField.isTimeBased()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#isTimeBased() public boolean
     * java.time.temporal.ChronoField.isTimeBased()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#isTimeBased() public boolean java.time.temporal.ChronoField.isTimeBased()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.temporal.ChronoField#checkValidIntValue(long) public int
     * java.time.temporal.ChronoField.checkValidIntValue(long)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#checkValidIntValue(long) public int
     * java.time.temporal.ChronoField.checkValidIntValue(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#checkValidIntValue(long) public int
     *      java.time.temporal.ChronoField.checkValidIntValue(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkValidIntValue_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#checkValidValue(long) public long
     * java.time.temporal.ChronoField.checkValidValue(long)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#checkValidValue(long) public long
     * java.time.temporal.ChronoField.checkValidValue(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#checkValidValue(long) public long
     *      java.time.temporal.ChronoField.checkValidValue(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkValidValue_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#toString() public java.lang.String
     * java.time.temporal.ChronoField.toString()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#toString() public java.lang.String
     * java.time.temporal.ChronoField.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#toString() public java.lang.String java.time.temporal.ChronoField.toString()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.temporal.ChronoField#isDateBased() public boolean
     * java.time.temporal.ChronoField.isDateBased()}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#isDateBased() public boolean
     * java.time.temporal.ChronoField.isDateBased()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#isDateBased() public boolean java.time.temporal.ChronoField.isDateBased()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.temporal.ChronoField#isSupportedBy(java.time.temporal.TemporalAccessor) public
     * boolean java.time.temporal.ChronoField.isSupportedBy(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#isSupportedBy(java.time.temporal.TemporalAccessor) public
     * boolean java.time.temporal.ChronoField.isSupportedBy(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#isSupportedBy(java.time.temporal.TemporalAccessor) public boolean
     *      java.time.temporal.ChronoField.isSupportedBy(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.time.temporal.ChronoField#getFrom(java.time.temporal.TemporalAccessor) public long
     * java.time.temporal.ChronoField.getFrom(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.ChronoField#getFrom(java.time.temporal.TemporalAccessor) public long
     * java.time.temporal.ChronoField.getFrom(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.ChronoField#getFrom(java.time.temporal.TemporalAccessor) public long
     *      java.time.temporal.ChronoField.getFrom(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getFrom_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
