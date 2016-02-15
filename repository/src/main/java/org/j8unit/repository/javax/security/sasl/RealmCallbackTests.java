package org.j8unit.repository.javax.security.sasl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.sasl.RealmCallback class javax.security.sasl.RealmCallback}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link RealmCallbackClassTests}.
 * </p>
 *
 * @see javax.security.sasl.RealmCallback class javax.security.sasl.RealmCallback (the hereby targeted class-under-test
 *      class)
 * @see RealmCallbackClassTests RealmCallbackClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RealmCallbackTests<SUT extends javax.security.sasl.RealmCallback>
extends org.j8unit.repository.javax.security.auth.callback.TextInputCallbackTests<SUT> {

}
