package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.chrono.MinguoEra class java.time.chrono.MinguoEra},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.time.chrono.MinguoEraTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.chrono.MinguoEraClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.chrono.MinguoEra
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MinguoEraTests<SUT extends java.time.chrono.MinguoEra>
extends org.j8unit.repository.java.time.chrono.EraTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.time.chrono.MinguoEra> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.MinguoEra#getValue() public int java.time.chrono.MinguoEra.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.MinguoEra#getValue()
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
