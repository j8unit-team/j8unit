package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.KeyFactory class java.security.KeyFactory}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.KeyFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface KeyFactoryTests<SUT extends java.security.KeyFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#generatePublic(java.security.spec.KeySpec) public final
     * java.security.PublicKey java.security.KeyFactory.generatePublic(java.security.spec.KeySpec) throws
     * java.security.spec.InvalidKeySpecException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generatePublic_KeySpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#getProvider() public final java.security.Provider
     * java.security.KeyFactory.getProvider()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#getAlgorithm() public final java.lang.String
     * java.security.KeyFactory.getAlgorithm()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlgorithm()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#generatePrivate(java.security.spec.KeySpec) public final
     * java.security.PrivateKey java.security.KeyFactory.generatePrivate(java.security.spec.KeySpec) throws
     * java.security.spec.InvalidKeySpecException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generatePrivate_KeySpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#getKeySpec(java.security.Key,java.lang.Class) public final
     * java.security.spec.KeySpec java.security.KeyFactory.getKeySpec(java.security.Key,java.lang.Class) throws
     * java.security.spec.InvalidKeySpecException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySpec_Key_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#translateKey(java.security.Key) public final java.security.Key
     * java.security.KeyFactory.translateKey(java.security.Key) throws java.security.InvalidKeyException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_translateKey_Key()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
