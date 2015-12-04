package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.DigestMethod interface javax.xml.crypto.dsig.DigestMethod},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.DigestMethodClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DigestMethodTests<SUT extends javax.xml.crypto.dsig.DigestMethod>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>,
        org.j8unit.repository.javax.xml.crypto.AlgorithmMethodTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.DigestMethod#getParameterSpec() public abstract java.security.spec.AlgorithmParameterSpec javax.xml.crypto.dsig.DigestMethod.getParameterSpec()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getParameterSpec() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
