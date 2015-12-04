package org.j8unit.repository.javax.accessibility;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.accessibility.AccessibleAction interface javax.accessibility.AccessibleAction},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.accessibility.AccessibleActionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleActionTests<SUT extends javax.accessibility.AccessibleAction>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleAction#doAccessibleAction(int) public abstract boolean
     * javax.accessibility.AccessibleAction.doAccessibleAction(int)}.
     * </p>
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
     * Test method for {@link javax.accessibility.AccessibleAction#getAccessibleActionCount() public abstract int
     * javax.accessibility.AccessibleAction.getAccessibleActionCount()}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleAction#getAccessibleActionDescription(int) public abstract
     * java.lang.String javax.accessibility.AccessibleAction.getAccessibleActionDescription(int)}.
     * </p>
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

}
