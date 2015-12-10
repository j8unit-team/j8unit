package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetMetaDataImplClassTest
implements org.j8unit.repository.javax.sql.rowset.RowSetMetaDataImplClassTests<javax.sql.rowset.RowSetMetaDataImpl> {

    @Override
    public Class<javax.sql.rowset.RowSetMetaDataImpl> createNewSUT() {
        return javax.sql.rowset.RowSetMetaDataImpl.class;
    }

}
