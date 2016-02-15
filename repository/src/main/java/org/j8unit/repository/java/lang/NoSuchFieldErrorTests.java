package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain NoSuchFieldError class java.lang.NoSuchFieldError}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link NoSuchFieldErrorClassTests}.
 * </p>
 *
 * @see NoSuchFieldError class java.lang.NoSuchFieldError (the hereby targeted class-under-test class)
 * @see NoSuchFieldErrorClassTests NoSuchFieldErrorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoSuchFieldErrorTests<SUT extends NoSuchFieldError>
extends IncompatibleClassChangeErrorTests<SUT> {

}
