package org.j8unit.repository.java.awt.print;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.print.PrinterException class java.awt.print.PrinterException}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link PrinterExceptionClassTests}.
 * </p>
 *
 * @see java.awt.print.PrinterException class java.awt.print.PrinterException (the hereby targeted class-under-test
 *      class)
 * @see PrinterExceptionClassTests PrinterExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrinterExceptionTests<SUT extends java.awt.print.PrinterException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
