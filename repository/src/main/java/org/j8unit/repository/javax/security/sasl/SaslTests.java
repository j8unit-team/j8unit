package org.j8unit.repository.javax.security.sasl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.sasl.Sasl class javax.security.sasl.Sasl}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SaslClassTests}.
 * </p>
 *
 * @see javax.security.sasl.Sasl class javax.security.sasl.Sasl (the hereby targeted class-under-test class)
 * @see SaslClassTests SaslClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SaslTests<SUT extends javax.security.sasl.Sasl>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
