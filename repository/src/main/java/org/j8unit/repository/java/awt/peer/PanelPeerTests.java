package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.peer.PanelPeer interface java.awt.peer.PanelPeer}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.peer.PanelPeerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.peer.PanelPeerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.peer.PanelPeer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PanelPeerTests<SUT extends java.awt.peer.PanelPeer>
extends org.j8unit.repository.java.awt.peer.ContainerPeerTests<SUT> {

}
