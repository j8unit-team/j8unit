package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.DomainLoadStoreParameter class
 * java.security.DomainLoadStoreParameter}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DomainLoadStoreParameterClassTests}.
 * </p>
 *
 * @see java.security.DomainLoadStoreParameter class java.security.DomainLoadStoreParameter (the hereby targeted
 *      class-under-test class)
 * @see DomainLoadStoreParameterClassTests DomainLoadStoreParameterClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DomainLoadStoreParameterTests<SUT extends java.security.DomainLoadStoreParameter>
extends KeyStoreTests.LoadStoreParameterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.DomainLoadStoreParameter#getConfiguration() public java.net.URI
     * java.security.DomainLoadStoreParameter.getConfiguration()}.
     *
     * <p>
     * Test method for {@link java.security.DomainLoadStoreParameter#getConfiguration() public java.net.URI
     * java.security.DomainLoadStoreParameter.getConfiguration()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.DomainLoadStoreParameter#getConfiguration() public java.net.URI
     *      java.security.DomainLoadStoreParameter.getConfiguration() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.security.DomainLoadStoreParameter#getProtectionParameter() public
     * java.security.KeyStore$ProtectionParameter java.security.DomainLoadStoreParameter.getProtectionParameter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.DomainLoadStoreParameter#getProtectionParameter() public
     *      java.security.KeyStore$ProtectionParameter java.security.DomainLoadStoreParameter.getProtectionParameter()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getProtectionParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.DomainLoadStoreParameter#getProtectionParams() public
     * java.util.Map<java.lang.String, java.security.KeyStore$ProtectionParameter>
     * java.security.DomainLoadStoreParameter.getProtectionParams()}.
     *
     * <p>
     * Test method for {@link java.security.DomainLoadStoreParameter#getProtectionParams() public java.util.Map
     * java.security.DomainLoadStoreParameter.getProtectionParams()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.DomainLoadStoreParameter#getProtectionParams() public java.util.Map
     *      java.security.DomainLoadStoreParameter.getProtectionParams() (the hereby targeted method-under-test)
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
