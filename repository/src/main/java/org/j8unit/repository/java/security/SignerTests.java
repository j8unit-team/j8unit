package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.Signer class java.security.Signer}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link SignerClassTests}.
 * </p>
 *
 * @see java.security.Signer class java.security.Signer (the hereby targeted class-under-test class)
 * @see SignerClassTests SignerClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SignerTests<SUT extends java.security.Signer>
extends IdentityTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.Signer#getPrivateKey() public java.security.PrivateKey
     * java.security.Signer.getPrivateKey()}.
     *
     * <p>
     * Test method for {@link java.security.Signer#getPrivateKey() public java.security.PrivateKey
     * java.security.Signer.getPrivateKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signer#getPrivateKey() public java.security.PrivateKey java.security.Signer.getPrivateKey()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrivateKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signer#toString() public java.lang.String java.security.Signer.toString()}.
     *
     * <p>
     * Test method for {@link java.security.Signer#toString() public java.lang.String java.security.Signer.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signer#toString() public java.lang.String java.security.Signer.toString() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signer#setKeyPair(java.security.KeyPair) public final void
     * java.security.Signer.setKeyPair(java.security.KeyPair) throws
     * java.security.InvalidParameterException,java.security.KeyException}.
     *
     * <p>
     * Test method for {@link java.security.Signer#setKeyPair(java.security.KeyPair) public final void
     * java.security.Signer.setKeyPair(java.security.KeyPair) throws
     * java.security.InvalidParameterException,java.security.KeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signer#setKeyPair(java.security.KeyPair) public final void
     *      java.security.Signer.setKeyPair(java.security.KeyPair) throws
     *      java.security.InvalidParameterException,java.security.KeyException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setKeyPair_KeyPair()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
