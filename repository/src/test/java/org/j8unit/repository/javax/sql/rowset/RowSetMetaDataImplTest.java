package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetMetaDataImplTest
implements org.j8unit.repository.javax.sql.rowset.RowSetMetaDataImplTests<javax.sql.rowset.RowSetMetaDataImpl> {

    @Override
    public javax.sql.rowset.RowSetMetaDataImpl createNewSUT() {
        return new javax.sql.rowset.RowSetMetaDataImpl();
    }

}
