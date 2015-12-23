package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.attribute.GroupPrincipal interface
 * java.nio.file.attribute.GroupPrincipal}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.file.attribute.GroupPrincipalTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.attribute.GroupPrincipalClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.attribute.GroupPrincipal
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GroupPrincipalTests<SUT extends java.nio.file.attribute.GroupPrincipal>
extends org.j8unit.repository.java.nio.file.attribute.UserPrincipalTests<SUT> {

}
