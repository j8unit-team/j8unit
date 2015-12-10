package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTransactionRollbackExceptionClassTest
implements org.j8unit.repository.java.sql.SQLTransactionRollbackExceptionClassTests<java.sql.SQLTransactionRollbackException> {

    @Override
    public Class<java.sql.SQLTransactionRollbackException> createNewSUT() {
        return java.sql.SQLTransactionRollbackException.class;
    }

}
