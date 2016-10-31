package org.j8unit.repository.java.beans;

import java.beans.DefaultPersistenceDelegate;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link DefaultPersistenceDelegate public class java.beans.DefaultPersistenceDelegate}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.beans.DefaultPersistenceDelegateClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultPersistenceDelegateTests<SUT extends DefaultPersistenceDelegate>
extends org.j8unit.repository.java.beans.PersistenceDelegateTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.DefaultPersistenceDelegate]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.DefaultPersistenceDelegate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.DefaultPersistenceDelegate]
}
