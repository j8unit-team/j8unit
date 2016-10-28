package org.j8unit.repository.java.sql;

import java.sql.SQLInput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLInputClassTest
implements org.j8unit.repository.java.sql.SQLInputClassTests<SQLInput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.SQLInput]

    @Override
    public Class<SQLInput> createNewSUT() {
        return SQLInput.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.SQLInput]

}
