package org.j8unit.repository.javax.sql;

import javax.sql.RowSetReader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetReaderClassTest
implements org.j8unit.repository.javax.sql.RowSetReaderClassTests<RowSetReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSetReader]

    @Override
    public Class<RowSetReader> createNewSUT() {
        return RowSetReader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.RowSetReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSetReader]

}
