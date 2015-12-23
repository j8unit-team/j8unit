package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.crypto.SecretKeyFactory class javax.crypto.SecretKeyFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.SecretKeyFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.crypto.SecretKeyFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.crypto.SecretKeyFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecretKeyFactoryTests<SUT extends javax.crypto.SecretKeyFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#generateSecret(java.security.spec.KeySpec) public final
     * javax.crypto.SecretKey javax.crypto.SecretKeyFactory.generateSecret(java.security.spec.KeySpec) throws
     * java.security.spec.InvalidKeySpecException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.crypto.SecretKeyFactory#generateSecret(java.security.spec.KeySpec)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSecret_KeySpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#getAlgorithm() public final java.lang.String
     * javax.crypto.SecretKeyFactory.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.crypto.SecretKeyFactory#getAlgorithm()
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
     * Test method for {@link javax.crypto.SecretKeyFactory#getKeySpec(javax.crypto.SecretKey, java.lang.Class) public
     * final java.security.spec.KeySpec javax.crypto.SecretKeyFactory.getKeySpec(javax.crypto.SecretKey,java.lang.Class)
     * throws java.security.spec.InvalidKeySpecException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.crypto.SecretKeyFactory#getKeySpec(javax.crypto.SecretKey, java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySpec_SecretKey_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#getProvider() public final java.security.Provider
     * javax.crypto.SecretKeyFactory.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.crypto.SecretKeyFactory#getProvider()
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
     * Test method for {@link javax.crypto.SecretKeyFactory#translateKey(javax.crypto.SecretKey) public final
     * javax.crypto.SecretKey javax.crypto.SecretKeyFactory.translateKey(javax.crypto.SecretKey) throws
     * java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.crypto.SecretKeyFactory#translateKey(javax.crypto.SecretKey)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_translateKey_SecretKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
