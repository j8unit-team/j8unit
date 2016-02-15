package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.openmbean.InvalidOpenTypeException class
 * javax.management.openmbean.InvalidOpenTypeException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link InvalidOpenTypeExceptionClassTests}.
 * </p>
 *
 * @see javax.management.openmbean.InvalidOpenTypeException class javax.management.openmbean.InvalidOpenTypeException
 *      (the hereby targeted class-under-test class)
 * @see InvalidOpenTypeExceptionClassTests InvalidOpenTypeExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidOpenTypeExceptionTests<SUT extends javax.management.openmbean.InvalidOpenTypeException>
extends org.j8unit.repository.java.lang.IllegalArgumentExceptionTests<SUT> {

}
