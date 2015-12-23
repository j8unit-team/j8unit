package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.X509ExtendedKeyManager class
 * javax.net.ssl.X509ExtendedKeyManager}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.X509ExtendedKeyManagerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.X509ExtendedKeyManagerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.X509ExtendedKeyManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509ExtendedKeyManagerTests<SUT extends javax.net.ssl.X509ExtendedKeyManager>
extends org.j8unit.repository.javax.net.ssl.X509KeyManagerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineClientAlias(java.lang.String[], java.security.Principal[], javax.net.ssl.SSLEngine)
     * public java.lang.String
     * javax.net.ssl.X509ExtendedKeyManager.chooseEngineClientAlias(java.lang.String[],java.security.Principal[],javax.net.ssl.SSLEngine)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.X509ExtendedKeyManager#chooseEngineClientAlias(java.lang.String[],
     *             java.security.Principal[], javax.net.ssl.SSLEngine)
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

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineServerAlias(java.lang.String, java.security.Principal[], javax.net.ssl.SSLEngine)
     * public java.lang.String
     * javax.net.ssl.X509ExtendedKeyManager.chooseEngineServerAlias(java.lang.String,java.security.Principal[],javax.net.ssl.SSLEngine)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.X509ExtendedKeyManager#chooseEngineServerAlias(java.lang.String,
     *             java.security.Principal[], javax.net.ssl.SSLEngine)
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

}
