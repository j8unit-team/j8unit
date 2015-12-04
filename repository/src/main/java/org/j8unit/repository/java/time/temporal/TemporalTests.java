package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.time.temporal.Temporal interface java.time.temporal.Temporal}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.temporal.TemporalClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TemporalTests<SUT extends java.time.temporal.Temporal>
extends org.j8unit.repository.java.time.temporal.TemporalAccessorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.Temporal#plus(java.time.temporal.TemporalAmount) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.plus(java.time.temporal.TemporalAmount)}.
     * </p>
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
     * Test method for {@link java.time.temporal.Temporal#plus(long,java.time.temporal.TemporalUnit) public abstract
     * java.time.temporal.Temporal java.time.temporal.Temporal.plus(long,java.time.temporal.TemporalUnit)}.
     * </p>
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
     * Test method for
     * {@link java.time.temporal.Temporal#until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit) public
     * abstract long java.time.temporal.Temporal.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)}.
     * </p>
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
     * </p>
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
     * Test method for {@link java.time.temporal.Temporal#with(java.time.temporal.TemporalField,long) public abstract
     * java.time.temporal.Temporal java.time.temporal.Temporal.with(java.time.temporal.TemporalField,long)}.
     * </p>
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
     * </p>
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
     * Test method for {@link java.time.temporal.Temporal#minus(long,java.time.temporal.TemporalUnit) public default
     * java.time.temporal.Temporal java.time.temporal.Temporal.minus(long,java.time.temporal.TemporalUnit)}.
     * </p>
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
     * </p>
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
