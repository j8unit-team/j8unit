package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.auth.callback.Callback interface javax.security.auth.callback.Callback},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.callback.CallbackClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CallbackTests<SUT extends javax.security.auth.callback.Callback>
extends J8UnitTest<SUT> {

}
