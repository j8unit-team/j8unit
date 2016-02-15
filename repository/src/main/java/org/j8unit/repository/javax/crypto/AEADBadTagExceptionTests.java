package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.AEADBadTagException class javax.crypto.AEADBadTagException}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link AEADBadTagExceptionClassTests}.
 * </p>
 *
 * @see javax.crypto.AEADBadTagException class javax.crypto.AEADBadTagException (the hereby targeted class-under-test
 *      class)
 * @see AEADBadTagExceptionClassTests AEADBadTagExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AEADBadTagExceptionTests<SUT extends javax.crypto.AEADBadTagException>
extends BadPaddingExceptionTests<SUT> {

}
