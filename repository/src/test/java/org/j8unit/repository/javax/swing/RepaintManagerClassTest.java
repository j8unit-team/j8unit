package org.j8unit.repository.javax.swing;

import javax.swing.RepaintManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RepaintManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.RepaintManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class RepaintManagerClassTest
implements RepaintManagerClassTests<RepaintManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RepaintManager]

    @Override
    public Class<RepaintManager> createNewSUT() {
        return RepaintManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.RepaintManager#RepaintManager()
     * public javax.swing.RepaintManager()}.
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
    public void create_RepaintManager()
    throws Exception {
        // create new instance
        final RepaintManager sut = new RepaintManager();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.RepaintManager#setCurrentManager(javax.swing.RepaintManager) public static void
     * javax.swing.RepaintManager.setCurrentManager(javax.swing.RepaintManager)}.
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
    public void test_setCurrentManager_RepaintManager()
    throws Exception {
        // write some test for {@link javax.swing.RepaintManager#setCurrentManager(javax.swing.RepaintManager)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.RepaintManager#currentManager(java.awt.Component) public static javax.swing.RepaintManager
     * javax.swing.RepaintManager.currentManager(java.awt.Component)}.
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
    public void test_currentManager_Component()
    throws Exception {
        // write some test for {@link javax.swing.RepaintManager#currentManager(java.awt.Component)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.RepaintManager#currentManager(javax.swing.JComponent) public static javax.swing.RepaintManager
     * javax.swing.RepaintManager.currentManager(javax.swing.JComponent)}.
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
    public void test_currentManager_JComponent()
    throws Exception {
        // write some test for {@link javax.swing.RepaintManager#currentManager(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RepaintManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RepaintManager]

}
