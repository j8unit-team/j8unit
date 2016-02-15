package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.UnsupportedAddressTypeException class
 * java.nio.channels.UnsupportedAddressTypeException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link UnsupportedAddressTypeExceptionClassTests}.
 * </p>
 *
 * @see java.nio.channels.UnsupportedAddressTypeException class java.nio.channels.UnsupportedAddressTypeException (the
 *      hereby targeted class-under-test class)
 * @see UnsupportedAddressTypeExceptionClassTests UnsupportedAddressTypeExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedAddressTypeExceptionTests<SUT extends java.nio.channels.UnsupportedAddressTypeException>
extends org.j8unit.repository.java.lang.IllegalArgumentExceptionTests<SUT> {

}
