package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchAttributeExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.NoSuchAttributeExceptionClassTests<javax.naming.directory.NoSuchAttributeException> {

    @Override
    public Class<javax.naming.directory.NoSuchAttributeException> createNewSUT() {
        return javax.naming.directory.NoSuchAttributeException.class;
    }

}
