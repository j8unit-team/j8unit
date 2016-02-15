package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.FileAlreadyExistsException class
 * java.nio.file.FileAlreadyExistsException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link FileAlreadyExistsExceptionClassTests}.
 * </p>
 *
 * @see java.nio.file.FileAlreadyExistsException class java.nio.file.FileAlreadyExistsException (the hereby targeted
 *      class-under-test class)
 * @see FileAlreadyExistsExceptionClassTests FileAlreadyExistsExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileAlreadyExistsExceptionTests<SUT extends java.nio.file.FileAlreadyExistsException>
extends FileSystemExceptionTests<SUT> {

}
