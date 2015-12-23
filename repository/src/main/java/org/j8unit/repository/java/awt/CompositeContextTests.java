package org.j8unit.repository.java.awt;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.CompositeContext interface java.awt.CompositeContext},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.CompositeContextTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.CompositeContextClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.CompositeContext
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompositeContextTests<SUT extends java.awt.CompositeContext>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.awt.CompositeContext#compose(java.awt.image.Raster, java.awt.image.Raster, java.awt.image.WritableRaster)
     * public abstract void
     * java.awt.CompositeContext.compose(java.awt.image.Raster,java.awt.image.Raster,java.awt.image.WritableRaster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.CompositeContext#compose(java.awt.image.Raster, java.awt.image.Raster,
     *             java.awt.image.WritableRaster)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compose_Raster_Raster_WritableRaster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.CompositeContext#dispose() public abstract void
     * java.awt.CompositeContext.dispose()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.CompositeContext#dispose()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispose()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
