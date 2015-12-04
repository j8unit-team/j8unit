package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.imageio.spi.RegisterableService interface javax.imageio.spi.RegisterableService},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.spi.RegisterableServiceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RegisterableServiceTests<SUT extends javax.imageio.spi.RegisterableService>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.spi.RegisterableService#onRegistration(javax.imageio.spi.ServiceRegistry,java.lang.Class)
     * public abstract void
     * javax.imageio.spi.RegisterableService.onRegistration(javax.imageio.spi.ServiceRegistry,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_onRegistration_ServiceRegistry_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.spi.RegisterableService#onDeregistration(javax.imageio.spi.ServiceRegistry,java.lang.Class)
     * public abstract void
     * javax.imageio.spi.RegisterableService.onDeregistration(javax.imageio.spi.ServiceRegistry,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_onDeregistration_ServiceRegistry_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
