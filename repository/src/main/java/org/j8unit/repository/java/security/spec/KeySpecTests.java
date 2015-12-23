package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.spec.KeySpec interface java.security.spec.KeySpec},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.spec.KeySpecTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.spec.KeySpecClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.spec.KeySpec
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeySpecTests<SUT extends java.security.spec.KeySpec>
extends RepositoryTests<SUT> {

}
