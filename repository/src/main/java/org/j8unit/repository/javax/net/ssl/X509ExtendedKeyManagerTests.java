package org.j8unit.repository.javax.net.ssl;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.net.ssl.X509ExtendedKeyManager class javax.net.ssl.X509ExtendedKeyManager},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.X509ExtendedKeyManagerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface X509ExtendedKeyManagerTests<SUT extends javax.net.ssl.X509ExtendedKeyManager>
extends org.j8unit.repository.javax.net.ssl.X509KeyManagerTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineServerAlias(java.lang.String,java.security.Principal[],javax.net.ssl.SSLEngine) public java.lang.String javax.net.ssl.X509ExtendedKeyManager.chooseEngineServerAlias(java.lang.String,java.security.Principal[],javax.net.ssl.SSLEngine)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_chooseEngineServerAlias_String_PrincipalArray_SSLEngine() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.X509ExtendedKeyManager#chooseEngineClientAlias(java.lang.String[],java.security.Principal[],javax.net.ssl.SSLEngine) public java.lang.String javax.net.ssl.X509ExtendedKeyManager.chooseEngineClientAlias(java.lang.String[],java.security.Principal[],javax.net.ssl.SSLEngine)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_chooseEngineClientAlias_StringArray_PrincipalArray_SSLEngine() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
