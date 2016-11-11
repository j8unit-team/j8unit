package org.j8unit.repository.java.awt;

import java.awt.Menu;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Menu} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.awt.MenuClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuClassTest
implements MenuClassTests<Menu> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Menu]

    @Override
    public Class<Menu> createNewSUT() {
        return Menu.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Menu#Menu(String, boolean) public
     * java.awt.Menu(java.lang.String,boolean) throws java.awt.HeadlessException}.
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
    public void create_Menu_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Menu sut = null; // = new Menu(String, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Menu#Menu(String) public
     * java.awt.Menu(java.lang.String) throws java.awt.HeadlessException}.
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
    public void create_Menu_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Menu sut = null; // = new Menu(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Menu#Menu() public java.awt.Menu()
     * throws java.awt.HeadlessException}.
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
    public void create_Menu()
    throws Exception {
        // create new instance
        final Menu sut = new Menu();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Menu]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Menu]

}
