package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.chrono.HijrahEra class java.time.chrono.HijrahEra}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link HijrahEraClassTests}.
 * </p>
 *
 * @see java.time.chrono.HijrahEra class java.time.chrono.HijrahEra (the hereby targeted class-under-test class)
 * @see HijrahEraClassTests HijrahEraClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HijrahEraTests<SUT extends java.time.chrono.HijrahEra>
extends EraTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.time.chrono.HijrahEra> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.HijrahEra#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.chrono.HijrahEra.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.HijrahEra#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.chrono.HijrahEra.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.HijrahEra#range(java.time.temporal.TemporalField) public java.time.temporal.ValueRange
     *      java.time.chrono.HijrahEra.range(java.time.temporal.TemporalField) (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.chrono.HijrahEra#getValue() public int java.time.chrono.HijrahEra.getValue()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.HijrahEra#getValue() public int java.time.chrono.HijrahEra.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.HijrahEra#getValue() public int java.time.chrono.HijrahEra.getValue() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
