package org.j8unit.repository.javax.swing;

import javax.swing.JLayeredPane;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JLayeredPane} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.JLayeredPaneClassTests}).
 */

@RunWith(J8Unit4.class)
public class JLayeredPaneClassTest
implements JLayeredPaneClassTests<JLayeredPane> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JLayeredPane]

    @Override
    public Class<JLayeredPane> createNewSUT() {
        return JLayeredPane.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JLayeredPane#JLayeredPane() public
     * javax.swing.JLayeredPane()}.
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
    public void create_JLayeredPane()
    throws Exception {
        // create new instance
        final JLayeredPane sut = new JLayeredPane();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.JLayeredPane#putLayer(javax.swing.JComponent, int) public static void
     * javax.swing.JLayeredPane.putLayer(javax.swing.JComponent,int)}.
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
    public void test_putLayer_JComponent_int()
    throws Exception {
        // write some test for {@link javax.swing.JLayeredPane#putLayer(javax.swing.JComponent, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.JLayeredPane#getLayer(javax.swing.JComponent) public static int
     * javax.swing.JLayeredPane.getLayer(javax.swing.JComponent)}.
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
    public void test_getLayer_JComponent()
    throws Exception {
        // write some test for {@link javax.swing.JLayeredPane#getLayer(javax.swing.JComponent)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.JLayeredPane#getLayeredPaneAbove(java.awt.Component) public static javax.swing.JLayeredPane
     * javax.swing.JLayeredPane.getLayeredPaneAbove(java.awt.Component)}.
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
    public void test_getLayeredPaneAbove_Component()
    throws Exception {
        // write some test for {@link javax.swing.JLayeredPane#getLayeredPaneAbove(java.awt.Component)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JLayeredPane]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JLayeredPane]

}
