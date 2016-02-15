package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.serial.SerialException class
 * javax.sql.rowset.serial.SerialException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SerialExceptionClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.serial.SerialException class javax.sql.rowset.serial.SerialException (the hereby targeted
 *      class-under-test class)
 * @see SerialExceptionClassTests SerialExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SerialExceptionTests<SUT extends javax.sql.rowset.serial.SerialException>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

}
