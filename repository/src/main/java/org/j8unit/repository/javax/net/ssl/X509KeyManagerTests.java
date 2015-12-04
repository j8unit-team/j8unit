package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.X509KeyManager interface javax.net.ssl.X509KeyManager}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.X509KeyManagerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface X509KeyManagerTests<SUT extends javax.net.ssl.X509KeyManager>
extends org.j8unit.repository.javax.net.ssl.KeyManagerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509KeyManager#chooseClientAlias(java.lang.String[],java.security.Principal[],java.net.Socket)
     * public abstract java.lang.String
     * javax.net.ssl.X509KeyManager.chooseClientAlias(java.lang.String[],java.security.Principal[],java.net.Socket)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_chooseClientAlias_StringArray_PrincipalArray_Socket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509KeyManager#chooseServerAlias(java.lang.String,java.security.Principal[],java.net.Socket)
     * public abstract java.lang.String
     * javax.net.ssl.X509KeyManager.chooseServerAlias(java.lang.String,java.security.Principal[],java.net.Socket)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_chooseServerAlias_String_PrincipalArray_Socket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getCertificateChain(java.lang.String) public abstract
     * java.security.cert.X509Certificate[] javax.net.ssl.X509KeyManager.getCertificateChain(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificateChain_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getClientAliases(java.lang.String,java.security.Principal[])
     * public abstract java.lang.String[]
     * javax.net.ssl.X509KeyManager.getClientAliases(java.lang.String,java.security.Principal[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClientAliases_String_PrincipalArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getPrivateKey(java.lang.String) public abstract
     * java.security.PrivateKey javax.net.ssl.X509KeyManager.getPrivateKey(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrivateKey_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getServerAliases(java.lang.String,java.security.Principal[])
     * public abstract java.lang.String[]
     * javax.net.ssl.X509KeyManager.getServerAliases(java.lang.String,java.security.Principal[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServerAliases_String_PrincipalArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
