package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTransactionRollbackExceptionTest
implements org.j8unit.repository.java.sql.SQLTransactionRollbackExceptionTests<java.sql.SQLTransactionRollbackException> {

    @Override
    public java.sql.SQLTransactionRollbackException createNewSUT() {
        return new java.sql.SQLTransactionRollbackException();
    }

}
