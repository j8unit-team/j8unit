package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.NotLinkException class java.nio.file.NotLinkException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.file.NotLinkExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.NotLinkExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.NotLinkException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotLinkExceptionTests<SUT extends java.nio.file.NotLinkException>
extends org.j8unit.repository.java.nio.file.FileSystemExceptionTests<SUT> {

}
