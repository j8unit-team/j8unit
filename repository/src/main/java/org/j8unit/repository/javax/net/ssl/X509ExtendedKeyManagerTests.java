package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.X509ExtendedKeyManager class
 * javax.net.ssl.X509ExtendedKeyManager}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link X509ExtendedKeyManagerClassTests}.
 * </p>
 *
 * @see javax.net.ssl.X509ExtendedKeyManager class javax.net.ssl.X509ExtendedKeyManager (the hereby targeted
 *      class-under-test class)
 * @see X509ExtendedKeyManagerClassTests X509ExtendedKeyManagerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509ExtendedKeyManagerTests<SUT extends javax.net.ssl.X509ExtendedKeyManager>
extends X509KeyManagerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineServerAlias(String, java.security.Principal[], javax.net.ssl.SSLEngine)
     * public java.lang.String
     * javax.net.ssl.X509ExtendedKeyManager.chooseEngineServerAlias(java.lang.String,java.security.Principal[],javax.net.ssl.SSLEngine)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineServerAlias(String, java.security.Principal[], javax.net.ssl.SSLEngine)
     * public java.lang.String
     * javax.net.ssl.X509ExtendedKeyManager.chooseEngineServerAlias(java.lang.String,java.security.Principal[],javax.net.ssl.SSLEngine)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509ExtendedKeyManager#chooseEngineServerAlias(String, java.security.Principal[],
     *      javax.net.ssl.SSLEngine) public java.lang.String
     *      javax.net.ssl.X509ExtendedKeyManager.chooseEngineServerAlias(java.lang.String,java.security.Principal[],
     *      javax.net.ssl.SSLEngine) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_chooseEngineServerAlias_String_PrincipalArray_SSLEngine()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineClientAlias(String[], java.security.Principal[], javax.net.ssl.SSLEngine)
     * public java.lang.String
     * javax.net.ssl.X509ExtendedKeyManager.chooseEngineClientAlias(java.lang.String[],java.security.Principal[],javax.net.ssl.SSLEngine)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineClientAlias(String[], java.security.Principal[], javax.net.ssl.SSLEngine)
     * public java.lang.String
     * javax.net.ssl.X509ExtendedKeyManager.chooseEngineClientAlias(java.lang.String[],java.security.Principal[],javax.net.ssl.SSLEngine)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509ExtendedKeyManager#chooseEngineClientAlias(String[], java.security.Principal[],
     *      javax.net.ssl.SSLEngine) public java.lang.String
     *      javax.net.ssl.X509ExtendedKeyManager.chooseEngineClientAlias(java.lang.String[],java.security.Principal[],
     *      javax.net.ssl.SSLEngine) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_chooseEngineClientAlias_StringArray_PrincipalArray_SSLEngine()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
