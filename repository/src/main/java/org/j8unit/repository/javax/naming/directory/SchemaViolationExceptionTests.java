package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.directory.SchemaViolationException class
 * javax.naming.directory.SchemaViolationException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link SchemaViolationExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.directory.SchemaViolationException class javax.naming.directory.SchemaViolationException (the
 *      hereby targeted class-under-test class)
 * @see SchemaViolationExceptionClassTests SchemaViolationExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SchemaViolationExceptionTests<SUT extends javax.naming.directory.SchemaViolationException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
