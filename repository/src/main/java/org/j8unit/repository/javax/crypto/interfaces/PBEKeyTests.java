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
 * Test class for {@link javax.crypto.interfaces.PBEKey interface javax.crypto.interfaces.PBEKey},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.crypto.interfaces.PBEKeyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PBEKeyTests<SUT extends javax.crypto.interfaces.PBEKey>
extends org.j8unit.repository.javax.crypto.SecretKeyTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getSalt() public abstract byte[] javax.crypto.interfaces.PBEKey.getSalt()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSalt() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getIterationCount() public abstract int javax.crypto.interfaces.PBEKey.getIterationCount()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIterationCount() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getPassword() public abstract char[] javax.crypto.interfaces.PBEKey.getPassword()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPassword() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
