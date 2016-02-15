package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.synth.Region class javax.swing.plaf.synth.Region}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link RegionClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.synth.Region class javax.swing.plaf.synth.Region (the hereby targeted class-under-test class)
 * @see RegionClassTests RegionClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RegionTests<SUT extends javax.swing.plaf.synth.Region>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.Region#getName() public java.lang.String
     * javax.swing.plaf.synth.Region.getName()}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.synth.Region#getName() public java.lang.String
     * javax.swing.plaf.synth.Region.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.synth.Region#getName() public java.lang.String javax.swing.plaf.synth.Region.getName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.swing.plaf.synth.Region#isSubregion() public boolean
     * javax.swing.plaf.synth.Region.isSubregion()}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.synth.Region#isSubregion() public boolean
     * javax.swing.plaf.synth.Region.isSubregion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.synth.Region#isSubregion() public boolean javax.swing.plaf.synth.Region.isSubregion() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSubregion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.Region#toString() public java.lang.String
     * javax.swing.plaf.synth.Region.toString()}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.synth.Region#toString() public java.lang.String
     * javax.swing.plaf.synth.Region.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.synth.Region#toString() public java.lang.String javax.swing.plaf.synth.Region.toString()
     *      (the hereby targeted method-under-test)
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
