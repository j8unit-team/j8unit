package org.j8unit.repository.org.omg.Messaging;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.Messaging.SYNC_WITH_TRANSPORT interface
 * org.omg.Messaging.SYNC_WITH_TRANSPORT}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.Messaging.SYNC_WITH_TRANSPORTTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.Messaging.SYNC_WITH_TRANSPORTClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.Messaging.SYNC_WITH_TRANSPORT
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SYNC_WITH_TRANSPORTTests<SUT extends org.omg.Messaging.SYNC_WITH_TRANSPORT>
extends RepositoryTests<SUT> {

}
