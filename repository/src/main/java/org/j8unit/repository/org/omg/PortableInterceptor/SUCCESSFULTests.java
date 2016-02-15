package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.SUCCESSFUL interface
 * org.omg.PortableInterceptor.SUCCESSFUL}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SUCCESSFULClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.SUCCESSFUL interface org.omg.PortableInterceptor.SUCCESSFUL (the hereby targeted
 *      class-under-test class)
 * @see SUCCESSFULClassTests SUCCESSFULClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SUCCESSFULTests<SUT extends org.omg.PortableInterceptor.SUCCESSFUL>
extends RepositoryTests<SUT> {

}
