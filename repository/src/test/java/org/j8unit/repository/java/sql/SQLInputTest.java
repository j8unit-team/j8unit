package org.j8unit.repository.java.sql;

import java.sql.SQLInput;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLInputTest
implements org.j8unit.repository.java.sql.SQLInputTests<SQLInput> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLInput]

    @Override
    public SQLInput createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.SQLInput], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLInput]

}
