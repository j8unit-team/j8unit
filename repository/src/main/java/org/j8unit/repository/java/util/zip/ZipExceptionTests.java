package org.j8unit.repository.java.util.zip;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.zip.ZipException class java.util.zip.ZipException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ZipExceptionClassTests}.
 * </p>
 *
 * @see java.util.zip.ZipException class java.util.zip.ZipException (the hereby targeted class-under-test class)
 * @see ZipExceptionClassTests ZipExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ZipExceptionTests<SUT extends java.util.zip.ZipException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
