package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.TabableView interface javax.swing.text.TabableView},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.TabableViewTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.TabableViewClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.TabableView
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TabableViewTests<SUT extends javax.swing.text.TabableView>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.TabableView#getPartialSpan(int, int) public abstract float
     * javax.swing.text.TabableView.getPartialSpan(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.TabableView#getPartialSpan(int, int)
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
     * Test method for {@link javax.swing.text.TabableView#getTabbedSpan(float, javax.swing.text.TabExpander) public
     * abstract float javax.swing.text.TabableView.getTabbedSpan(float,javax.swing.text.TabExpander)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.TabableView#getTabbedSpan(float, javax.swing.text.TabExpander)
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
