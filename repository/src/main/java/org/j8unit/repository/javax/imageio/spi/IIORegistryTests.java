package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.imageio.spi.IIORegistry class javax.imageio.spi.IIORegistry}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link IIORegistryClassTests}.
 * </p>
 *
 * @see javax.imageio.spi.IIORegistry class javax.imageio.spi.IIORegistry (the hereby targeted class-under-test class)
 * @see IIORegistryClassTests IIORegistryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IIORegistryTests<SUT extends javax.imageio.spi.IIORegistry>
extends ServiceRegistryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.IIORegistry#registerApplicationClasspathSpis() public void
     * javax.imageio.spi.IIORegistry.registerApplicationClasspathSpis()}.
     *
     * <p>
     * Test method for {@link javax.imageio.spi.IIORegistry#registerApplicationClasspathSpis() public void
     * javax.imageio.spi.IIORegistry.registerApplicationClasspathSpis()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.imageio.spi.IIORegistry#registerApplicationClasspathSpis() public void
     *      javax.imageio.spi.IIORegistry.registerApplicationClasspathSpis() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerApplicationClasspathSpis()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
