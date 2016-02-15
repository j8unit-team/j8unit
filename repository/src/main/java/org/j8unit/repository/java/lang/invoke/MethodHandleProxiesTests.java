package org.j8unit.repository.java.lang.invoke;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.invoke.MethodHandleProxies class
 * java.lang.invoke.MethodHandleProxies}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MethodHandleProxiesClassTests}.
 * </p>
 *
 * @see java.lang.invoke.MethodHandleProxies class java.lang.invoke.MethodHandleProxies (the hereby targeted
 *      class-under-test class)
 * @see MethodHandleProxiesClassTests MethodHandleProxiesClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MethodHandleProxiesTests<SUT extends java.lang.invoke.MethodHandleProxies>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
