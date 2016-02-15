package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.Executors class java.util.concurrent.Executors}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ExecutorsClassTests}.
 * </p>
 *
 * @see java.util.concurrent.Executors class java.util.concurrent.Executors (the hereby targeted class-under-test class)
 * @see ExecutorsClassTests ExecutorsClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExecutorsTests<SUT extends java.util.concurrent.Executors>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
