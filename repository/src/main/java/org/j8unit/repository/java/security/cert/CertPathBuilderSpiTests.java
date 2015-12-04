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
 * Test class for {@link java.security.cert.CertPathBuilderSpi class java.security.cert.CertPathBuilderSpi},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.CertPathBuilderSpiClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CertPathBuilderSpiTests<SUT extends java.security.cert.CertPathBuilderSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilderSpi#engineGetRevocationChecker() public java.security.cert.CertPathChecker java.security.cert.CertPathBuilderSpi.engineGetRevocationChecker()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetRevocationChecker() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilderSpi#engineBuild(java.security.cert.CertPathParameters) public abstract java.security.cert.CertPathBuilderResult java.security.cert.CertPathBuilderSpi.engineBuild(java.security.cert.CertPathParameters) throws java.security.cert.CertPathBuilderException,java.security.InvalidAlgorithmParameterException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineBuild_CertPathParameters() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
