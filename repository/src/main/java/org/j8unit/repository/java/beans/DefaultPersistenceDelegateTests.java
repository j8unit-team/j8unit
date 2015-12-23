package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.DefaultPersistenceDelegate class
 * java.beans.DefaultPersistenceDelegate}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.beans.DefaultPersistenceDelegateTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.DefaultPersistenceDelegateClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.DefaultPersistenceDelegate
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultPersistenceDelegateTests<SUT extends java.beans.DefaultPersistenceDelegate>
extends org.j8unit.repository.java.beans.PersistenceDelegateTests<SUT> {

}
