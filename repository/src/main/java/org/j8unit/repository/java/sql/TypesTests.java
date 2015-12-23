package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.Types class java.sql.Types}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
 * containing the class relevant test methods is {@link org.j8unit.repository.java.sql.TypesTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.TypesClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.Types
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TypesTests<SUT extends java.sql.Types>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
