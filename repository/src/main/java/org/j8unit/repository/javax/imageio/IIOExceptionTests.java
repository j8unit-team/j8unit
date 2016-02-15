package org.j8unit.repository.javax.imageio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.imageio.IIOException class javax.imageio.IIOException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link IIOExceptionClassTests}.
 * </p>
 *
 * @see javax.imageio.IIOException class javax.imageio.IIOException (the hereby targeted class-under-test class)
 * @see IIOExceptionClassTests IIOExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IIOExceptionTests<SUT extends javax.imageio.IIOException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
