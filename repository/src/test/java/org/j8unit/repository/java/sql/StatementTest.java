package org.j8unit.repository.java.sql;

import java.sql.Statement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StatementTest
implements org.j8unit.repository.java.sql.StatementTests<Statement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Statement]

    @Override
    public Statement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Statement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Statement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Statement]

}
