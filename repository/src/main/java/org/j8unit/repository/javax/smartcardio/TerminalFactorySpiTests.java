package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.smartcardio.TerminalFactorySpi class
 * javax.smartcardio.TerminalFactorySpi}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.smartcardio.TerminalFactorySpiTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.smartcardio.TerminalFactorySpiClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.smartcardio.TerminalFactorySpi
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TerminalFactorySpiTests<SUT extends javax.smartcardio.TerminalFactorySpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
