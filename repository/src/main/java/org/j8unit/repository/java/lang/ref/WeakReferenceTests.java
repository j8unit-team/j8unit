package org.j8unit.repository.java.lang.ref;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.ref.WeakReference class java.lang.ref.WeakReference},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.ref.WeakReferenceTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.ref.WeakReferenceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.ref.WeakReference
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WeakReferenceTests<SUT extends java.lang.ref.WeakReference<T>, T>
extends org.j8unit.repository.java.lang.ref.ReferenceTests<SUT, T> {

}
