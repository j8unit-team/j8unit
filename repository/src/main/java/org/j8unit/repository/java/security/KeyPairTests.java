package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.KeyPair class java.security.KeyPair}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link KeyPairClassTests}.
 * </p>
 *
 * @see java.security.KeyPair class java.security.KeyPair (the hereby targeted class-under-test class)
 * @see KeyPairClassTests KeyPairClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyPairTests<SUT extends java.security.KeyPair>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.KeyPair#getPrivate() public java.security.PrivateKey
     * java.security.KeyPair.getPrivate()}.
     *
     * <p>
     * Test method for {@link java.security.KeyPair#getPrivate() public java.security.PrivateKey
     * java.security.KeyPair.getPrivate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPair#getPrivate() public java.security.PrivateKey java.security.KeyPair.getPrivate() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrivate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyPair#getPublic() public java.security.PublicKey
     * java.security.KeyPair.getPublic()}.
     *
     * <p>
     * Test method for {@link java.security.KeyPair#getPublic() public java.security.PublicKey
     * java.security.KeyPair.getPublic()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPair#getPublic() public java.security.PublicKey java.security.KeyPair.getPublic() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPublic()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
