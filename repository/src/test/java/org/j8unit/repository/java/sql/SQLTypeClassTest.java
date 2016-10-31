package org.j8unit.repository.java.sql;

import java.sql.SQLType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTypeClassTest
implements org.j8unit.repository.java.sql.SQLTypeClassTests<SQLType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.SQLType]

    @Override
    public Class<SQLType> createNewSUT() {
        return SQLType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.SQLType]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.SQLType]

}
