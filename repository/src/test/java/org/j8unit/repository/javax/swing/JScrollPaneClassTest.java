package org.j8unit.repository.javax.swing;

import javax.swing.JScrollPane;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JScrollPane} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.JScrollPaneClassTests}).
 */

@RunWith(J8Unit4.class)
public class JScrollPaneClassTest
implements JScrollPaneClassTests<JScrollPane> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JScrollPane]

    @Override
    public Class<JScrollPane> createNewSUT() {
        return JScrollPane.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JScrollPane#JScrollPane(java.awt.Component, int, int) public
     * javax.swing.JScrollPane(java.awt.Component,int,int)}.
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
    public void create_JScrollPane_Component_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JScrollPane sut = null; // = new JScrollPane(java.awt.Component, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JScrollPane#JScrollPane() public
     * javax.swing.JScrollPane()}.
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
    public void create_JScrollPane()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JScrollPane sut = new JScrollPane();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JScrollPane#JScrollPane(int, int)
     * public javax.swing.JScrollPane(int,int)}.
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
    public void create_JScrollPane_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JScrollPane sut = null; // = new JScrollPane(int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JScrollPane#JScrollPane(java.awt.Component) public
     * javax.swing.JScrollPane(java.awt.Component)}.
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
    public void create_JScrollPane_Component()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JScrollPane sut = null; // = new JScrollPane(java.awt.Component);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JScrollPane]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JScrollPane]

}
