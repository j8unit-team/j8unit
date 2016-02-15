package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.spec.DHPrivateKeySpec class
 * javax.crypto.spec.DHPrivateKeySpec}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DHPrivateKeySpecClassTests}.
 * </p>
 *
 * @see javax.crypto.spec.DHPrivateKeySpec class javax.crypto.spec.DHPrivateKeySpec (the hereby targeted
 *      class-under-test class)
 * @see DHPrivateKeySpecClassTests DHPrivateKeySpecClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DHPrivateKeySpecTests<SUT extends javax.crypto.spec.DHPrivateKeySpec>
extends org.j8unit.repository.java.security.spec.KeySpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DHPrivateKeySpec#getP() public java.math.BigInteger
     * javax.crypto.spec.DHPrivateKeySpec.getP()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.DHPrivateKeySpec#getP() public java.math.BigInteger
     * javax.crypto.spec.DHPrivateKeySpec.getP()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.DHPrivateKeySpec#getP() public java.math.BigInteger
     *      javax.crypto.spec.DHPrivateKeySpec.getP() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getP()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DHPrivateKeySpec#getG() public java.math.BigInteger
     * javax.crypto.spec.DHPrivateKeySpec.getG()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.DHPrivateKeySpec#getG() public java.math.BigInteger
     * javax.crypto.spec.DHPrivateKeySpec.getG()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.DHPrivateKeySpec#getG() public java.math.BigInteger
     *      javax.crypto.spec.DHPrivateKeySpec.getG() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getG()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DHPrivateKeySpec#getX() public java.math.BigInteger
     * javax.crypto.spec.DHPrivateKeySpec.getX()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.DHPrivateKeySpec#getX() public java.math.BigInteger
     * javax.crypto.spec.DHPrivateKeySpec.getX()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.DHPrivateKeySpec#getX() public java.math.BigInteger
     *      javax.crypto.spec.DHPrivateKeySpec.getX() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getX()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
