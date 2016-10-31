package org.j8unit.repository.java.sql;

import java.sql.SQLData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLDataClassTest
implements org.j8unit.repository.java.sql.SQLDataClassTests<SQLData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.SQLData]

    @Override
    public Class<SQLData> createNewSUT() {
        return SQLData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.SQLData]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.SQLData]

}
