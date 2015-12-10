package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAttributesExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.InvalidAttributesExceptionClassTests<javax.naming.directory.InvalidAttributesException> {

    @Override
    public Class<javax.naming.directory.InvalidAttributesException> createNewSUT() {
        return javax.naming.directory.InvalidAttributesException.class;
    }

}
