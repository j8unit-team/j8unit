package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.NotDirectoryException class
 * java.nio.file.NotDirectoryException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.file.NotDirectoryExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.NotDirectoryExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.NotDirectoryException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotDirectoryExceptionTests<SUT extends java.nio.file.NotDirectoryException>
extends org.j8unit.repository.java.nio.file.FileSystemExceptionTests<SUT> {

}
