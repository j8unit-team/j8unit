package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.AlgorithmParameterGeneratorSpi class
 * java.security.AlgorithmParameterGeneratorSpi}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.security.AlgorithmParameterGeneratorSpiTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.AlgorithmParameterGeneratorSpiClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.AlgorithmParameterGeneratorSpi
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AlgorithmParameterGeneratorSpiTests<SUT extends java.security.AlgorithmParameterGeneratorSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
