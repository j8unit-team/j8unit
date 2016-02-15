package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.attribute.GroupPrincipal interface
 * java.nio.file.attribute.GroupPrincipal}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link GroupPrincipalClassTests}.
 * </p>
 *
 * @see java.nio.file.attribute.GroupPrincipal interface java.nio.file.attribute.GroupPrincipal (the hereby targeted
 *      class-under-test class)
 * @see GroupPrincipalClassTests GroupPrincipalClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GroupPrincipalTests<SUT extends java.nio.file.attribute.GroupPrincipal>
extends UserPrincipalTests<SUT> {

}
