package org.j8unit.repository.javax.sql;

import javax.sql.RowSetMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RowSetMetaData} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sql.RowSetMetaDataTests}).
 */
@RunWith(J8Unit4.class)
public class RowSetMetaDataTest
implements RowSetMetaDataTests<RowSetMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetMetaData]

    @Override
    public RowSetMetaData createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.RowSetMetaData], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.RowSetMetaData]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.RowSetMetaData]

}
