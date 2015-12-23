package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.security.auth.callback.Callback interface
 * javax.security.auth.callback.Callback}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.security.auth.callback.CallbackTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.security.auth.callback.CallbackClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.security.auth.callback.Callback
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CallbackTests<SUT extends javax.security.auth.callback.Callback>
extends RepositoryTests<SUT> {

}
