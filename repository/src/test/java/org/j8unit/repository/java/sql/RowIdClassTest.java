package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowIdClassTest
implements org.j8unit.repository.java.sql.RowIdClassTests<java.sql.RowId> {

    @Override
    public Class<java.sql.RowId> createNewSUT() {
        return java.sql.RowId.class;
    }

}
