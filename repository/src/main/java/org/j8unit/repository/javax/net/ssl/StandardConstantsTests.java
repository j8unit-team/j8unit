package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.StandardConstants class javax.net.ssl.StandardConstants}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link StandardConstantsClassTests}.
 * </p>
 *
 * @see javax.net.ssl.StandardConstants class javax.net.ssl.StandardConstants (the hereby targeted class-under-test
 *      class)
 * @see StandardConstantsClassTests StandardConstantsClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardConstantsTests<SUT extends javax.net.ssl.StandardConstants>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
