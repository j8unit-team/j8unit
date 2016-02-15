package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.directory.InvalidSearchFilterException class
 * javax.naming.directory.InvalidSearchFilterException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link InvalidSearchFilterExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.directory.InvalidSearchFilterException class javax.naming.directory.InvalidSearchFilterException
 *      (the hereby targeted class-under-test class)
 * @see InvalidSearchFilterExceptionClassTests InvalidSearchFilterExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidSearchFilterExceptionTests<SUT extends javax.naming.directory.InvalidSearchFilterException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
