package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.attribute.AclEntryType class
 * java.nio.file.attribute.AclEntryType}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link AclEntryTypeClassTests}.
 * </p>
 *
 * @see java.nio.file.attribute.AclEntryType class java.nio.file.attribute.AclEntryType (the hereby targeted
 *      class-under-test class)
 * @see AclEntryTypeClassTests AclEntryTypeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AclEntryTypeTests<SUT extends java.nio.file.attribute.AclEntryType>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.nio.file.attribute.AclEntryType> {

}
