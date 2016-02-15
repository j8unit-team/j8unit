package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.peer.MenuPeer interface java.awt.peer.MenuPeer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MenuPeerClassTests}.
 * </p>
 *
 * @see java.awt.peer.MenuPeer interface java.awt.peer.MenuPeer (the hereby targeted class-under-test class)
 * @see MenuPeerClassTests MenuPeerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MenuPeerTests<SUT extends java.awt.peer.MenuPeer>
extends MenuItemPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuPeer#delItem(int) public abstract void
     * java.awt.peer.MenuPeer.delItem(int)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.MenuPeer#delItem(int) public abstract void
     * java.awt.peer.MenuPeer.delItem(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.MenuPeer#delItem(int) public abstract void java.awt.peer.MenuPeer.delItem(int) (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.awt.peer.MenuPeer#addItem(java.awt.MenuItem) public abstract void
     * java.awt.peer.MenuPeer.addItem(java.awt.MenuItem)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.MenuPeer#addItem(java.awt.MenuItem) public abstract void
     *      java.awt.peer.MenuPeer.addItem(java.awt.MenuItem) (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.awt.peer.MenuPeer#addSeparator() public abstract void
     * java.awt.peer.MenuPeer.addSeparator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.MenuPeer#addSeparator() public abstract void java.awt.peer.MenuPeer.addSeparator() (the hereby
     *      targeted method-under-test)
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
