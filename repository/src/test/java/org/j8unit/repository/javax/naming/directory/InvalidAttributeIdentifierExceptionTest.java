package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAttributeIdentifierExceptionTest
implements org.j8unit.repository.javax.naming.directory.InvalidAttributeIdentifierExceptionTests<javax.naming.directory.InvalidAttributeIdentifierException> {

    @Override
    public javax.naming.directory.InvalidAttributeIdentifierException createNewSUT() {
        return new javax.naming.directory.InvalidAttributeIdentifierException();
    }

}
