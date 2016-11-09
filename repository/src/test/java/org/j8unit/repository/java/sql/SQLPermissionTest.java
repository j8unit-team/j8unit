package org.j8unit.repository.java.sql;

import java.sql.SQLPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SQLPermission} (by simply reusing the
 * J8Unit test interface {@link SQLPermissionTests}).
 */

@RunWith(J8Unit4.class)
public class SQLPermissionTest
implements SQLPermissionTests<SQLPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLPermission]

    @Override
    public SQLPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.SQLPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.SQLPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.SQLPermission]

}
