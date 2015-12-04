package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.imageio.spi.IIORegistry class javax.imageio.spi.IIORegistry},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.spi.IIORegistryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IIORegistryTests<SUT extends javax.imageio.spi.IIORegistry>
extends org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.IIORegistry#registerApplicationClasspathSpis() public void javax.imageio.spi.IIORegistry.registerApplicationClasspathSpis()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerApplicationClasspathSpis() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
