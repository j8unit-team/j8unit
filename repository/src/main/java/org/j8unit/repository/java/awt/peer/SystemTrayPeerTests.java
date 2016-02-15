package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.peer.SystemTrayPeer interface java.awt.peer.SystemTrayPeer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SystemTrayPeerClassTests}.
 * </p>
 *
 * @see java.awt.peer.SystemTrayPeer interface java.awt.peer.SystemTrayPeer (the hereby targeted class-under-test class)
 * @see SystemTrayPeerClassTests SystemTrayPeerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SystemTrayPeerTests<SUT extends java.awt.peer.SystemTrayPeer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.SystemTrayPeer#getTrayIconSize() public abstract java.awt.Dimension
     * java.awt.peer.SystemTrayPeer.getTrayIconSize()}.
     *
     * <p>
     * Test method for {@link java.awt.peer.SystemTrayPeer#getTrayIconSize() public abstract java.awt.Dimension
     * java.awt.peer.SystemTrayPeer.getTrayIconSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.SystemTrayPeer#getTrayIconSize() public abstract java.awt.Dimension
     *      java.awt.peer.SystemTrayPeer.getTrayIconSize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTrayIconSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
