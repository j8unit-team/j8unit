package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.imageio.spi.IIOServiceProvider class javax.imageio.spi.IIOServiceProvider}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.spi.IIOServiceProviderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IIOServiceProviderTests<SUT extends javax.imageio.spi.IIOServiceProvider>
extends org.j8unit.repository.javax.imageio.spi.RegisterableServiceTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.IIOServiceProvider#getDescription(java.util.Locale) public abstract
     * java.lang.String javax.imageio.spi.IIOServiceProvider.getDescription(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDescription_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.IIOServiceProvider#getVendorName() public java.lang.String
     * javax.imageio.spi.IIOServiceProvider.getVendorName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVendorName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.IIOServiceProvider#getVersion() public java.lang.String
     * javax.imageio.spi.IIOServiceProvider.getVersion()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.spi.IIOServiceProvider#onDeregistration(javax.imageio.spi.ServiceRegistry,java.lang.Class)
     * public void
     * javax.imageio.spi.IIOServiceProvider.onDeregistration(javax.imageio.spi.ServiceRegistry,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_onDeregistration_ServiceRegistry_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.spi.IIOServiceProvider#onRegistration(javax.imageio.spi.ServiceRegistry,java.lang.Class)
     * public void
     * javax.imageio.spi.IIOServiceProvider.onRegistration(javax.imageio.spi.ServiceRegistry,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_onRegistration_ServiceRegistry_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
