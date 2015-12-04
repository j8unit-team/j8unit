package org.j8unit.repository.java.security.spec;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.spec.X509EncodedKeySpec class java.security.spec.X509EncodedKeySpec},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.spec.X509EncodedKeySpecClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface X509EncodedKeySpecTests<SUT extends java.security.spec.X509EncodedKeySpec>
extends org.j8unit.repository.java.security.spec.EncodedKeySpecTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.security.spec.X509EncodedKeySpec#getFormat() public final java.lang.String java.security.spec.X509EncodedKeySpec.getFormat()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getFormat() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.X509EncodedKeySpec#getEncoded() public byte[] java.security.spec.X509EncodedKeySpec.getEncoded()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getEncoded() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
