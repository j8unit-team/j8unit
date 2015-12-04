package org.j8unit.repository.javax.security.sasl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.sasl.RealmChoiceCallback class javax.security.sasl.RealmChoiceCallback},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.sasl.RealmChoiceCallbackClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RealmChoiceCallbackTests<SUT extends javax.security.sasl.RealmChoiceCallback>
extends org.j8unit.repository.javax.security.auth.callback.ChoiceCallbackTests<SUT> {

}
