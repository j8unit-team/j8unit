package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoPermissionExceptionClassTest
implements org.j8unit.repository.javax.naming.NoPermissionExceptionClassTests<javax.naming.NoPermissionException> {

    @Override
    public Class<javax.naming.NoPermissionException> createNewSUT() {
        return javax.naming.NoPermissionException.class;
    }

}
