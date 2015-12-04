package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.spec.PKCS8EncodedKeySpec class java.security.spec.PKCS8EncodedKeySpec},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.spec.PKCS8EncodedKeySpecClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKCS8EncodedKeySpecTests<SUT extends java.security.spec.PKCS8EncodedKeySpec>
extends org.j8unit.repository.java.security.spec.EncodedKeySpecTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.spec.PKCS8EncodedKeySpec#getEncoded() public byte[]
     * java.security.spec.PKCS8EncodedKeySpec.getEncoded()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getEncoded()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.PKCS8EncodedKeySpec#getFormat() public final java.lang.String
     * java.security.spec.PKCS8EncodedKeySpec.getFormat()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
