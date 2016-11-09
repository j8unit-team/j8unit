package org.j8unit.repository.javax.swing;

import javax.swing.JPanel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JPanel} (by simply reusing the J8Unit
 * test interface {@link JPanelClassTests}).
 */

@RunWith(J8Unit4.class)
public class JPanelClassTest
implements JPanelClassTests<JPanel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JPanel]

    @Override
    public Class<JPanel> createNewSUT() {
        return JPanel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JPanel#JPanel(java.awt.LayoutManager, boolean) public
     * javax.swing.JPanel(java.awt.LayoutManager,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JPanel_LayoutManager_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JPanel sut = null; // = new JPanel(java.awt.LayoutManager, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JPanel#JPanel(java.awt.LayoutManager) public javax.swing.JPanel(java.awt.LayoutManager)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JPanel_LayoutManager()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JPanel sut = null; // = new JPanel(java.awt.LayoutManager);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JPanel#JPanel(boolean) public
     * javax.swing.JPanel(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JPanel_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JPanel sut = null; // = new JPanel(boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JPanel#JPanel() public
     * javax.swing.JPanel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JPanel()
    throws Exception {
        // create new instance
        final JPanel sut = new JPanel();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JPanel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JPanel]

}
