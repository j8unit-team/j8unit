package org.j8unit.repository.java.awt;

import java.awt.MenuItem;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuItem} (by simply reusing the J8Unit
 * test interface {@link MenuItemClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuItemClassTest
implements MenuItemClassTests<MenuItem> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.MenuItem]

    @Override
    public Class<MenuItem> createNewSUT() {
        return MenuItem.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.MenuItem#MenuItem(String, java.awt.MenuShortcut) public
     * java.awt.MenuItem(java.lang.String,java.awt.MenuShortcut) throws java.awt.HeadlessException}.
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
    public void create_MenuItem_String_MenuShortcut()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MenuItem sut = null; // = new MenuItem(String, java.awt.MenuShortcut);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.MenuItem#MenuItem(String) public
     * java.awt.MenuItem(java.lang.String) throws java.awt.HeadlessException}.
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
    public void create_MenuItem_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MenuItem sut = null; // = new MenuItem(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.MenuItem#MenuItem() public
     * java.awt.MenuItem() throws java.awt.HeadlessException}.
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
    public void create_MenuItem()
    throws Exception {
        // create new instance
        final MenuItem sut = new MenuItem();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.MenuItem]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.MenuItem]

}
