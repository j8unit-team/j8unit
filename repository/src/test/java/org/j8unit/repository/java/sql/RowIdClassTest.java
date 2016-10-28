package org.j8unit.repository.java.sql;

import java.sql.RowId;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowIdClassTest
implements org.j8unit.repository.java.sql.RowIdClassTests<RowId> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.RowId]

    @Override
    public Class<RowId> createNewSUT() {
        return RowId.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.RowId]

}
