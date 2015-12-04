package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.peer.DialogPeer interface java.awt.peer.DialogPeer}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.peer.DialogPeerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DialogPeerTests<SUT extends java.awt.peer.DialogPeer>
extends org.j8unit.repository.java.awt.peer.WindowPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.DialogPeer#setTitle(java.lang.String) public abstract void
     * java.awt.peer.DialogPeer.setTitle(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTitle_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.DialogPeer#blockWindows(java.util.List) public abstract void
     * java.awt.peer.DialogPeer.blockWindows(java.util.List)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_blockWindows_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.DialogPeer#setResizable(boolean) public abstract void
     * java.awt.peer.DialogPeer.setResizable(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setResizable_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
