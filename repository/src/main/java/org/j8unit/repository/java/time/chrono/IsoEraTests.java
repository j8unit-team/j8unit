package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.chrono.IsoEra class java.time.chrono.IsoEra}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.time.chrono.IsoEraTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.chrono.IsoEraClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.chrono.IsoEra
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IsoEraTests<SUT extends java.time.chrono.IsoEra>
extends org.j8unit.repository.java.time.chrono.EraTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.time.chrono.IsoEra> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.IsoEra#getValue() public int java.time.chrono.IsoEra.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.IsoEra#getValue()
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
