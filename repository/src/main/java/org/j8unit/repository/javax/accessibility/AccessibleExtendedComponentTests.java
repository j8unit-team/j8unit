package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.accessibility.AccessibleExtendedComponent interface
 * javax.accessibility.AccessibleExtendedComponent}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AccessibleExtendedComponentClassTests}.
 * </p>
 *
 * @see javax.accessibility.AccessibleExtendedComponent interface javax.accessibility.AccessibleExtendedComponent (the
 *      hereby targeted class-under-test class)
 * @see AccessibleExtendedComponentClassTests AccessibleExtendedComponentClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleExtendedComponentTests<SUT extends javax.accessibility.AccessibleExtendedComponent>
extends AccessibleComponentTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedComponent#getToolTipText() public abstract
     * java.lang.String javax.accessibility.AccessibleExtendedComponent.getToolTipText()}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedComponent#getToolTipText() public abstract
     * java.lang.String javax.accessibility.AccessibleExtendedComponent.getToolTipText()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleExtendedComponent#getToolTipText() public abstract java.lang.String
     *      javax.accessibility.AccessibleExtendedComponent.getToolTipText() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getToolTipText()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedComponent#getAccessibleKeyBinding() public abstract
     * javax.accessibility.AccessibleKeyBinding
     * javax.accessibility.AccessibleExtendedComponent.getAccessibleKeyBinding()}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedComponent#getAccessibleKeyBinding() public abstract
     * javax.accessibility.AccessibleKeyBinding
     * javax.accessibility.AccessibleExtendedComponent.getAccessibleKeyBinding()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleExtendedComponent#getAccessibleKeyBinding() public abstract
     *      javax.accessibility.AccessibleKeyBinding
     *      javax.accessibility.AccessibleExtendedComponent.getAccessibleKeyBinding() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleKeyBinding()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedComponent#getTitledBorderText() public abstract
     * java.lang.String javax.accessibility.AccessibleExtendedComponent.getTitledBorderText()}.
     *
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedComponent#getTitledBorderText() public abstract
     * java.lang.String javax.accessibility.AccessibleExtendedComponent.getTitledBorderText()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.accessibility.AccessibleExtendedComponent#getTitledBorderText() public abstract java.lang.String
     *      javax.accessibility.AccessibleExtendedComponent.getTitledBorderText() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTitledBorderText()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
