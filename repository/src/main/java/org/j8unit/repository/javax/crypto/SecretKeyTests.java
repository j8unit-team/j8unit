package org.j8unit.repository.javax.crypto;

import javax.crypto.SecretKey;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.security.KeyTests;
import org.j8unit.repository.javax.security.auth.DestroyableTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link SecretKey
 * public abstract interface javax.crypto.SecretKey}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.crypto.SecretKeyClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecretKeyTests<SUT extends SecretKey>
extends KeyTests<SUT>, DestroyableTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.SecretKey]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.SecretKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.SecretKey]

}
