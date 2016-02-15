package org.j8unit.repository.javax.security.sasl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.sasl.RealmChoiceCallback class
 * javax.security.sasl.RealmChoiceCallback}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RealmChoiceCallbackClassTests}.
 * </p>
 *
 * @see javax.security.sasl.RealmChoiceCallback class javax.security.sasl.RealmChoiceCallback (the hereby targeted
 *      class-under-test class)
 * @see RealmChoiceCallbackClassTests RealmChoiceCallbackClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RealmChoiceCallbackTests<SUT extends javax.security.sasl.RealmChoiceCallback>
extends org.j8unit.repository.javax.security.auth.callback.ChoiceCallbackTests<SUT> {

}
