package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BatchUpdateExceptionTest
implements org.j8unit.repository.java.sql.BatchUpdateExceptionTests<java.sql.BatchUpdateException> {

    @Override
    public java.sql.BatchUpdateException createNewSUT() {
        return new java.sql.BatchUpdateException();
    }

}
