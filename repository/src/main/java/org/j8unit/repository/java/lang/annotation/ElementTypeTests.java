package org.j8unit.repository.java.lang.annotation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.annotation.ElementType class
 * java.lang.annotation.ElementType}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.annotation.ElementTypeTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.annotation.ElementTypeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.annotation.ElementType
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ElementTypeTests<SUT extends java.lang.annotation.ElementType>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.lang.annotation.ElementType> {

}
