package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.RowSetEvent class javax.sql.RowSetEvent}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.javax.sql.RowSetEventTests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.RowSetEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.RowSetEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RowSetEventTests<SUT extends javax.sql.RowSetEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

}
