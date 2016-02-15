package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.attribute.UserPrincipal interface
 * java.nio.file.attribute.UserPrincipal}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link UserPrincipalClassTests}.
 * </p>
 *
 * @see java.nio.file.attribute.UserPrincipal interface java.nio.file.attribute.UserPrincipal (the hereby targeted
 *      class-under-test class)
 * @see UserPrincipalClassTests UserPrincipalClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UserPrincipalTests<SUT extends java.nio.file.attribute.UserPrincipal>
extends org.j8unit.repository.java.security.PrincipalTests<SUT> {

}
