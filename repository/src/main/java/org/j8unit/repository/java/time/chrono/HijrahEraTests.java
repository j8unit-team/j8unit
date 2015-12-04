package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.time.chrono.HijrahEra class java.time.chrono.HijrahEra}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.chrono.HijrahEraClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HijrahEraTests<SUT extends java.time.chrono.HijrahEra>
extends org.j8unit.repository.java.time.chrono.EraTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.time.chrono.HijrahEra> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.HijrahEra#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.chrono.HijrahEra.range(java.time.temporal.TemporalField)}.
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
     * Test method for {@link java.time.chrono.HijrahEra#getValue() public int java.time.chrono.HijrahEra.getValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
