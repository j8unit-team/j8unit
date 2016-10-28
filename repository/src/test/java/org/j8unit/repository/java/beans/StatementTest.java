package org.j8unit.repository.java.beans;

import java.beans.Statement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StatementTest
implements org.j8unit.repository.java.beans.StatementTests<Statement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Statement]

    @Override
    public Statement createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.Statement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Statement]

}
