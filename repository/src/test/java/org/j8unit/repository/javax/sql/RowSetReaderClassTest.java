package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetReaderClassTest
implements org.j8unit.repository.javax.sql.RowSetReaderClassTests<javax.sql.RowSetReader> {

    @Override
    public Class<javax.sql.RowSetReader> createNewSUT() {
        return javax.sql.RowSetReader.class;
    }

}
