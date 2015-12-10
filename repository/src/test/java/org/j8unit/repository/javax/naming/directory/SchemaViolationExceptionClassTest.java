package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SchemaViolationExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.SchemaViolationExceptionClassTests<javax.naming.directory.SchemaViolationException> {

    @Override
    public Class<javax.naming.directory.SchemaViolationException> createNewSUT() {
        return javax.naming.directory.SchemaViolationException.class;
    }

}
