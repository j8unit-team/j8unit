package org.j8unit.repository.java.security.interfaces;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.interfaces.DSAKeyPairGenerator interface
 * java.security.interfaces.DSAKeyPairGenerator}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DSAKeyPairGeneratorClassTests}.
 * </p>
 *
 * @see java.security.interfaces.DSAKeyPairGenerator interface java.security.interfaces.DSAKeyPairGenerator (the hereby
 *      targeted class-under-test class)
 * @see DSAKeyPairGeneratorClassTests DSAKeyPairGeneratorClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DSAKeyPairGeneratorTests<SUT extends java.security.interfaces.DSAKeyPairGenerator>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.security.interfaces.DSAKeyPairGenerator#initialize(java.security.interfaces.DSAParams, java.security.SecureRandom)
     * public abstract void
     * java.security.interfaces.DSAKeyPairGenerator.initialize(java.security.interfaces.DSAParams,java.security.SecureRandom)
     * throws java.security.InvalidParameterException}.
     *
     * <p>
     * Test method for
     * {@link java.security.interfaces.DSAKeyPairGenerator#initialize(java.security.interfaces.DSAParams, java.security.SecureRandom)
     * public abstract void
     * java.security.interfaces.DSAKeyPairGenerator.initialize(java.security.interfaces.DSAParams,java.security.SecureRandom)
     * throws java.security.InvalidParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.interfaces.DSAKeyPairGenerator#initialize(java.security.interfaces.DSAParams,
     *      java.security.SecureRandom) public abstract void
     *      java.security.interfaces.DSAKeyPairGenerator.initialize(java.security.interfaces.DSAParams,java.security.
     *      SecureRandom) throws java.security.InvalidParameterException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initialize_DSAParams_SecureRandom()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.interfaces.DSAKeyPairGenerator#initialize(int, boolean, java.security.SecureRandom) public
     * abstract void java.security.interfaces.DSAKeyPairGenerator.initialize(int,boolean,java.security.SecureRandom)
     * throws java.security.InvalidParameterException}.
     *
     * <p>
     * Test method for
     * {@link java.security.interfaces.DSAKeyPairGenerator#initialize(int, boolean, java.security.SecureRandom) public
     * abstract void java.security.interfaces.DSAKeyPairGenerator.initialize(int,boolean,java.security.SecureRandom)
     * throws java.security.InvalidParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.interfaces.DSAKeyPairGenerator#initialize(int, boolean, java.security.SecureRandom) public
     *      abstract void
     *      java.security.interfaces.DSAKeyPairGenerator.initialize(int,boolean,java.security.SecureRandom) throws
     *      java.security.InvalidParameterException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initialize_int_boolean_SecureRandom()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
