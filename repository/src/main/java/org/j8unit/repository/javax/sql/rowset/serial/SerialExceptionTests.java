package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.rowset.serial.SerialException class
 * javax.sql.rowset.serial.SerialException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sql.rowset.serial.SerialExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.rowset.serial.SerialExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.rowset.serial.SerialException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SerialExceptionTests<SUT extends javax.sql.rowset.serial.SerialException>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

}
