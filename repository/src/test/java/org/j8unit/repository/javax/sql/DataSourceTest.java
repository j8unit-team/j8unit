package org.j8unit.repository.javax.sql;

import javax.sql.DataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DataSource} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.DataSourceTests}).
 */

@RunWith(J8Unit4.class)
public class DataSourceTest
implements org.j8unit.repository.javax.sql.DataSourceTests<DataSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.DataSource]

    @Override
    public DataSource createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.DataSource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.DataSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.DataSource]

}
