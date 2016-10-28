package org.j8unit.repository.java.sql;

import java.sql.SQLPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLPermissionTest
implements org.j8unit.repository.java.sql.SQLPermissionTests<SQLPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLPermission]

    @Override
    public SQLPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.SQLPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLPermission]

}
