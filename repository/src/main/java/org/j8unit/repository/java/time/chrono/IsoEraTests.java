package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.chrono.IsoEra class java.time.chrono.IsoEra}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link IsoEraClassTests}.
 * </p>
 *
 * @see java.time.chrono.IsoEra class java.time.chrono.IsoEra (the hereby targeted class-under-test class)
 * @see IsoEraClassTests IsoEraClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IsoEraTests<SUT extends java.time.chrono.IsoEra>
extends EraTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.time.chrono.IsoEra> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.IsoEra#getValue() public int java.time.chrono.IsoEra.getValue()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.IsoEra#getValue() public int java.time.chrono.IsoEra.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.IsoEra#getValue() public int java.time.chrono.IsoEra.getValue() (the hereby targeted
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
