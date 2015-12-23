package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.reflect.MalformedParametersException class
 * java.lang.reflect.MalformedParametersException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.lang.reflect.MalformedParametersExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.reflect.MalformedParametersExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.reflect.MalformedParametersException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MalformedParametersExceptionTests<SUT extends java.lang.reflect.MalformedParametersException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
