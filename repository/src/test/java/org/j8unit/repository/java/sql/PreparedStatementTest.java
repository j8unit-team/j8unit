package org.j8unit.repository.java.sql;

import java.sql.PreparedStatement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PreparedStatementTest
implements org.j8unit.repository.java.sql.PreparedStatementTests<PreparedStatement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.PreparedStatement]

    @Override
    public PreparedStatement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.PreparedStatement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.PreparedStatement]

}
