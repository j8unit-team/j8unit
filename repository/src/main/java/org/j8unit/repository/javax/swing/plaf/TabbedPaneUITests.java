package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.TabbedPaneUI class javax.swing.plaf.TabbedPaneUI}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.TabbedPaneUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TabbedPaneUITests<SUT extends javax.swing.plaf.TabbedPaneUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.TabbedPaneUI#tabForCoordinate(javax.swing.JTabbedPane,int,int) public
     * abstract int javax.swing.plaf.TabbedPaneUI.tabForCoordinate(javax.swing.JTabbedPane,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tabForCoordinate_JTabbedPane_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.TabbedPaneUI#getTabBounds(javax.swing.JTabbedPane,int) public abstract
     * java.awt.Rectangle javax.swing.plaf.TabbedPaneUI.getTabBounds(javax.swing.JTabbedPane,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTabBounds_JTabbedPane_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.TabbedPaneUI#getTabRunCount(javax.swing.JTabbedPane) public abstract int
     * javax.swing.plaf.TabbedPaneUI.getTabRunCount(javax.swing.JTabbedPane)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTabRunCount_JTabbedPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
