package org.j8unit.repository.java.awt.dnd.peer;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.dnd.peer.DropTargetPeer interface java.awt.dnd.peer.DropTargetPeer}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.dnd.peer.DropTargetPeerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DropTargetPeerTests<SUT extends java.awt.dnd.peer.DropTargetPeer>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.dnd.peer.DropTargetPeer#addDropTarget(java.awt.dnd.DropTarget) public abstract
     * void java.awt.dnd.peer.DropTargetPeer.addDropTarget(java.awt.dnd.DropTarget)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addDropTarget_DropTarget()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.peer.DropTargetPeer#removeDropTarget(java.awt.dnd.DropTarget) public abstract
     * void java.awt.dnd.peer.DropTargetPeer.removeDropTarget(java.awt.dnd.DropTarget)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeDropTarget_DropTarget()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
