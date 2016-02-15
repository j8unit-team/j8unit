package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.openmbean.InvalidKeyException class
 * javax.management.openmbean.InvalidKeyException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link InvalidKeyExceptionClassTests}.
 * </p>
 *
 * @see javax.management.openmbean.InvalidKeyException class javax.management.openmbean.InvalidKeyException (the hereby
 *      targeted class-under-test class)
 * @see InvalidKeyExceptionClassTests InvalidKeyExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidKeyExceptionTests<SUT extends javax.management.openmbean.InvalidKeyException>
extends org.j8unit.repository.java.lang.IllegalArgumentExceptionTests<SUT> {

}
