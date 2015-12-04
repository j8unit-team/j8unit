package org.j8unit.repository.javax.crypto.interfaces;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.crypto.interfaces.DHPublicKey interface javax.crypto.interfaces.DHPublicKey},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.crypto.interfaces.DHPublicKeyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DHPublicKeyTests<SUT extends javax.crypto.interfaces.DHPublicKey>
extends org.j8unit.repository.javax.crypto.interfaces.DHKeyTests<SUT>,
        org.j8unit.repository.java.security.PublicKeyTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.DHPublicKey#getY() public abstract java.math.BigInteger javax.crypto.interfaces.DHPublicKey.getY()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getY() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
