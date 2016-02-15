package org.j8unit.repository.java.util.prefs;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.prefs.InvalidPreferencesFormatException class
 * java.util.prefs.InvalidPreferencesFormatException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link InvalidPreferencesFormatExceptionClassTests}.
 * </p>
 *
 * @see java.util.prefs.InvalidPreferencesFormatException class java.util.prefs.InvalidPreferencesFormatException (the
 *      hereby targeted class-under-test class)
 * @see InvalidPreferencesFormatExceptionClassTests InvalidPreferencesFormatExceptionClassTests (the complementary
 *      j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidPreferencesFormatExceptionTests<SUT extends java.util.prefs.InvalidPreferencesFormatException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
