package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.RowSetEvent class javax.sql.RowSetEvent}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link RowSetEventClassTests}.
 * </p>
 *
 * @see javax.sql.RowSetEvent class javax.sql.RowSetEvent (the hereby targeted class-under-test class)
 * @see RowSetEventClassTests RowSetEventClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RowSetEventTests<SUT extends javax.sql.RowSetEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

}
