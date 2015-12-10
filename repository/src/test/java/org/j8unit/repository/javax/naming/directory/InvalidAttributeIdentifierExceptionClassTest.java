package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAttributeIdentifierExceptionClassTest
implements
org.j8unit.repository.javax.naming.directory.InvalidAttributeIdentifierExceptionClassTests<javax.naming.directory.InvalidAttributeIdentifierException> {

    @Override
    public Class<javax.naming.directory.InvalidAttributeIdentifierException> createNewSUT() {
        return javax.naming.directory.InvalidAttributeIdentifierException.class;
    }

}
