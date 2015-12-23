package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.crypto.IllegalBlockSizeException class
 * javax.crypto.IllegalBlockSizeException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.IllegalBlockSizeExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.crypto.IllegalBlockSizeExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.crypto.IllegalBlockSizeException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalBlockSizeExceptionTests<SUT extends javax.crypto.IllegalBlockSizeException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
