package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.FileNotFoundException class java.io.FileNotFoundException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FileNotFoundExceptionClassTests}.
 * </p>
 *
 * @see java.io.FileNotFoundException class java.io.FileNotFoundException (the hereby targeted class-under-test class)
 * @see FileNotFoundExceptionClassTests FileNotFoundExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileNotFoundExceptionTests<SUT extends java.io.FileNotFoundException>
extends IOExceptionTests<SUT> {

}
