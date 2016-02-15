package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.peer.MenuItemPeer interface java.awt.peer.MenuItemPeer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MenuItemPeerClassTests}.
 * </p>
 *
 * @see java.awt.peer.MenuItemPeer interface java.awt.peer.MenuItemPeer (the hereby targeted class-under-test class)
 * @see MenuItemPeerClassTests MenuItemPeerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MenuItemPeerTests<SUT extends java.awt.peer.MenuItemPeer>
extends MenuComponentPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuItemPeer#setEnabled(boolean) public abstract void
     * java.awt.peer.MenuItemPeer.setEnabled(boolean)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.MenuItemPeer#setEnabled(boolean) public abstract void
     * java.awt.peer.MenuItemPeer.setEnabled(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.MenuItemPeer#setEnabled(boolean) public abstract void
     *      java.awt.peer.MenuItemPeer.setEnabled(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEnabled_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.MenuItemPeer#setLabel(String) public abstract void
     * java.awt.peer.MenuItemPeer.setLabel(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.MenuItemPeer#setLabel(String) public abstract void
     * java.awt.peer.MenuItemPeer.setLabel(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.MenuItemPeer#setLabel(String) public abstract void
     *      java.awt.peer.MenuItemPeer.setLabel(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLabel_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
