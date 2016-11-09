package org.j8unit.repository.java.awt;

import java.awt.MenuShortcut;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuShortcut} (by simply reusing the
 * J8Unit test interface {@link MenuShortcutClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuShortcutClassTest
implements MenuShortcutClassTests<MenuShortcut> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.MenuShortcut]

    @Override
    public Class<MenuShortcut> createNewSUT() {
        return MenuShortcut.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.MenuShortcut#MenuShortcut(int) public
     * java.awt.MenuShortcut(int)}.
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
    public void create_MenuShortcut_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MenuShortcut sut = null; // = new MenuShortcut(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.MenuShortcut#MenuShortcut(int, boolean) public java.awt.MenuShortcut(int,boolean)}.
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
    public void create_MenuShortcut_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MenuShortcut sut = null; // = new MenuShortcut(int, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.MenuShortcut]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.MenuShortcut]

}
