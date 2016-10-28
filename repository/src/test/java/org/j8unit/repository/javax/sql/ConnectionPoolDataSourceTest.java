package org.j8unit.repository.javax.sql;

import javax.sql.ConnectionPoolDataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionPoolDataSourceTest
implements org.j8unit.repository.javax.sql.ConnectionPoolDataSourceTests<ConnectionPoolDataSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.ConnectionPoolDataSource]

    @Override
    public ConnectionPoolDataSource createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.ConnectionPoolDataSource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.ConnectionPoolDataSource]

}
