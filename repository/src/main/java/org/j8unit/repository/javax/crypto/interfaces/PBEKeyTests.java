package org.j8unit.repository.javax.crypto.interfaces;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.crypto.interfaces.PBEKey interface
 * javax.crypto.interfaces.PBEKey}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.interfaces.PBEKeyTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.crypto.interfaces.PBEKeyClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.crypto.interfaces.PBEKey
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PBEKeyTests<SUT extends javax.crypto.interfaces.PBEKey>
extends org.j8unit.repository.javax.crypto.SecretKeyTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getIterationCount() public abstract int
     * javax.crypto.interfaces.PBEKey.getIterationCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.crypto.interfaces.PBEKey#getIterationCount()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.crypto.interfaces.PBEKey#getPassword()
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

    /**
     * <p>
     * Test method for {@link javax.crypto.interfaces.PBEKey#getSalt() public abstract byte[]
     * javax.crypto.interfaces.PBEKey.getSalt()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.crypto.interfaces.PBEKey#getSalt()
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

}
