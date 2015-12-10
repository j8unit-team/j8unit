package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoPermissionExceptionTest
implements org.j8unit.repository.javax.naming.NoPermissionExceptionTests<javax.naming.NoPermissionException> {

    @Override
    public javax.naming.NoPermissionException createNewSUT() {
        return new javax.naming.NoPermissionException();
    }

}
