package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.SendingContext.RunTimeOperations interface
 * org.omg.SendingContext.RunTimeOperations}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RunTimeOperationsClassTests}.
 * </p>
 *
 * @see org.omg.SendingContext.RunTimeOperations interface org.omg.SendingContext.RunTimeOperations (the hereby targeted
 *      class-under-test class)
 * @see RunTimeOperationsClassTests RunTimeOperationsClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RunTimeOperationsTests<SUT extends org.omg.SendingContext.RunTimeOperations>
extends RepositoryTests<SUT> {

}
