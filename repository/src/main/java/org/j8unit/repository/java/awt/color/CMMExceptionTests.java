package org.j8unit.repository.java.awt.color;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.color.CMMException class java.awt.color.CMMException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CMMExceptionClassTests}.
 * </p>
 *
 * @see java.awt.color.CMMException class java.awt.color.CMMException (the hereby targeted class-under-test class)
 * @see CMMExceptionClassTests CMMExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CMMExceptionTests<SUT extends java.awt.color.CMMException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
