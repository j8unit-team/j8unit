package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.lang.model.type.ErrorType interface
 * javax.lang.model.type.ErrorType}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.lang.model.type.ErrorTypeTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.lang.model.type.ErrorTypeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.lang.model.type.ErrorType
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ErrorTypeTests<SUT extends javax.lang.model.type.ErrorType>
extends org.j8unit.repository.javax.lang.model.type.DeclaredTypeTests<SUT> {

}
