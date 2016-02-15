package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.accessibility.AccessibleAction interface
 * javax.accessibility.AccessibleAction}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link AccessibleActionClassTests}.
 * </p>
 *
 * @see javax.accessibility.AccessibleAction interface javax.accessibility.AccessibleAction (the hereby targeted
 *      class-under-test class)
 * @see AccessibleActionClassTests AccessibleActionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleActionTests<SUT extends javax.accessibility.AccessibleAction>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleAction#doAccessibleAction(int) public abstract boolean
     * javax.accessibility.AccessibleAction.doAccessibleAction(int)}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleAction#doAccessibleAction(int) public abstract boolean
     * javax.accessibility.AccessibleAction.doAccessibleAction(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleAction#doAccessibleAction(int) public abstract boolean
     *      javax.accessibility.AccessibleAction.doAccessibleAction(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doAccessibleAction_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleAction#getAccessibleActionDescription(int) public abstract
     * java.lang.String javax.accessibility.AccessibleAction.getAccessibleActionDescription(int)}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleAction#getAccessibleActionDescription(int) public abstract
     * java.lang.String javax.accessibility.AccessibleAction.getAccessibleActionDescription(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleAction#getAccessibleActionDescription(int) public abstract java.lang.String
     *      javax.accessibility.AccessibleAction.getAccessibleActionDescription(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleActionDescription_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleAction#getAccessibleActionCount() public abstract int
     * javax.accessibility.AccessibleAction.getAccessibleActionCount()}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleAction#getAccessibleActionCount() public abstract int
     * javax.accessibility.AccessibleAction.getAccessibleActionCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleAction#getAccessibleActionCount() public abstract int
     *      javax.accessibility.AccessibleAction.getAccessibleActionCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleActionCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
