package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SchemaViolationExceptionTest
implements org.j8unit.repository.javax.naming.directory.SchemaViolationExceptionTests<javax.naming.directory.SchemaViolationException> {

    @Override
    public javax.naming.directory.SchemaViolationException createNewSUT() {
        return new javax.naming.directory.SchemaViolationException();
    }

}
