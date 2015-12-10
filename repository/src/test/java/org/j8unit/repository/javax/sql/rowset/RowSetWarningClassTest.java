package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetWarningClassTest
implements org.j8unit.repository.javax.sql.rowset.RowSetWarningClassTests<javax.sql.rowset.RowSetWarning> {

    @Override
    public Class<javax.sql.rowset.RowSetWarning> createNewSUT() {
        return javax.sql.rowset.RowSetWarning.class;
    }

}
