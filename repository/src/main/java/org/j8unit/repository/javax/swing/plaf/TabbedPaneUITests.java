package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.TabbedPaneUI class javax.swing.plaf.TabbedPaneUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TabbedPaneUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.TabbedPaneUI class javax.swing.plaf.TabbedPaneUI (the hereby targeted class-under-test class)
 * @see TabbedPaneUIClassTests TabbedPaneUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TabbedPaneUITests<SUT extends javax.swing.plaf.TabbedPaneUI>
extends ComponentUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.TabbedPaneUI#tabForCoordinate(javax.swing.JTabbedPane, int, int) public
     * abstract int javax.swing.plaf.TabbedPaneUI.tabForCoordinate(javax.swing.JTabbedPane,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.TabbedPaneUI#tabForCoordinate(javax.swing.JTabbedPane, int, int) public
     * abstract int javax.swing.plaf.TabbedPaneUI.tabForCoordinate(javax.swing.JTabbedPane,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.TabbedPaneUI#tabForCoordinate(javax.swing.JTabbedPane, int, int) public abstract int
     *      javax.swing.plaf.TabbedPaneUI.tabForCoordinate(javax.swing.JTabbedPane,int,int) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.swing.plaf.TabbedPaneUI#getTabBounds(javax.swing.JTabbedPane, int) public abstract
     * java.awt.Rectangle javax.swing.plaf.TabbedPaneUI.getTabBounds(javax.swing.JTabbedPane,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.TabbedPaneUI#getTabBounds(javax.swing.JTabbedPane, int) public abstract
     * java.awt.Rectangle javax.swing.plaf.TabbedPaneUI.getTabBounds(javax.swing.JTabbedPane,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.TabbedPaneUI#getTabBounds(javax.swing.JTabbedPane, int) public abstract java.awt.Rectangle
     *      javax.swing.plaf.TabbedPaneUI.getTabBounds(javax.swing.JTabbedPane,int) (the hereby targeted
     *      method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.swing.plaf.TabbedPaneUI#getTabRunCount(javax.swing.JTabbedPane) public abstract int
     * javax.swing.plaf.TabbedPaneUI.getTabRunCount(javax.swing.JTabbedPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.TabbedPaneUI#getTabRunCount(javax.swing.JTabbedPane) public abstract int
     *      javax.swing.plaf.TabbedPaneUI.getTabRunCount(javax.swing.JTabbedPane) (the hereby targeted
     *      method-under-test)
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
