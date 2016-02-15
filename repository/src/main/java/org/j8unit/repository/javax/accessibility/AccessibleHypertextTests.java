package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.accessibility.AccessibleHypertext interface
 * javax.accessibility.AccessibleHypertext}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AccessibleHypertextClassTests}.
 * </p>
 *
 * @see javax.accessibility.AccessibleHypertext interface javax.accessibility.AccessibleHypertext (the hereby targeted
 *      class-under-test class)
 * @see AccessibleHypertextClassTests AccessibleHypertextClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleHypertextTests<SUT extends javax.accessibility.AccessibleHypertext>
extends AccessibleTextTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleHypertext#getLinkCount() public abstract int
     * javax.accessibility.AccessibleHypertext.getLinkCount()}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleHypertext#getLinkCount() public abstract int
     * javax.accessibility.AccessibleHypertext.getLinkCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleHypertext#getLinkCount() public abstract int
     *      javax.accessibility.AccessibleHypertext.getLinkCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLinkCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleHypertext#getLink(int) public abstract
     * javax.accessibility.AccessibleHyperlink javax.accessibility.AccessibleHypertext.getLink(int)}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleHypertext#getLink(int) public abstract
     * javax.accessibility.AccessibleHyperlink javax.accessibility.AccessibleHypertext.getLink(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleHypertext#getLink(int) public abstract javax.accessibility.AccessibleHyperlink
     *      javax.accessibility.AccessibleHypertext.getLink(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLink_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleHypertext#getLinkIndex(int) public abstract int
     * javax.accessibility.AccessibleHypertext.getLinkIndex(int)}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleHypertext#getLinkIndex(int) public abstract int
     * javax.accessibility.AccessibleHypertext.getLinkIndex(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleHypertext#getLinkIndex(int) public abstract int
     *      javax.accessibility.AccessibleHypertext.getLinkIndex(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLinkIndex_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
