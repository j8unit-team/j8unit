package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.temporal.Temporal interface java.time.temporal.Temporal}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TemporalClassTests}.
 * </p>
 *
 * @see java.time.temporal.Temporal interface java.time.temporal.Temporal (the hereby targeted class-under-test class)
 * @see TemporalClassTests TemporalClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalTests<SUT extends java.time.temporal.Temporal>
extends TemporalAccessorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.Temporal#plus(long, java.time.temporal.TemporalUnit) public abstract
     * java.time.temporal.Temporal java.time.temporal.Temporal.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.Temporal#plus(long, java.time.temporal.TemporalUnit) public abstract
     * java.time.temporal.Temporal java.time.temporal.Temporal.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.Temporal#plus(long, java.time.temporal.TemporalUnit) public abstract
     *      java.time.temporal.Temporal java.time.temporal.Temporal.plus(long,java.time.temporal.TemporalUnit) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.temporal.Temporal#plus(java.time.temporal.TemporalAmount) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.plus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.Temporal#plus(java.time.temporal.TemporalAmount) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.Temporal#plus(java.time.temporal.TemporalAmount) public default
     *      java.time.temporal.Temporal java.time.temporal.Temporal.plus(java.time.temporal.TemporalAmount) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.time.temporal.Temporal#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public
     * abstract long java.time.temporal.Temporal.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for
     * {@link java.time.temporal.Temporal#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public
     * abstract long java.time.temporal.Temporal.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.Temporal#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit) public
     *      abstract long java.time.temporal.Temporal.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.temporal.Temporal#isSupported(java.time.temporal.TemporalUnit) public abstract
     * boolean java.time.temporal.Temporal.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.Temporal#isSupported(java.time.temporal.TemporalUnit) public abstract
     * boolean java.time.temporal.Temporal.isSupported(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.Temporal#isSupported(java.time.temporal.TemporalUnit) public abstract boolean
     *      java.time.temporal.Temporal.isSupported(java.time.temporal.TemporalUnit) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.temporal.Temporal#with(java.time.temporal.TemporalField, long) public abstract
     * java.time.temporal.Temporal java.time.temporal.Temporal.with(java.time.temporal.TemporalField,long)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.Temporal#with(java.time.temporal.TemporalField, long) public abstract
     * java.time.temporal.Temporal java.time.temporal.Temporal.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.Temporal#with(java.time.temporal.TemporalField, long) public abstract
     *      java.time.temporal.Temporal java.time.temporal.Temporal.with(java.time.temporal.TemporalField,long) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.temporal.Temporal#with(java.time.temporal.TemporalAdjuster) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.with(java.time.temporal.TemporalAdjuster)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.Temporal#with(java.time.temporal.TemporalAdjuster) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.Temporal#with(java.time.temporal.TemporalAdjuster) public default
     *      java.time.temporal.Temporal java.time.temporal.Temporal.with(java.time.temporal.TemporalAdjuster) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.temporal.Temporal#minus(long, java.time.temporal.TemporalUnit) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.Temporal#minus(long, java.time.temporal.TemporalUnit) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.Temporal#minus(long, java.time.temporal.TemporalUnit) public default
     *      java.time.temporal.Temporal java.time.temporal.Temporal.minus(long,java.time.temporal.TemporalUnit) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.time.temporal.Temporal#minus(java.time.temporal.TemporalAmount) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.minus(java.time.temporal.TemporalAmount)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.Temporal#minus(java.time.temporal.TemporalAmount) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.Temporal#minus(java.time.temporal.TemporalAmount) public default
     *      java.time.temporal.Temporal java.time.temporal.Temporal.minus(java.time.temporal.TemporalAmount) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_minus_TemporalAmount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
