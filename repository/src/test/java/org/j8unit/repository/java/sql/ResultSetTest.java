package org.j8unit.repository.java.sql;

import java.sql.ResultSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResultSetTest
implements org.j8unit.repository.java.sql.ResultSetTests<ResultSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.ResultSet]

    @Override
    public ResultSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.ResultSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.ResultSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.ResultSet]

}
