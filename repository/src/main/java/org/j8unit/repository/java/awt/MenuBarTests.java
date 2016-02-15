package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.MenuBar class java.awt.MenuBar}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link MenuBarClassTests}.
 * </p>
 *
 * @see java.awt.MenuBar class java.awt.MenuBar (the hereby targeted class-under-test class)
 * @see MenuBarClassTests MenuBarClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MenuBarTests<SUT extends java.awt.MenuBar>
extends MenuContainerTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>, MenuComponentTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#remove(int) public void java.awt.MenuBar.remove(int)}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#remove(int) public void java.awt.MenuBar.remove(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#remove(int) public void java.awt.MenuBar.remove(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#remove(java.awt.MenuComponent) public void
     * java.awt.MenuBar.remove(java.awt.MenuComponent)}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#remove(java.awt.MenuComponent) public void
     * java.awt.MenuBar.remove(java.awt.MenuComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#remove(java.awt.MenuComponent) public void java.awt.MenuBar.remove(java.awt.MenuComponent)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remove_MenuComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#getShortcutMenuItem(java.awt.MenuShortcut) public java.awt.MenuItem
     * java.awt.MenuBar.getShortcutMenuItem(java.awt.MenuShortcut)}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#getShortcutMenuItem(java.awt.MenuShortcut) public java.awt.MenuItem
     * java.awt.MenuBar.getShortcutMenuItem(java.awt.MenuShortcut)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#getShortcutMenuItem(java.awt.MenuShortcut) public java.awt.MenuItem
     *      java.awt.MenuBar.getShortcutMenuItem(java.awt.MenuShortcut) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getShortcutMenuItem_MenuShortcut()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#getAccessibleContext() public javax.accessibility.AccessibleContext
     * java.awt.MenuBar.getAccessibleContext()}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#getAccessibleContext() public javax.accessibility.AccessibleContext
     * java.awt.MenuBar.getAccessibleContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#getAccessibleContext() public javax.accessibility.AccessibleContext
     *      java.awt.MenuBar.getAccessibleContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#countMenus() public int java.awt.MenuBar.countMenus()}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#countMenus() public int java.awt.MenuBar.countMenus()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#countMenus() public int java.awt.MenuBar.countMenus() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_countMenus()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#shortcuts() public synchronized java.util.Enumeration
     * <java.awt.MenuShortcut> java.awt.MenuBar.shortcuts()}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#shortcuts() public synchronized java.util.Enumeration
     * java.awt.MenuBar.shortcuts()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#shortcuts() public synchronized java.util.Enumeration java.awt.MenuBar.shortcuts() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shortcuts()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#deleteShortcut(java.awt.MenuShortcut) public void
     * java.awt.MenuBar.deleteShortcut(java.awt.MenuShortcut)}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#deleteShortcut(java.awt.MenuShortcut) public void
     * java.awt.MenuBar.deleteShortcut(java.awt.MenuShortcut)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#deleteShortcut(java.awt.MenuShortcut) public void
     *      java.awt.MenuBar.deleteShortcut(java.awt.MenuShortcut) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteShortcut_MenuShortcut()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#add(java.awt.Menu) public java.awt.Menu
     * java.awt.MenuBar.add(java.awt.Menu)}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#add(java.awt.Menu) public java.awt.Menu
     * java.awt.MenuBar.add(java.awt.Menu)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#add(java.awt.Menu) public java.awt.Menu java.awt.MenuBar.add(java.awt.Menu) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_Menu()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#setHelpMenu(java.awt.Menu) public void
     * java.awt.MenuBar.setHelpMenu(java.awt.Menu)}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#setHelpMenu(java.awt.Menu) public void
     * java.awt.MenuBar.setHelpMenu(java.awt.Menu)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#setHelpMenu(java.awt.Menu) public void java.awt.MenuBar.setHelpMenu(java.awt.Menu) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setHelpMenu_Menu()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#getMenuCount() public int java.awt.MenuBar.getMenuCount()}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#getMenuCount() public int java.awt.MenuBar.getMenuCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#getMenuCount() public int java.awt.MenuBar.getMenuCount() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenuCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#removeNotify() public void java.awt.MenuBar.removeNotify()}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#removeNotify() public void java.awt.MenuBar.removeNotify()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#removeNotify() public void java.awt.MenuBar.removeNotify() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeNotify()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#getMenu(int) public java.awt.Menu java.awt.MenuBar.getMenu(int)}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#getMenu(int) public java.awt.Menu java.awt.MenuBar.getMenu(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#getMenu(int) public java.awt.Menu java.awt.MenuBar.getMenu(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenu_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#addNotify() public void java.awt.MenuBar.addNotify()}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#addNotify() public void java.awt.MenuBar.addNotify()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#addNotify() public void java.awt.MenuBar.addNotify() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNotify()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuBar#getHelpMenu() public java.awt.Menu java.awt.MenuBar.getHelpMenu()}.
     *
     * <p>
     * Test method for {@link java.awt.MenuBar#getHelpMenu() public java.awt.Menu java.awt.MenuBar.getHelpMenu()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuBar#getHelpMenu() public java.awt.Menu java.awt.MenuBar.getHelpMenu() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHelpMenu()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.awt.MenuComponent#getFont() class java.awt.MenuComponent}</li>
     * <li>{@linkplain java.awt.MenuContainer#getFont() interface java.awt.MenuContainer}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getFont()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.awt.MenuComponent#postEvent(java.awt.Event) class java.awt.MenuComponent}</li>
     * <li>{@linkplain java.awt.MenuContainer#postEvent(java.awt.Event) interface java.awt.MenuContainer}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postEvent_Event()
    throws Exception {
    }

}
