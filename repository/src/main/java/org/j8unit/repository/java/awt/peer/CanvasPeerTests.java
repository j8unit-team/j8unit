package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.peer.CanvasPeer interface java.awt.peer.CanvasPeer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.peer.CanvasPeerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.peer.CanvasPeerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.peer.CanvasPeer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CanvasPeerTests<SUT extends java.awt.peer.CanvasPeer>
extends org.j8unit.repository.java.awt.peer.ComponentPeerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.awt.peer.CanvasPeer#getAppropriateGraphicsConfiguration(java.awt.GraphicsConfiguration) public
     * abstract java.awt.GraphicsConfiguration
     * java.awt.peer.CanvasPeer.getAppropriateGraphicsConfiguration(java.awt.GraphicsConfiguration)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.peer.CanvasPeer#getAppropriateGraphicsConfiguration(java.awt.GraphicsConfiguration)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAppropriateGraphicsConfiguration_GraphicsConfiguration()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
