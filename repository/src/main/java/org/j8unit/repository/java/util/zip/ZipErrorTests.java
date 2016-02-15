package org.j8unit.repository.java.util.zip;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.zip.ZipError class java.util.zip.ZipError}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ZipErrorClassTests}.
 * </p>
 *
 * @see java.util.zip.ZipError class java.util.zip.ZipError (the hereby targeted class-under-test class)
 * @see ZipErrorClassTests ZipErrorClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ZipErrorTests<SUT extends java.util.zip.ZipError>
extends org.j8unit.repository.java.lang.InternalErrorTests<SUT> {

}
