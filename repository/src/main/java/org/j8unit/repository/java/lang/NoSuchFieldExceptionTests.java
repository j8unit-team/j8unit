package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain NoSuchFieldException class java.lang.NoSuchFieldException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link NoSuchFieldExceptionClassTests}.
 * </p>
 *
 * @see NoSuchFieldException class java.lang.NoSuchFieldException (the hereby targeted class-under-test class)
 * @see NoSuchFieldExceptionClassTests NoSuchFieldExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoSuchFieldExceptionTests<SUT extends NoSuchFieldException>
extends ReflectiveOperationExceptionTests<SUT> {

}
