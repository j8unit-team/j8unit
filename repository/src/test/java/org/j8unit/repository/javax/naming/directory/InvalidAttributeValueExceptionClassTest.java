package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAttributeValueExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.InvalidAttributeValueExceptionClassTests<javax.naming.directory.InvalidAttributeValueException> {

    @Override
    public Class<javax.naming.directory.InvalidAttributeValueException> createNewSUT() {
        return javax.naming.directory.InvalidAttributeValueException.class;
    }

}
