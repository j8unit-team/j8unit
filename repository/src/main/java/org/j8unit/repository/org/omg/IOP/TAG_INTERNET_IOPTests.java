package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.TAG_INTERNET_IOP interface org.omg.IOP.TAG_INTERNET_IOP}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TAG_INTERNET_IOPClassTests}.
 * </p>
 *
 * @see org.omg.IOP.TAG_INTERNET_IOP interface org.omg.IOP.TAG_INTERNET_IOP (the hereby targeted class-under-test class)
 * @see TAG_INTERNET_IOPClassTests TAG_INTERNET_IOPClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TAG_INTERNET_IOPTests<SUT extends org.omg.IOP.TAG_INTERNET_IOP>
extends RepositoryTests<SUT> {

}
