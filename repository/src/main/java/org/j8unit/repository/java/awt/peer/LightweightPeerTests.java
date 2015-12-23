package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.peer.LightweightPeer interface java.awt.peer.LightweightPeer}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.peer.LightweightPeerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.peer.LightweightPeerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.peer.LightweightPeer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LightweightPeerTests<SUT extends java.awt.peer.LightweightPeer>
extends org.j8unit.repository.java.awt.peer.ComponentPeerTests<SUT> {

}
