package org.j8unit.repository.java.awt.dnd.peer;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.dnd.peer.DragSourceContextPeer interface
 * java.awt.dnd.peer.DragSourceContextPeer}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.dnd.peer.DragSourceContextPeerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.dnd.peer.DragSourceContextPeerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.dnd.peer.DragSourceContextPeer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DragSourceContextPeerTests<SUT extends java.awt.dnd.peer.DragSourceContextPeer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.dnd.peer.DragSourceContextPeer#getCursor() public abstract java.awt.Cursor
     * java.awt.dnd.peer.DragSourceContextPeer.getCursor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.dnd.peer.DragSourceContextPeer#getCursor()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCursor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.peer.DragSourceContextPeer#setCursor(java.awt.Cursor) public abstract void
     * java.awt.dnd.peer.DragSourceContextPeer.setCursor(java.awt.Cursor) throws
     * java.awt.dnd.InvalidDnDOperationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.dnd.peer.DragSourceContextPeer#setCursor(java.awt.Cursor)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCursor_Cursor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.dnd.peer.DragSourceContextPeer#startDrag(java.awt.dnd.DragSourceContext, java.awt.Cursor, java.awt.Image, java.awt.Point)
     * public abstract void
     * java.awt.dnd.peer.DragSourceContextPeer.startDrag(java.awt.dnd.DragSourceContext,java.awt.Cursor,java.awt.Image,java.awt.Point)
     * throws java.awt.dnd.InvalidDnDOperationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.dnd.peer.DragSourceContextPeer#startDrag(java.awt.dnd.DragSourceContext, java.awt.Cursor,
     *             java.awt.Image, java.awt.Point)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_startDrag_DragSourceContext_Cursor_Image_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.peer.DragSourceContextPeer#transferablesFlavorsChanged() public abstract void
     * java.awt.dnd.peer.DragSourceContextPeer.transferablesFlavorsChanged()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.dnd.peer.DragSourceContextPeer#transferablesFlavorsChanged()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transferablesFlavorsChanged()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
