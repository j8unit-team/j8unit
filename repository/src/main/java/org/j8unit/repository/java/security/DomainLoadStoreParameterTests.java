package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.DomainLoadStoreParameter class java.security.DomainLoadStoreParameter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.DomainLoadStoreParameterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DomainLoadStoreParameterTests<SUT extends java.security.DomainLoadStoreParameter>
extends org.j8unit.repository.java.security.KeyStoreTests.LoadStoreParameterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.DomainLoadStoreParameter#getConfiguration() public java.net.URI
     * java.security.DomainLoadStoreParameter.getConfiguration()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConfiguration()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.DomainLoadStoreParameter#getProtectionParameter() public
     * java.security.KeyStore$ProtectionParameter java.security.DomainLoadStoreParameter.getProtectionParameter()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getProtectionParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.DomainLoadStoreParameter#getProtectionParams() public java.util.Map
     * java.security.DomainLoadStoreParameter.getProtectionParams()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProtectionParams()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
