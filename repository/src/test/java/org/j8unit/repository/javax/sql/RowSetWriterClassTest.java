package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetWriterClassTest
implements org.j8unit.repository.javax.sql.RowSetWriterClassTests<javax.sql.RowSetWriter> {

    @Override
    public Class<javax.sql.RowSetWriter> createNewSUT() {
        return javax.sql.RowSetWriter.class;
    }

}
