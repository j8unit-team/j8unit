package org.j8unit.repository.java.util.stream;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.stream.Collectors class java.util.stream.Collectors}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CollectorsClassTests}.
 * </p>
 *
 * @see java.util.stream.Collectors class java.util.stream.Collectors (the hereby targeted class-under-test class)
 * @see CollectorsClassTests CollectorsClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollectorsTests<SUT extends java.util.stream.Collectors>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
