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
 * Test class for {@link javax.crypto.interfaces.DHPrivateKey interface javax.crypto.interfaces.DHPrivateKey},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.crypto.interfaces.DHPrivateKeyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DHPrivateKeyTests<SUT extends javax.crypto.interfaces.DHPrivateKey>
extends org.j8unit.repository.javax.crypto.interfaces.DHKeyTests<SUT>,
        org.j8unit.repository.java.security.PrivateKeyTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.DHPrivateKey#getX() public abstract java.math.BigInteger javax.crypto.interfaces.DHPrivateKey.getX()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getX() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
