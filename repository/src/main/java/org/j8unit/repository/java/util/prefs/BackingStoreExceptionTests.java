package org.j8unit.repository.java.util.prefs;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.prefs.BackingStoreException class
 * java.util.prefs.BackingStoreException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link BackingStoreExceptionClassTests}.
 * </p>
 *
 * @see java.util.prefs.BackingStoreException class java.util.prefs.BackingStoreException (the hereby targeted
 *      class-under-test class)
 * @see BackingStoreExceptionClassTests BackingStoreExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BackingStoreExceptionTests<SUT extends java.util.prefs.BackingStoreException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
