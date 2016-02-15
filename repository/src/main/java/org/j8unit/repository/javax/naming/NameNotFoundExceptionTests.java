package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.NameNotFoundException class
 * javax.naming.NameNotFoundException}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link NameNotFoundExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.NameNotFoundException class javax.naming.NameNotFoundException (the hereby targeted
 *      class-under-test class)
 * @see NameNotFoundExceptionClassTests NameNotFoundExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NameNotFoundExceptionTests<SUT extends javax.naming.NameNotFoundException>
extends NamingExceptionTests<SUT> {

}
