package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.spec.InvalidParameterSpecException class
 * java.security.spec.InvalidParameterSpecException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.security.spec.InvalidParameterSpecExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.spec.InvalidParameterSpecExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.spec.InvalidParameterSpecException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidParameterSpecExceptionTests<SUT extends java.security.spec.InvalidParameterSpecException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
