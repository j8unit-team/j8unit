package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAttributesExceptionTest
implements org.j8unit.repository.javax.naming.directory.InvalidAttributesExceptionTests<javax.naming.directory.InvalidAttributesException> {

    @Override
    public javax.naming.directory.InvalidAttributesException createNewSUT() {
        return new javax.naming.directory.InvalidAttributesException();
    }

}
