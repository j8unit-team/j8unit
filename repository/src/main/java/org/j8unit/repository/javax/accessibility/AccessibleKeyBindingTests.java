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
 * non-{@code static} methods) of {@linkplain javax.accessibility.AccessibleKeyBinding interface
 * javax.accessibility.AccessibleKeyBinding}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AccessibleKeyBindingClassTests}.
 * </p>
 *
 * @see javax.accessibility.AccessibleKeyBinding interface javax.accessibility.AccessibleKeyBinding (the hereby targeted
 *      class-under-test class)
 * @see AccessibleKeyBindingClassTests AccessibleKeyBindingClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleKeyBindingTests<SUT extends javax.accessibility.AccessibleKeyBinding>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleKeyBinding#getAccessibleKeyBinding(int) public abstract
     * java.lang.Object javax.accessibility.AccessibleKeyBinding.getAccessibleKeyBinding(int)}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleKeyBinding#getAccessibleKeyBinding(int) public abstract
     * java.lang.Object javax.accessibility.AccessibleKeyBinding.getAccessibleKeyBinding(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleKeyBinding#getAccessibleKeyBinding(int) public abstract java.lang.Object
     *      javax.accessibility.AccessibleKeyBinding.getAccessibleKeyBinding(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleKeyBinding_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleKeyBinding#getAccessibleKeyBindingCount() public abstract
     * int javax.accessibility.AccessibleKeyBinding.getAccessibleKeyBindingCount()}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleKeyBinding#getAccessibleKeyBindingCount() public abstract
     * int javax.accessibility.AccessibleKeyBinding.getAccessibleKeyBindingCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleKeyBinding#getAccessibleKeyBindingCount() public abstract int
     *      javax.accessibility.AccessibleKeyBinding.getAccessibleKeyBindingCount() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleKeyBindingCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
