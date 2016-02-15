package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.NON_EXISTENT interface
 * org.omg.PortableInterceptor.NON_EXISTENT}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link NON_EXISTENTClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.NON_EXISTENT interface org.omg.PortableInterceptor.NON_EXISTENT (the hereby targeted
 *      class-under-test class)
 * @see NON_EXISTENTClassTests NON_EXISTENTClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NON_EXISTENTTests<SUT extends org.omg.PortableInterceptor.NON_EXISTENT>
extends RepositoryTests<SUT> {

}
