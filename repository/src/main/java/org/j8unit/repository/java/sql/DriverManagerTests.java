package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.DriverManager class java.sql.DriverManager}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.sql.DriverManagerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.DriverManagerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.DriverManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DriverManagerTests<SUT extends java.sql.DriverManager>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
