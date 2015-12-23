package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.attribute.AclEntryPermission class
 * java.nio.file.attribute.AclEntryPermission}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.nio.file.attribute.AclEntryPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.attribute.AclEntryPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.attribute.AclEntryPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AclEntryPermissionTests<SUT extends java.nio.file.attribute.AclEntryPermission>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.nio.file.attribute.AclEntryPermission> {

}
