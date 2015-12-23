package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.reflect.ReflectPermission class
 * java.lang.reflect.ReflectPermission}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.reflect.ReflectPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.reflect.ReflectPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.reflect.ReflectPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReflectPermissionTests<SUT extends java.lang.reflect.ReflectPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
