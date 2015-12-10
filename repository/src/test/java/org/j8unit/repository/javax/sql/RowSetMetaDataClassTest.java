package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetMetaDataClassTest
implements org.j8unit.repository.javax.sql.RowSetMetaDataClassTests<javax.sql.RowSetMetaData> {

    @Override
    public Class<javax.sql.RowSetMetaData> createNewSUT() {
        return javax.sql.RowSetMetaData.class;
    }

}
