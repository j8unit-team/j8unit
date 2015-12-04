package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.net.SecureCacheResponse class java.net.SecureCacheResponse}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.net.SecureCacheResponseClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecureCacheResponseTests<SUT extends java.net.SecureCacheResponse>
extends org.j8unit.repository.java.net.CacheResponseTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.SecureCacheResponse#getCipherSuite() public abstract java.lang.String
     * java.net.SecureCacheResponse.getCipherSuite()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCipherSuite()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.SecureCacheResponse#getLocalCertificateChain() public abstract java.util.List
     * java.net.SecureCacheResponse.getLocalCertificateChain()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocalCertificateChain()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.SecureCacheResponse#getLocalPrincipal() public abstract java.security.Principal
     * java.net.SecureCacheResponse.getLocalPrincipal()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocalPrincipal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.SecureCacheResponse#getPeerPrincipal() public abstract java.security.Principal
     * java.net.SecureCacheResponse.getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPeerPrincipal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.SecureCacheResponse#getServerCertificateChain() public abstract java.util.List
     * java.net.SecureCacheResponse.getServerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServerCertificateChain()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
