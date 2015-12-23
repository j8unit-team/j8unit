package org.j8unit.repository.javax.imageio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.imageio.IIOException class javax.imageio.IIOException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.imageio.IIOExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.imageio.IIOExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.imageio.IIOException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IIOExceptionTests<SUT extends javax.imageio.IIOException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
