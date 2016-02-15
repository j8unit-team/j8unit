package org.j8unit.repository.javax.crypto.interfaces;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.interfaces.DHPrivateKey interface
 * javax.crypto.interfaces.DHPrivateKey}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DHPrivateKeyClassTests}.
 * </p>
 *
 * @see javax.crypto.interfaces.DHPrivateKey interface javax.crypto.interfaces.DHPrivateKey (the hereby targeted
 *      class-under-test class)
 * @see DHPrivateKeyClassTests DHPrivateKeyClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DHPrivateKeyTests<SUT extends javax.crypto.interfaces.DHPrivateKey>
extends DHKeyTests<SUT>, org.j8unit.repository.java.security.PrivateKeyTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.DHPrivateKey#getX() public abstract java.math.BigInteger
     * javax.crypto.interfaces.DHPrivateKey.getX()}.
     *
     * <p>
     * Test method for {@link javax.crypto.interfaces.DHPrivateKey#getX() public abstract java.math.BigInteger
     * javax.crypto.interfaces.DHPrivateKey.getX()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.interfaces.DHPrivateKey#getX() public abstract java.math.BigInteger
     *      javax.crypto.interfaces.DHPrivateKey.getX() (the hereby targeted method-under-test)
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
