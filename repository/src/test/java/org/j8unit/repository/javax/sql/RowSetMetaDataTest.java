package org.j8unit.repository.javax.sql;

import javax.sql.RowSetMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetMetaDataTest
implements org.j8unit.repository.javax.sql.RowSetMetaDataTests<RowSetMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetMetaData]

    @Override
    public RowSetMetaData createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.RowSetMetaData], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetMetaData]

}
