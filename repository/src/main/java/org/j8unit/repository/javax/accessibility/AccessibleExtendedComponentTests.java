package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.accessibility.AccessibleExtendedComponent interface
 * javax.accessibility.AccessibleExtendedComponent}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.accessibility.AccessibleExtendedComponentTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.accessibility.AccessibleExtendedComponentClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.accessibility.AccessibleExtendedComponent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleExtendedComponentTests<SUT extends javax.accessibility.AccessibleExtendedComponent>
extends org.j8unit.repository.javax.accessibility.AccessibleComponentTests<SUT> {

    /**
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
     * @j8unit.aim javax.accessibility.AccessibleExtendedComponent#getAccessibleKeyBinding()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.accessibility.AccessibleExtendedComponent#getTitledBorderText()
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

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedComponent#getToolTipText() public abstract
     * java.lang.String javax.accessibility.AccessibleExtendedComponent.getToolTipText()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.accessibility.AccessibleExtendedComponent#getToolTipText()
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

}
