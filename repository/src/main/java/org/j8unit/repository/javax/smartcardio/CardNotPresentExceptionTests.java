package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.smartcardio.CardNotPresentException class
 * javax.smartcardio.CardNotPresentException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.smartcardio.CardNotPresentExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.smartcardio.CardNotPresentExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.smartcardio.CardNotPresentException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CardNotPresentExceptionTests<SUT extends javax.smartcardio.CardNotPresentException>
extends org.j8unit.repository.javax.smartcardio.CardExceptionTests<SUT> {

}
