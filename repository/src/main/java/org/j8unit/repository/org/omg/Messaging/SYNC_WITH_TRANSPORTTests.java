package org.j8unit.repository.org.omg.Messaging;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.Messaging.SYNC_WITH_TRANSPORT interface
 * org.omg.Messaging.SYNC_WITH_TRANSPORT}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SYNC_WITH_TRANSPORTClassTests}.
 * </p>
 *
 * @see org.omg.Messaging.SYNC_WITH_TRANSPORT interface org.omg.Messaging.SYNC_WITH_TRANSPORT (the hereby targeted
 *      class-under-test class)
 * @see SYNC_WITH_TRANSPORTClassTests SYNC_WITH_TRANSPORTClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SYNC_WITH_TRANSPORTTests<SUT extends org.omg.Messaging.SYNC_WITH_TRANSPORT>
extends RepositoryTests<SUT> {

}
