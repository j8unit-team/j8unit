package org.j8unit.repository.java.lang.ref;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.ref.WeakReference class java.lang.ref.WeakReference}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link WeakReferenceClassTests}.
 * </p>
 *
 * @see java.lang.ref.WeakReference class java.lang.ref.WeakReference (the hereby targeted class-under-test class)
 * @see WeakReferenceClassTests WeakReferenceClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WeakReferenceTests<SUT extends java.lang.ref.WeakReference<T>, T>
extends ReferenceTests<SUT, T> {

}
