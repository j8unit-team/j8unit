package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.peer.MouseInfoPeer interface java.awt.peer.MouseInfoPeer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.peer.MouseInfoPeerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.peer.MouseInfoPeerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.peer.MouseInfoPeer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MouseInfoPeerTests<SUT extends java.awt.peer.MouseInfoPeer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.MouseInfoPeer#fillPointWithCoords(java.awt.Point) public abstract int
     * java.awt.peer.MouseInfoPeer.fillPointWithCoords(java.awt.Point)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.peer.MouseInfoPeer#fillPointWithCoords(java.awt.Point)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fillPointWithCoords_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.MouseInfoPeer#isWindowUnderMouse(java.awt.Window) public abstract boolean
     * java.awt.peer.MouseInfoPeer.isWindowUnderMouse(java.awt.Window)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.peer.MouseInfoPeer#isWindowUnderMouse(java.awt.Window)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isWindowUnderMouse_Window()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
