package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLInputClassTest
implements org.j8unit.repository.java.sql.SQLInputClassTests<java.sql.SQLInput> {

    @Override
    public Class<java.sql.SQLInput> createNewSUT() {
        return java.sql.SQLInput.class;
    }

}
