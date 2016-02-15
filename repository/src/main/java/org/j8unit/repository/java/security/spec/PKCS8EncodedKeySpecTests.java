package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.spec.PKCS8EncodedKeySpec class
 * java.security.spec.PKCS8EncodedKeySpec}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link PKCS8EncodedKeySpecClassTests}.
 * </p>
 *
 * @see java.security.spec.PKCS8EncodedKeySpec class java.security.spec.PKCS8EncodedKeySpec (the hereby targeted
 *      class-under-test class)
 * @see PKCS8EncodedKeySpecClassTests PKCS8EncodedKeySpecClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKCS8EncodedKeySpecTests<SUT extends java.security.spec.PKCS8EncodedKeySpec>
extends EncodedKeySpecTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.spec.PKCS8EncodedKeySpec#getEncoded() public byte[]
     * java.security.spec.PKCS8EncodedKeySpec.getEncoded()}.
     *
     * <p>
     * Test method for {@link java.security.spec.PKCS8EncodedKeySpec#getEncoded() public byte[]
     * java.security.spec.PKCS8EncodedKeySpec.getEncoded()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.PKCS8EncodedKeySpec#getEncoded() public byte[]
     *      java.security.spec.PKCS8EncodedKeySpec.getEncoded() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
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
     *
     * <p>
     * Test method for {@link java.security.spec.PKCS8EncodedKeySpec#getFormat() public final java.lang.String
     * java.security.spec.PKCS8EncodedKeySpec.getFormat()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.PKCS8EncodedKeySpec#getFormat() public final java.lang.String
     *      java.security.spec.PKCS8EncodedKeySpec.getFormat() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
