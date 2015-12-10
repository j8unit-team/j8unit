package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTypeClassTest
implements org.j8unit.repository.java.sql.SQLTypeClassTests<java.sql.SQLType> {

    @Override
    public Class<java.sql.SQLType> createNewSUT() {
        return java.sql.SQLType.class;
    }

}
