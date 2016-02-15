package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.peer.MenuBarPeer interface java.awt.peer.MenuBarPeer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MenuBarPeerClassTests}.
 * </p>
 *
 * @see java.awt.peer.MenuBarPeer interface java.awt.peer.MenuBarPeer (the hereby targeted class-under-test class)
 * @see MenuBarPeerClassTests MenuBarPeerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MenuBarPeerTests<SUT extends java.awt.peer.MenuBarPeer>
extends MenuComponentPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuBarPeer#delMenu(int) public abstract void
     * java.awt.peer.MenuBarPeer.delMenu(int)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.MenuBarPeer#delMenu(int) public abstract void
     * java.awt.peer.MenuBarPeer.delMenu(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.MenuBarPeer#delMenu(int) public abstract void java.awt.peer.MenuBarPeer.delMenu(int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_delMenu_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuBarPeer#addHelpMenu(java.awt.Menu) public abstract void
     * java.awt.peer.MenuBarPeer.addHelpMenu(java.awt.Menu)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.MenuBarPeer#addHelpMenu(java.awt.Menu) public abstract void
     * java.awt.peer.MenuBarPeer.addHelpMenu(java.awt.Menu)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.MenuBarPeer#addHelpMenu(java.awt.Menu) public abstract void
     *      java.awt.peer.MenuBarPeer.addHelpMenu(java.awt.Menu) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addHelpMenu_Menu()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuBarPeer#addMenu(java.awt.Menu) public abstract void
     * java.awt.peer.MenuBarPeer.addMenu(java.awt.Menu)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.MenuBarPeer#addMenu(java.awt.Menu) public abstract void
     * java.awt.peer.MenuBarPeer.addMenu(java.awt.Menu)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.MenuBarPeer#addMenu(java.awt.Menu) public abstract void
     *      java.awt.peer.MenuBarPeer.addMenu(java.awt.Menu) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addMenu_Menu()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
