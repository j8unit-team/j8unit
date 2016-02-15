package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.peer.PanelPeer interface java.awt.peer.PanelPeer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PanelPeerClassTests}.
 * </p>
 *
 * @see java.awt.peer.PanelPeer interface java.awt.peer.PanelPeer (the hereby targeted class-under-test class)
 * @see PanelPeerClassTests PanelPeerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PanelPeerTests<SUT extends java.awt.peer.PanelPeer>
extends ContainerPeerTests<SUT> {

}
