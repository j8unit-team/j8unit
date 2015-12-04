package org.j8unit.repository.javax.swing.text;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.TabableView interface javax.swing.text.TabableView}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.TabableViewClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TabableViewTests<SUT extends javax.swing.text.TabableView>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.TabableView#getPartialSpan(int,int) public abstract float
     * javax.swing.text.TabableView.getPartialSpan(int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPartialSpan_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.TabableView#getTabbedSpan(float,javax.swing.text.TabExpander) public
     * abstract float javax.swing.text.TabableView.getTabbedSpan(float,javax.swing.text.TabExpander)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTabbedSpan_float_TabExpander()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
