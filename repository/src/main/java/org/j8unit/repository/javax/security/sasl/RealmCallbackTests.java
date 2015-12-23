package org.j8unit.repository.javax.security.sasl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.security.sasl.RealmCallback class
 * javax.security.sasl.RealmCallback}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.security.sasl.RealmCallbackTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.security.sasl.RealmCallbackClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.security.sasl.RealmCallback
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RealmCallbackTests<SUT extends javax.security.sasl.RealmCallback>
extends org.j8unit.repository.javax.security.auth.callback.TextInputCallbackTests<SUT> {

}
