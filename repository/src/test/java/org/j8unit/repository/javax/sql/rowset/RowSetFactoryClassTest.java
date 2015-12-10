package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetFactoryClassTest
implements org.j8unit.repository.javax.sql.rowset.RowSetFactoryClassTests<javax.sql.rowset.RowSetFactory> {

    @Override
    public Class<javax.sql.rowset.RowSetFactory> createNewSUT() {
        return javax.sql.rowset.RowSetFactory.class;
    }

}
