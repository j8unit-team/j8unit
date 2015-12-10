package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchAttributeExceptionTest
implements org.j8unit.repository.javax.naming.directory.NoSuchAttributeExceptionTests<javax.naming.directory.NoSuchAttributeException> {

    @Override
    public javax.naming.directory.NoSuchAttributeException createNewSUT() {
        return new javax.naming.directory.NoSuchAttributeException();
    }

}
