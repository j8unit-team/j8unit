package org.j8unit.repository.javax.swing;

import javax.swing.JMenu;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMenu} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.swing.JMenuClassTests}).
 */
@RunWith(J8Unit4.class)
public class JMenuClassTest
implements JMenuClassTests<JMenu> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JMenu]

    @Override
    public Class<JMenu> createNewSUT() {
        return JMenu.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JMenu#JMenu(String, boolean) public
     * javax.swing.JMenu(java.lang.String,boolean)}.
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
    public void create_JMenu_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMenu sut = null; // = new JMenu(String, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JMenu#JMenu(String) public
     * javax.swing.JMenu(java.lang.String)}.
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
    public void create_JMenu_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMenu sut = null; // = new JMenu(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JMenu#JMenu(javax.swing.Action)
     * public javax.swing.JMenu(javax.swing.Action)}.
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
    public void create_JMenu_Action()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMenu sut = null; // = new JMenu(javax.swing.Action);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JMenu#JMenu() public
     * javax.swing.JMenu()}.
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
    public void create_JMenu()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMenu sut = new JMenu();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JMenu]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JMenu]

}
