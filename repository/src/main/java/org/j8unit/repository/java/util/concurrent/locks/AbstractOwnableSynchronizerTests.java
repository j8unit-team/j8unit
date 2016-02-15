package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.locks.AbstractOwnableSynchronizer class
 * java.util.concurrent.locks.AbstractOwnableSynchronizer}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AbstractOwnableSynchronizerClassTests}.
 * </p>
 *
 * @see java.util.concurrent.locks.AbstractOwnableSynchronizer class
 *      java.util.concurrent.locks.AbstractOwnableSynchronizer (the hereby targeted class-under-test class)
 * @see AbstractOwnableSynchronizerClassTests AbstractOwnableSynchronizerClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractOwnableSynchronizerTests<SUT extends java.util.concurrent.locks.AbstractOwnableSynchronizer>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
