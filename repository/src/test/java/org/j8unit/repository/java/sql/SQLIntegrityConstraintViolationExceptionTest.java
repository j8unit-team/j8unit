package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLIntegrityConstraintViolationExceptionTest
implements org.j8unit.repository.java.sql.SQLIntegrityConstraintViolationExceptionTests<java.sql.SQLIntegrityConstraintViolationException> {

    @Override
    public java.sql.SQLIntegrityConstraintViolationException createNewSUT() {
        return new java.sql.SQLIntegrityConstraintViolationException();
    }

}
