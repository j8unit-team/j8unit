package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JDBCTypeClassTest
implements org.j8unit.repository.java.sql.JDBCTypeClassTests<java.sql.JDBCType> {

    @Override
    public Class<java.sql.JDBCType> createNewSUT() {
        return java.sql.JDBCType.class;
    }

}
