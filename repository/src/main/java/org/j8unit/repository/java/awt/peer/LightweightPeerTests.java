package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.peer.LightweightPeer interface java.awt.peer.LightweightPeer}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link LightweightPeerClassTests}.
 * </p>
 *
 * @see java.awt.peer.LightweightPeer interface java.awt.peer.LightweightPeer (the hereby targeted class-under-test
 *      class)
 * @see LightweightPeerClassTests LightweightPeerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LightweightPeerTests<SUT extends java.awt.peer.LightweightPeer>
extends ComponentPeerTests<SUT> {

}
