package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.datatransfer.UnsupportedFlavorException class
 * java.awt.datatransfer.UnsupportedFlavorException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link UnsupportedFlavorExceptionClassTests}.
 * </p>
 *
 * @see java.awt.datatransfer.UnsupportedFlavorException class java.awt.datatransfer.UnsupportedFlavorException (the
 *      hereby targeted class-under-test class)
 * @see UnsupportedFlavorExceptionClassTests UnsupportedFlavorExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedFlavorExceptionTests<SUT extends java.awt.datatransfer.UnsupportedFlavorException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
