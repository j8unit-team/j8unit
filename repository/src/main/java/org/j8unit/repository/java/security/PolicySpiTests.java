package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.PolicySpi class java.security.PolicySpi}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.PolicySpiTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.PolicySpiClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.PolicySpi
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PolicySpiTests<SUT extends java.security.PolicySpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
