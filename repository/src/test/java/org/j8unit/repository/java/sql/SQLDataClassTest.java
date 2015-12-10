package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLDataClassTest
implements org.j8unit.repository.java.sql.SQLDataClassTests<java.sql.SQLData> {

    @Override
    public Class<java.sql.SQLData> createNewSUT() {
        return java.sql.SQLData.class;
    }

}
