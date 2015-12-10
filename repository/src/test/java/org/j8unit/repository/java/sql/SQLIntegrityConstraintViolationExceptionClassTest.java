package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLIntegrityConstraintViolationExceptionClassTest
implements org.j8unit.repository.java.sql.SQLIntegrityConstraintViolationExceptionClassTests<java.sql.SQLIntegrityConstraintViolationException> {

    @Override
    public Class<java.sql.SQLIntegrityConstraintViolationException> createNewSUT() {
        return java.sql.SQLIntegrityConstraintViolationException.class;
    }

}
