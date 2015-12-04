package org.j8unit.repository.java.security.cert;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.cert.CertStoreSpi class java.security.cert.CertStoreSpi},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.CertStoreSpiClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CertStoreSpiTests<SUT extends java.security.cert.CertStoreSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.security.cert.CertStoreSpi#engineGetCertificates(java.security.cert.CertSelector) public abstract java.util.Collection java.security.cert.CertStoreSpi.engineGetCertificates(java.security.cert.CertSelector) throws java.security.cert.CertStoreException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetCertificates_CertSelector() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertStoreSpi#engineGetCRLs(java.security.cert.CRLSelector) public abstract java.util.Collection java.security.cert.CertStoreSpi.engineGetCRLs(java.security.cert.CRLSelector) throws java.security.cert.CertStoreException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetCRLs_CRLSelector() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
