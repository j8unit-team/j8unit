package org.j8unit.repository.java.security.interfaces;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.interfaces.DSAPublicKey interface java.security.interfaces.DSAPublicKey},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.interfaces.DSAPublicKeyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DSAPublicKeyTests<SUT extends java.security.interfaces.DSAPublicKey>
extends org.j8unit.repository.java.security.interfaces.DSAKeyTests<SUT>, org.j8unit.repository.java.security.PublicKeyTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.interfaces.DSAPublicKey#getY() public abstract java.math.BigInteger
     * java.security.interfaces.DSAPublicKey.getY()}.
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
