package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.net.ProtocolException class java.net.ProtocolException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.net.ProtocolExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.net.ProtocolExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.net.ProtocolException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProtocolExceptionTests<SUT extends java.net.ProtocolException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
