package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.X509KeyManager interface javax.net.ssl.X509KeyManager}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link X509KeyManagerClassTests}.
 * </p>
 *
 * @see javax.net.ssl.X509KeyManager interface javax.net.ssl.X509KeyManager (the hereby targeted class-under-test class)
 * @see X509KeyManagerClassTests X509KeyManagerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509KeyManagerTests<SUT extends javax.net.ssl.X509KeyManager>
extends KeyManagerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getClientAliases(String, java.security.Principal[]) public
     * abstract java.lang.String[]
     * javax.net.ssl.X509KeyManager.getClientAliases(java.lang.String,java.security.Principal[])}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getClientAliases(String, java.security.Principal[]) public
     * abstract java.lang.String[]
     * javax.net.ssl.X509KeyManager.getClientAliases(java.lang.String,java.security.Principal[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509KeyManager#getClientAliases(String, java.security.Principal[]) public abstract
     *      java.lang.String[] javax.net.ssl.X509KeyManager.getClientAliases(java.lang.String,java.security.Principal[])
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.X509KeyManager#getCertificateChain(String) public abstract
     * java.security.cert.X509Certificate[] javax.net.ssl.X509KeyManager.getCertificateChain(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getCertificateChain(String) public abstract
     * java.security.cert.X509Certificate[] javax.net.ssl.X509KeyManager.getCertificateChain(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509KeyManager#getCertificateChain(String) public abstract
     *      java.security.cert.X509Certificate[] javax.net.ssl.X509KeyManager.getCertificateChain(java.lang.String) (the
     *      hereby targeted method-under-test)
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
     * Test method for
     * {@link javax.net.ssl.X509KeyManager#chooseClientAlias(String[], java.security.Principal[], java.net.Socket)
     * public abstract java.lang.String
     * javax.net.ssl.X509KeyManager.chooseClientAlias(java.lang.String[],java.security.Principal[],java.net.Socket)}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509KeyManager#chooseClientAlias(String[], java.security.Principal[], java.net.Socket)
     * public abstract java.lang.String
     * javax.net.ssl.X509KeyManager.chooseClientAlias(java.lang.String[],java.security.Principal[],java.net.Socket)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509KeyManager#chooseClientAlias(String[], java.security.Principal[], java.net.Socket) public
     *      abstract java.lang.String
     *      javax.net.ssl.X509KeyManager.chooseClientAlias(java.lang.String[],java.security.Principal[],java.net.Socket)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.X509KeyManager#getServerAliases(String, java.security.Principal[]) public
     * abstract java.lang.String[]
     * javax.net.ssl.X509KeyManager.getServerAliases(java.lang.String,java.security.Principal[])}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getServerAliases(String, java.security.Principal[]) public
     * abstract java.lang.String[]
     * javax.net.ssl.X509KeyManager.getServerAliases(java.lang.String,java.security.Principal[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509KeyManager#getServerAliases(String, java.security.Principal[]) public abstract
     *      java.lang.String[] javax.net.ssl.X509KeyManager.getServerAliases(java.lang.String,java.security.Principal[])
     *      (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getPrivateKey(String) public abstract
     * java.security.PrivateKey javax.net.ssl.X509KeyManager.getPrivateKey(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.X509KeyManager#getPrivateKey(String) public abstract
     * java.security.PrivateKey javax.net.ssl.X509KeyManager.getPrivateKey(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509KeyManager#getPrivateKey(String) public abstract java.security.PrivateKey
     *      javax.net.ssl.X509KeyManager.getPrivateKey(java.lang.String) (the hereby targeted method-under-test)
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
     * Test method for
     * {@link javax.net.ssl.X509KeyManager#chooseServerAlias(String, java.security.Principal[], java.net.Socket) public
     * abstract java.lang.String
     * javax.net.ssl.X509KeyManager.chooseServerAlias(java.lang.String,java.security.Principal[],java.net.Socket)}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509KeyManager#chooseServerAlias(String, java.security.Principal[], java.net.Socket) public
     * abstract java.lang.String
     * javax.net.ssl.X509KeyManager.chooseServerAlias(java.lang.String,java.security.Principal[],java.net.Socket)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509KeyManager#chooseServerAlias(String, java.security.Principal[], java.net.Socket) public
     *      abstract java.lang.String
     *      javax.net.ssl.X509KeyManager.chooseServerAlias(java.lang.String,java.security.Principal[],java.net.Socket)
     *      (the hereby targeted method-under-test)
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

}
