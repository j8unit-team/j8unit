package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.annotation.processing.Completions class
 * javax.annotation.processing.Completions}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CompletionsClassTests}.
 * </p>
 *
 * @see javax.annotation.processing.Completions class javax.annotation.processing.Completions (the hereby targeted
 *      class-under-test class)
 * @see CompletionsClassTests CompletionsClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompletionsTests<SUT extends javax.annotation.processing.Completions>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
