package org.j8unit.repository.javax.sql;

import javax.sql.RowSetMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSetMetaData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.RowSetMetaDataClassTests}).
 */
@RunWith(J8Unit4.class)
public class RowSetMetaDataClassTest
implements RowSetMetaDataClassTests<RowSetMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSetMetaData]

    @Override
    public Class<RowSetMetaData> createNewSUT() {
        return RowSetMetaData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.RowSetMetaData]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSetMetaData]

}
