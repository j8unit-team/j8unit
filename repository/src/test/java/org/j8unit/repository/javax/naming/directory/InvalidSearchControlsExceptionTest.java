package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidSearchControlsExceptionTest
implements org.j8unit.repository.javax.naming.directory.InvalidSearchControlsExceptionTests<javax.naming.directory.InvalidSearchControlsException> {

    @Override
    public javax.naming.directory.InvalidSearchControlsException createNewSUT() {
        return new javax.naming.directory.InvalidSearchControlsException();
    }

}
