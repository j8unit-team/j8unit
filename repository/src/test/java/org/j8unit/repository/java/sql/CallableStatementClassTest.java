package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CallableStatementClassTest
implements org.j8unit.repository.java.sql.CallableStatementClassTests<java.sql.CallableStatement> {

    @Override
    public Class<java.sql.CallableStatement> createNewSUT() {
        return java.sql.CallableStatement.class;
    }

}
