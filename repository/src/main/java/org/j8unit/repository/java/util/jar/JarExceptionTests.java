package org.j8unit.repository.java.util.jar;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.jar.JarException class java.util.jar.JarException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JarExceptionClassTests}.
 * </p>
 *
 * @see java.util.jar.JarException class java.util.jar.JarException (the hereby targeted class-under-test class)
 * @see JarExceptionClassTests JarExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JarExceptionTests<SUT extends java.util.jar.JarException>
extends org.j8unit.repository.java.util.zip.ZipExceptionTests<SUT> {

}
