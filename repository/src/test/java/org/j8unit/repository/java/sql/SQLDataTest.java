package org.j8unit.repository.java.sql;

import java.sql.SQLData;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SQLData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.SQLDataTests}).
 */
@RunWith(J8Unit4.class)
public class SQLDataTest
implements SQLDataTests<SQLData> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLData]

    @Override
    public SQLData createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.SQLData], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.SQLData]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.SQLData]

}
