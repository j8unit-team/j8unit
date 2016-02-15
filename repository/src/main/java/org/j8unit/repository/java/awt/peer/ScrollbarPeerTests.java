package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.peer.ScrollbarPeer interface java.awt.peer.ScrollbarPeer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ScrollbarPeerClassTests}.
 * </p>
 *
 * @see java.awt.peer.ScrollbarPeer interface java.awt.peer.ScrollbarPeer (the hereby targeted class-under-test class)
 * @see ScrollbarPeerClassTests ScrollbarPeerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ScrollbarPeerTests<SUT extends java.awt.peer.ScrollbarPeer>
extends ComponentPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.ScrollbarPeer#setPageIncrement(int) public abstract void
     * java.awt.peer.ScrollbarPeer.setPageIncrement(int)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.ScrollbarPeer#setPageIncrement(int) public abstract void
     * java.awt.peer.ScrollbarPeer.setPageIncrement(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.ScrollbarPeer#setPageIncrement(int) public abstract void
     *      java.awt.peer.ScrollbarPeer.setPageIncrement(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPageIncrement_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.ScrollbarPeer#setValues(int, int, int, int) public abstract void
     * java.awt.peer.ScrollbarPeer.setValues(int,int,int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.ScrollbarPeer#setValues(int, int, int, int) public abstract void
     * java.awt.peer.ScrollbarPeer.setValues(int,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.ScrollbarPeer#setValues(int, int, int, int) public abstract void
     *      java.awt.peer.ScrollbarPeer.setValues(int,int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setValues_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.ScrollbarPeer#setLineIncrement(int) public abstract void
     * java.awt.peer.ScrollbarPeer.setLineIncrement(int)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.ScrollbarPeer#setLineIncrement(int) public abstract void
     * java.awt.peer.ScrollbarPeer.setLineIncrement(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.ScrollbarPeer#setLineIncrement(int) public abstract void
     *      java.awt.peer.ScrollbarPeer.setLineIncrement(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLineIncrement_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
