package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetWarningTest
implements org.j8unit.repository.javax.sql.rowset.RowSetWarningTests<javax.sql.rowset.RowSetWarning> {

    @Override
    public javax.sql.rowset.RowSetWarning createNewSUT() {
        return new javax.sql.rowset.RowSetWarning();
    }

}
