package org.j8unit.repository.javax.sql;

import javax.sql.RowSetWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetWriterClassTest
implements org.j8unit.repository.javax.sql.RowSetWriterClassTests<RowSetWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSetWriter]

    @Override
    public Class<RowSetWriter> createNewSUT() {
        return RowSetWriter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.RowSetWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSetWriter]

}
