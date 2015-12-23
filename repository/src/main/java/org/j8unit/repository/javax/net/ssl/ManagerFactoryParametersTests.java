package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.ManagerFactoryParameters interface
 * javax.net.ssl.ManagerFactoryParameters}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.ManagerFactoryParametersTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.ManagerFactoryParametersClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.ManagerFactoryParameters
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ManagerFactoryParametersTests<SUT extends javax.net.ssl.ManagerFactoryParameters>
extends RepositoryTests<SUT> {

}
