package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.accessibility.AccessibleExtendedComponent interface
 * javax.accessibility.AccessibleExtendedComponent}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.accessibility.AccessibleExtendedComponentClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AccessibleExtendedComponentTests<SUT extends javax.accessibility.AccessibleExtendedComponent>
extends org.j8unit.repository.javax.accessibility.AccessibleComponentTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedComponent#getAccessibleKeyBinding() public abstract
     * javax.accessibility.AccessibleKeyBinding
     * javax.accessibility.AccessibleExtendedComponent.getAccessibleKeyBinding()}.
     * </p>
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
     * </p>
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
     * </p>
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
