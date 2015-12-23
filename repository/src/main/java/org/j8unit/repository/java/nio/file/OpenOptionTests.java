package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.OpenOption interface java.nio.file.OpenOption},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.file.OpenOptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.OpenOptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.OpenOption
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OpenOptionTests<SUT extends java.nio.file.OpenOption>
extends RepositoryTests<SUT> {

}
