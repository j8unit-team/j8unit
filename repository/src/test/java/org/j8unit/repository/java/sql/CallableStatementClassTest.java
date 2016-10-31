package org.j8unit.repository.java.sql;

import java.sql.CallableStatement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CallableStatementClassTest
implements org.j8unit.repository.java.sql.CallableStatementClassTests<CallableStatement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.CallableStatement]

    @Override
    public Class<CallableStatement> createNewSUT() {
        return CallableStatement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.CallableStatement]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.CallableStatement]

}
