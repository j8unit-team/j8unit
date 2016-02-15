package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.ServiceNotFoundException class
 * javax.management.ServiceNotFoundException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ServiceNotFoundExceptionClassTests}.
 * </p>
 *
 * @see javax.management.ServiceNotFoundException class javax.management.ServiceNotFoundException (the hereby targeted
 *      class-under-test class)
 * @see ServiceNotFoundExceptionClassTests ServiceNotFoundExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServiceNotFoundExceptionTests<SUT extends javax.management.ServiceNotFoundException>
extends OperationsExceptionTests<SUT> {

}
