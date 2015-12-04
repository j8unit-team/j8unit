package org.j8unit.repository.javax.accessibility;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.accessibility.AccessibleKeyBinding interface javax.accessibility.AccessibleKeyBinding},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.accessibility.AccessibleKeyBindingClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AccessibleKeyBindingTests<SUT extends javax.accessibility.AccessibleKeyBinding>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleKeyBinding#getAccessibleKeyBinding(int) public abstract
     * java.lang.Object javax.accessibility.AccessibleKeyBinding.getAccessibleKeyBinding(int)}.
     * </p>
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
     * </p>
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
