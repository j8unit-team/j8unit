package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.directory.InvalidAttributesException class
 * javax.naming.directory.InvalidAttributesException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link InvalidAttributesExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.directory.InvalidAttributesException class javax.naming.directory.InvalidAttributesException (the
 *      hereby targeted class-under-test class)
 * @see InvalidAttributesExceptionClassTests InvalidAttributesExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidAttributesExceptionTests<SUT extends javax.naming.directory.InvalidAttributesException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
