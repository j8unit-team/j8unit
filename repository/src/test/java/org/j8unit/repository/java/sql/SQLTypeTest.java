package org.j8unit.repository.java.sql;

import java.sql.SQLType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTypeTest
implements org.j8unit.repository.java.sql.SQLTypeTests<SQLType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLType]

    @Override
    public SQLType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.SQLType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.SQLType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.SQLType]

}
