package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.peer.MenuBarPeer interface java.awt.peer.MenuBarPeer}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.peer.MenuBarPeerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MenuBarPeerTests<SUT extends java.awt.peer.MenuBarPeer>
extends org.j8unit.repository.java.awt.peer.MenuComponentPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuBarPeer#delMenu(int) public abstract void
     * java.awt.peer.MenuBarPeer.delMenu(int)}.
     * </p>
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
     * </p>
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
     * </p>
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
