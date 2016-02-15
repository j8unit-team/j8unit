package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.FileSystemNotFoundException class
 * java.nio.file.FileSystemNotFoundException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link FileSystemNotFoundExceptionClassTests}.
 * </p>
 *
 * @see java.nio.file.FileSystemNotFoundException class java.nio.file.FileSystemNotFoundException (the hereby targeted
 *      class-under-test class)
 * @see FileSystemNotFoundExceptionClassTests FileSystemNotFoundExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileSystemNotFoundExceptionTests<SUT extends java.nio.file.FileSystemNotFoundException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
