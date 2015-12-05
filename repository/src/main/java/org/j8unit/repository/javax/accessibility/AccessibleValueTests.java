package org.j8unit.repository.javax.accessibility;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.accessibility.AccessibleValue interface javax.accessibility.AccessibleValue}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.accessibility.AccessibleValueClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleValueTests<SUT extends javax.accessibility.AccessibleValue>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleValue#getCurrentAccessibleValue() public abstract
     * java.lang.Number javax.accessibility.AccessibleValue.getCurrentAccessibleValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrentAccessibleValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleValue#getMaximumAccessibleValue() public abstract
     * java.lang.Number javax.accessibility.AccessibleValue.getMaximumAccessibleValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMaximumAccessibleValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleValue#getMinimumAccessibleValue() public abstract
     * java.lang.Number javax.accessibility.AccessibleValue.getMinimumAccessibleValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinimumAccessibleValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleValue#setCurrentAccessibleValue(java.lang.Number) public
     * abstract boolean javax.accessibility.AccessibleValue.setCurrentAccessibleValue(java.lang.Number)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCurrentAccessibleValue_Number()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}