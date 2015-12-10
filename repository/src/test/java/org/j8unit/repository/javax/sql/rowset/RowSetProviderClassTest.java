package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetProviderClassTest
implements org.j8unit.repository.javax.sql.rowset.RowSetProviderClassTests<javax.sql.rowset.RowSetProvider> {

    @Override
    public Class<javax.sql.rowset.RowSetProvider> createNewSUT() {
        return javax.sql.rowset.RowSetProvider.class;
    }

}
