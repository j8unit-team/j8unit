package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.crypto.AEADBadTagException class
 * javax.crypto.AEADBadTagException}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.AEADBadTagExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.crypto.AEADBadTagExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.crypto.AEADBadTagException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AEADBadTagExceptionTests<SUT extends javax.crypto.AEADBadTagException>
extends org.j8unit.repository.javax.crypto.BadPaddingExceptionTests<SUT> {

}
