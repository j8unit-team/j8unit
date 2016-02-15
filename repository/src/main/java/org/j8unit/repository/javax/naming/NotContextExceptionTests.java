package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.NotContextException class javax.naming.NotContextException}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link NotContextExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.NotContextException class javax.naming.NotContextException (the hereby targeted class-under-test
 *      class)
 * @see NotContextExceptionClassTests NotContextExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotContextExceptionTests<SUT extends javax.naming.NotContextException>
extends NamingExceptionTests<SUT> {

}
