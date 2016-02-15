package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.StandardLocation class javax.tools.StandardLocation}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link StandardLocationClassTests}.
 * </p>
 *
 * @see javax.tools.StandardLocation class javax.tools.StandardLocation (the hereby targeted class-under-test class)
 * @see StandardLocationClassTests StandardLocationClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardLocationTests<SUT extends javax.tools.StandardLocation>
extends JavaFileManagerTests.LocationTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, javax.tools.StandardLocation> {

    /**
     * <p>
     * Test method for {@link javax.tools.StandardLocation#getName() public java.lang.String
     * javax.tools.StandardLocation.getName()}.
     *
     * <p>
     * Test method for {@link javax.tools.StandardLocation#getName() public java.lang.String
     * javax.tools.StandardLocation.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.StandardLocation#getName() public java.lang.String javax.tools.StandardLocation.getName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.StandardLocation#isOutputLocation() public boolean
     * javax.tools.StandardLocation.isOutputLocation()}.
     *
     * <p>
     * Test method for {@link javax.tools.StandardLocation#isOutputLocation() public boolean
     * javax.tools.StandardLocation.isOutputLocation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.StandardLocation#isOutputLocation() public boolean
     *      javax.tools.StandardLocation.isOutputLocation() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isOutputLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
