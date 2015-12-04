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
 * Test class for {@link javax.net.ssl.ExtendedSSLSession class javax.net.ssl.ExtendedSSLSession},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.ExtendedSSLSessionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ExtendedSSLSessionTests<SUT extends javax.net.ssl.ExtendedSSLSession>
extends org.j8unit.repository.javax.net.ssl.SSLSessionTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getPeerSupportedSignatureAlgorithms() public abstract java.lang.String[] javax.net.ssl.ExtendedSSLSession.getPeerSupportedSignatureAlgorithms()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPeerSupportedSignatureAlgorithms() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getLocalSupportedSignatureAlgorithms() public abstract java.lang.String[] javax.net.ssl.ExtendedSSLSession.getLocalSupportedSignatureAlgorithms()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocalSupportedSignatureAlgorithms() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getRequestedServerNames() public java.util.List javax.net.ssl.ExtendedSSLSession.getRequestedServerNames()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRequestedServerNames() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
