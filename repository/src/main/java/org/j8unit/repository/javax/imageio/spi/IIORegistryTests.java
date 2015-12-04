package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.imageio.spi.IIORegistry class javax.imageio.spi.IIORegistry}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.spi.IIORegistryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IIORegistryTests<SUT extends javax.imageio.spi.IIORegistry>
extends org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.IIORegistry#registerApplicationClasspathSpis() public void
     * javax.imageio.spi.IIORegistry.registerApplicationClasspathSpis()}.
     * </p>
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
