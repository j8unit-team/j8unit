package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.PKIXBuilderParameters class
 * java.security.cert.PKIXBuilderParameters}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link PKIXBuilderParametersClassTests}.
 * </p>
 *
 * @see java.security.cert.PKIXBuilderParameters class java.security.cert.PKIXBuilderParameters (the hereby targeted
 *      class-under-test class)
 * @see PKIXBuilderParametersClassTests PKIXBuilderParametersClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXBuilderParametersTests<SUT extends java.security.cert.PKIXBuilderParameters>
extends PKIXParametersTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXBuilderParameters#setMaxPathLength(int) public void
     * java.security.cert.PKIXBuilderParameters.setMaxPathLength(int)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXBuilderParameters#setMaxPathLength(int) public void
     * java.security.cert.PKIXBuilderParameters.setMaxPathLength(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXBuilderParameters#setMaxPathLength(int) public void
     *      java.security.cert.PKIXBuilderParameters.setMaxPathLength(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMaxPathLength_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXBuilderParameters#getMaxPathLength() public int
     * java.security.cert.PKIXBuilderParameters.getMaxPathLength()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXBuilderParameters#getMaxPathLength() public int
     * java.security.cert.PKIXBuilderParameters.getMaxPathLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXBuilderParameters#getMaxPathLength() public int
     *      java.security.cert.PKIXBuilderParameters.getMaxPathLength() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMaxPathLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXBuilderParameters#toString() public java.lang.String
     * java.security.cert.PKIXBuilderParameters.toString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXBuilderParameters#toString() public java.lang.String
     * java.security.cert.PKIXBuilderParameters.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXBuilderParameters#toString() public java.lang.String
     *      java.security.cert.PKIXBuilderParameters.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
