package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.directory.NoSuchAttributeException class
 * javax.naming.directory.NoSuchAttributeException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link NoSuchAttributeExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.directory.NoSuchAttributeException class javax.naming.directory.NoSuchAttributeException (the
 *      hereby targeted class-under-test class)
 * @see NoSuchAttributeExceptionClassTests NoSuchAttributeExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoSuchAttributeExceptionTests<SUT extends javax.naming.directory.NoSuchAttributeException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
