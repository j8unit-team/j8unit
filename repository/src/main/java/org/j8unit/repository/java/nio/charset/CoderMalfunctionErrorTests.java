package org.j8unit.repository.java.nio.charset;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.charset.CoderMalfunctionError class
 * java.nio.charset.CoderMalfunctionError}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CoderMalfunctionErrorClassTests}.
 * </p>
 *
 * @see java.nio.charset.CoderMalfunctionError class java.nio.charset.CoderMalfunctionError (the hereby targeted
 *      class-under-test class)
 * @see CoderMalfunctionErrorClassTests CoderMalfunctionErrorClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CoderMalfunctionErrorTests<SUT extends java.nio.charset.CoderMalfunctionError>
extends org.j8unit.repository.java.lang.ErrorTests<SUT> {

}
