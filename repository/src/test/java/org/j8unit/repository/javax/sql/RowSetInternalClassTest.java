package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetInternalClassTest
implements org.j8unit.repository.javax.sql.RowSetInternalClassTests<javax.sql.RowSetInternal> {

    @Override
    public Class<javax.sql.RowSetInternal> createNewSUT() {
        return javax.sql.RowSetInternal.class;
    }

}
