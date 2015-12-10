package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidSearchFilterExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.InvalidSearchFilterExceptionClassTests<javax.naming.directory.InvalidSearchFilterException> {

    @Override
    public Class<javax.naming.directory.InvalidSearchFilterException> createNewSUT() {
        return javax.naming.directory.InvalidSearchFilterException.class;
    }

}
