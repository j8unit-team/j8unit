package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidSearchControlsExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.InvalidSearchControlsExceptionClassTests<javax.naming.directory.InvalidSearchControlsException> {

    @Override
    public Class<javax.naming.directory.InvalidSearchControlsException> createNewSUT() {
        return javax.naming.directory.InvalidSearchControlsException.class;
    }

}
