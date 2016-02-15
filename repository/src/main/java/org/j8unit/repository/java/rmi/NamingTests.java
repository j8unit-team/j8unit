package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.Naming class java.rmi.Naming}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link NamingClassTests}.
 * </p>
 *
 * @see java.rmi.Naming class java.rmi.Naming (the hereby targeted class-under-test class)
 * @see NamingClassTests NamingClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingTests<SUT extends java.rmi.Naming>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
