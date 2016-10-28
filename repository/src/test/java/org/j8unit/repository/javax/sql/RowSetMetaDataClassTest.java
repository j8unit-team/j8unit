package org.j8unit.repository.javax.sql;

import javax.sql.RowSetMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetMetaDataClassTest
implements org.j8unit.repository.javax.sql.RowSetMetaDataClassTests<RowSetMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSetMetaData]

    @Override
    public Class<RowSetMetaData> createNewSUT() {
        return RowSetMetaData.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSetMetaData]

}
