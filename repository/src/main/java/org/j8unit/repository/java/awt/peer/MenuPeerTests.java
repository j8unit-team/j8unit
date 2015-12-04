package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.peer.MenuPeer interface java.awt.peer.MenuPeer}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.peer.MenuPeerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MenuPeerTests<SUT extends java.awt.peer.MenuPeer>
extends org.j8unit.repository.java.awt.peer.MenuItemPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuPeer#delItem(int) public abstract void
     * java.awt.peer.MenuPeer.delItem(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_delItem_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuPeer#addItem(java.awt.MenuItem) public abstract void
     * java.awt.peer.MenuPeer.addItem(java.awt.MenuItem)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addItem_MenuItem()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuPeer#addSeparator() public abstract void
     * java.awt.peer.MenuPeer.addSeparator()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addSeparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
