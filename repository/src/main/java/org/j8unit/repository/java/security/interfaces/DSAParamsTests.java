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
 * non-{@code static} methods) of {@linkplain java.security.interfaces.DSAParams interface
 * java.security.interfaces.DSAParams}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DSAParamsClassTests}.
 * </p>
 *
 * @see java.security.interfaces.DSAParams interface java.security.interfaces.DSAParams (the hereby targeted
 *      class-under-test class)
 * @see DSAParamsClassTests DSAParamsClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DSAParamsTests<SUT extends java.security.interfaces.DSAParams>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.interfaces.DSAParams#getQ() public abstract java.math.BigInteger
     * java.security.interfaces.DSAParams.getQ()}.
     *
     * <p>
     * Test method for {@link java.security.interfaces.DSAParams#getQ() public abstract java.math.BigInteger
     * java.security.interfaces.DSAParams.getQ()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.interfaces.DSAParams#getQ() public abstract java.math.BigInteger
     *      java.security.interfaces.DSAParams.getQ() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getQ()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.interfaces.DSAParams#getP() public abstract java.math.BigInteger
     * java.security.interfaces.DSAParams.getP()}.
     *
     * <p>
     * Test method for {@link java.security.interfaces.DSAParams#getP() public abstract java.math.BigInteger
     * java.security.interfaces.DSAParams.getP()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.interfaces.DSAParams#getP() public abstract java.math.BigInteger
     *      java.security.interfaces.DSAParams.getP() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.interfaces.DSAParams#getG() public abstract java.math.BigInteger
     * java.security.interfaces.DSAParams.getG()}.
     *
     * <p>
     * Test method for {@link java.security.interfaces.DSAParams#getG() public abstract java.math.BigInteger
     * java.security.interfaces.DSAParams.getG()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.interfaces.DSAParams#getG() public abstract java.math.BigInteger
     *      java.security.interfaces.DSAParams.getG() (the hereby targeted method-under-test)
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

}
