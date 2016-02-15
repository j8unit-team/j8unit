package org.j8unit.repository.javax.crypto.interfaces;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.interfaces.PBEKey interface javax.crypto.interfaces.PBEKey}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link PBEKeyClassTests}.
 * </p>
 *
 * @see javax.crypto.interfaces.PBEKey interface javax.crypto.interfaces.PBEKey (the hereby targeted class-under-test
 *      class)
 * @see PBEKeyClassTests PBEKeyClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PBEKeyTests<SUT extends javax.crypto.interfaces.PBEKey>
extends org.j8unit.repository.javax.crypto.SecretKeyTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getSalt() public abstract byte[]
     * javax.crypto.interfaces.PBEKey.getSalt()}.
     *
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getSalt() public abstract byte[]
     * javax.crypto.interfaces.PBEKey.getSalt()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.interfaces.PBEKey#getSalt() public abstract byte[] javax.crypto.interfaces.PBEKey.getSalt()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSalt()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getIterationCount() public abstract int
     * javax.crypto.interfaces.PBEKey.getIterationCount()}.
     *
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getIterationCount() public abstract int
     * javax.crypto.interfaces.PBEKey.getIterationCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.interfaces.PBEKey#getIterationCount() public abstract int
     *      javax.crypto.interfaces.PBEKey.getIterationCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIterationCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getPassword() public abstract char[]
     * javax.crypto.interfaces.PBEKey.getPassword()}.
     *
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getPassword() public abstract char[]
     * javax.crypto.interfaces.PBEKey.getPassword()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.interfaces.PBEKey#getPassword() public abstract char[]
     *      javax.crypto.interfaces.PBEKey.getPassword() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPassword()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
