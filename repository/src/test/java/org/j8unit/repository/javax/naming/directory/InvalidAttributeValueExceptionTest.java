package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAttributeValueExceptionTest
implements org.j8unit.repository.javax.naming.directory.InvalidAttributeValueExceptionTests<javax.naming.directory.InvalidAttributeValueException> {

    @Override
    public javax.naming.directory.InvalidAttributeValueException createNewSUT() {
        return new javax.naming.directory.InvalidAttributeValueException();
    }

}
