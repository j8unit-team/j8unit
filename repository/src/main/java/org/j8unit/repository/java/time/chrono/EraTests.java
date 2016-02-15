package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.chrono.Era interface java.time.chrono.Era}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link EraClassTests}.
 * </p>
 *
 * @see java.time.chrono.Era interface java.time.chrono.Era (the hereby targeted class-under-test class)
 * @see EraClassTests EraClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EraTests<SUT extends java.time.chrono.Era>
extends org.j8unit.repository.java.time.temporal.TemporalAccessorTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.Era#range(java.time.temporal.TemporalField) public default
     * java.time.temporal.ValueRange java.time.chrono.Era.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Era#range(java.time.temporal.TemporalField) public default
     * java.time.temporal.ValueRange java.time.chrono.Era.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Era#range(java.time.temporal.TemporalField) public default java.time.temporal.ValueRange
     *      java.time.chrono.Era.range(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.Era#adjustInto(java.time.temporal.Temporal) public default
     * java.time.temporal.Temporal java.time.chrono.Era.adjustInto(java.time.temporal.Temporal)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Era#adjustInto(java.time.temporal.Temporal) public default
     * java.time.temporal.Temporal java.time.chrono.Era.adjustInto(java.time.temporal.Temporal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Era#adjustInto(java.time.temporal.Temporal) public default java.time.temporal.Temporal
     *      java.time.chrono.Era.adjustInto(java.time.temporal.Temporal) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.Era#isSupported(java.time.temporal.TemporalField) public default boolean
     * java.time.chrono.Era.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Era#isSupported(java.time.temporal.TemporalField) public default boolean
     * java.time.chrono.Era.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Era#isSupported(java.time.temporal.TemporalField) public default boolean
     *      java.time.chrono.Era.isSupported(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.Era#getDisplayName(java.time.format.TextStyle, java.util.Locale) public
     * default java.lang.String java.time.chrono.Era.getDisplayName(java.time.format.TextStyle,java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Era#getDisplayName(java.time.format.TextStyle, java.util.Locale) public
     * default java.lang.String java.time.chrono.Era.getDisplayName(java.time.format.TextStyle,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Era#getDisplayName(java.time.format.TextStyle, java.util.Locale) public default
     *      java.lang.String java.time.chrono.Era.getDisplayName(java.time.format.TextStyle,java.util.Locale) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayName_TextStyle_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Era#get(java.time.temporal.TemporalField) public default int
     * java.time.chrono.Era.get(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Era#get(java.time.temporal.TemporalField) public default int
     * java.time.chrono.Era.get(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Era#get(java.time.temporal.TemporalField) public default int
     *      java.time.chrono.Era.get(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.Era#query(java.time.temporal.TemporalQuery) public default <R> R
     * java.time.chrono.Era.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Era#query(java.time.temporal.TemporalQuery) public default
     * java.lang.Object java.time.chrono.Era.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Era#query(java.time.temporal.TemporalQuery) public default java.lang.Object
     *      java.time.chrono.Era.query(java.time.temporal.TemporalQuery) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.Era#getValue() public abstract int java.time.chrono.Era.getValue()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Era#getValue() public abstract int java.time.chrono.Era.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Era#getValue() public abstract int java.time.chrono.Era.getValue() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.Era#getLong(java.time.temporal.TemporalField) public default long
     * java.time.chrono.Era.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.Era#getLong(java.time.temporal.TemporalField) public default long
     * java.time.chrono.Era.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.Era#getLong(java.time.temporal.TemporalField) public default long
     *      java.time.chrono.Era.getLong(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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

}
