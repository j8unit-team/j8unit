package org.j8unit.repository.java.sql;

import java.sql.DatabaseMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatabaseMetaDataTest
implements org.j8unit.repository.java.sql.DatabaseMetaDataTests<DatabaseMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.DatabaseMetaData]

    @Override
    public DatabaseMetaData createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.DatabaseMetaData], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.DatabaseMetaData]

}
