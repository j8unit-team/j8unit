package org.j8unit.repository.java.awt;

import java.awt.PopupMenu;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PopupMenuClassTest
implements org.j8unit.repository.java.awt.PopupMenuClassTests<PopupMenu> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PopupMenu]

    @Override
    public Class<PopupMenu> createNewSUT() {
        return PopupMenu.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PopupMenu#PopupMenu() public
     * java.awt.PopupMenu() throws java.awt.HeadlessException}.
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
    public void create_PopupMenu()
    throws Exception {
        // create new instance
        final PopupMenu sut = new PopupMenu();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PopupMenu#PopupMenu(String) public
     * java.awt.PopupMenu(java.lang.String) throws java.awt.HeadlessException}.
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
    public void create_PopupMenu_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PopupMenu sut = null; // = new PopupMenu(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PopupMenu]

}
