package org.j8unit.repository.javax.swing;

import javax.swing.JToolBar;
import javax.swing.JToolBar.Separator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JToolBar} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.JToolBarClassTests}).
 */

@RunWith(J8Unit4.class)
public class JToolBarClassTest
implements JToolBarClassTests<JToolBar> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JToolBar]

    @Override
    public Class<JToolBar> createNewSUT() {
        return JToolBar.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JToolBar#JToolBar() public
     * javax.swing.JToolBar()}.
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
    public void create_JToolBar()
    throws Exception {
        // create new instance
        final JToolBar sut = new JToolBar();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JToolBar#JToolBar(int) public
     * javax.swing.JToolBar(int)}.
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
    public void create_JToolBar_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JToolBar sut = null; // = new JToolBar(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JToolBar#JToolBar(String) public
     * javax.swing.JToolBar(java.lang.String)}.
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
    public void create_JToolBar_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JToolBar sut = null; // = new JToolBar(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JToolBar#JToolBar(String, int)
     * public javax.swing.JToolBar(java.lang.String,int)}.
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
    public void create_JToolBar_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JToolBar sut = null; // = new JToolBar(String, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JToolBar]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JToolBar]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Separator} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.JToolBarClassTests.SeparatorClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SeparatorClassTest
    implements SeparatorClassTests<Separator> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JToolBar$Separator]

        @Override
        public Class<Separator> createNewSUT() {
            return Separator.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link javax.swing.JToolBar.Separator#Separator()
         * public javax.swing.JToolBar$Separator()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Separator()
        throws Exception {
            // create new instance
            final Separator sut = new Separator();
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.JToolBar.Separator#Separator(java.awt.Dimension) public
         * javax.swing.JToolBar$Separator(java.awt.Dimension)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Separator_Dimension()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Separator sut = null; // = new Separator(java.awt.Dimension);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JToolBar$Separator]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JToolBar$Separator]

    }

}
