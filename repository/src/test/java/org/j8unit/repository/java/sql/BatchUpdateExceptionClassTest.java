package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BatchUpdateExceptionClassTest
implements org.j8unit.repository.java.sql.BatchUpdateExceptionClassTests<java.sql.BatchUpdateException> {

    @Override
    public Class<java.sql.BatchUpdateException> createNewSUT() {
        return java.sql.BatchUpdateException.class;
    }

}
