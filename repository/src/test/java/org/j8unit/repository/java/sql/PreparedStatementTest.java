package org.j8unit.repository.java.sql;

import java.sql.PreparedStatement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PreparedStatement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.sql.PreparedStatementTests}).
 */
@RunWith(J8Unit4.class)
public class PreparedStatementTest
implements PreparedStatementTests<PreparedStatement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.PreparedStatement]

    @Override
    public PreparedStatement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.PreparedStatement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.PreparedStatement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.PreparedStatement]

}
