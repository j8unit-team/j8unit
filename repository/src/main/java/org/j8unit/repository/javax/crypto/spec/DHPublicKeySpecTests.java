package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.crypto.spec.DHPublicKeySpec class javax.crypto.spec.DHPublicKeySpec}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.crypto.spec.DHPublicKeySpecClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DHPublicKeySpecTests<SUT extends javax.crypto.spec.DHPublicKeySpec>
extends org.j8unit.repository.java.security.spec.KeySpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DHPublicKeySpec#getP() public java.math.BigInteger
     * javax.crypto.spec.DHPublicKeySpec.getP()}.
     * </p>
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
     * Test method for {@link javax.crypto.spec.DHPublicKeySpec#getG() public java.math.BigInteger
     * javax.crypto.spec.DHPublicKeySpec.getG()}.
     * </p>
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
     * Test method for {@link javax.crypto.spec.DHPublicKeySpec#getY() public java.math.BigInteger
     * javax.crypto.spec.DHPublicKeySpec.getY()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getY()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
