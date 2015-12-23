package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.ConfigurationException class
 * javax.naming.ConfigurationException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.ConfigurationExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.ConfigurationExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.ConfigurationException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConfigurationExceptionTests<SUT extends javax.naming.ConfigurationException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
