package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509ExtendedKeyManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link X509ExtendedKeyManager public abstract class javax.net.ssl.X509ExtendedKeyManager}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.net.ssl.X509ExtendedKeyManagerClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509ExtendedKeyManagerTests<SUT extends X509ExtendedKeyManager>
extends X509KeyManagerTests<SUT>, ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.X509ExtendedKeyManager]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineServerAlias(String, java.security.Principal[], javax.net.ssl.SSLEngine)
     * public java.lang.String
     * javax.net.ssl.X509ExtendedKeyManager.chooseEngineServerAlias(java.lang.String,java.security.Principal[],javax.net.ssl.SSLEngine)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineClientAlias(String[], java.security.Principal[], javax.net.ssl.SSLEngine)
     * public java.lang.String
     * javax.net.ssl.X509ExtendedKeyManager.chooseEngineClientAlias(java.lang.String[],java.security.Principal[],javax.net.ssl.SSLEngine)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.X509ExtendedKeyManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.X509ExtendedKeyManager]

}
