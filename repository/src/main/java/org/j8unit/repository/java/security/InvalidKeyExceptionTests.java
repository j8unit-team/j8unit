package org.j8unit.repository.java.security;

import java.security.InvalidKeyException;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link InvalidKeyException public class java.security.InvalidKeyException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.security.InvalidKeyExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidKeyExceptionTests<SUT extends InvalidKeyException>
extends KeyExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.InvalidKeyException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.InvalidKeyException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.InvalidKeyException]

}
