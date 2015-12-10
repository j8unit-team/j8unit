package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthPermissionClassTest
implements org.j8unit.repository.javax.security.auth.AuthPermissionClassTests<javax.security.auth.AuthPermission> {

    @Override
    public Class<javax.security.auth.AuthPermission> createNewSUT() {
        return javax.security.auth.AuthPermission.class;
    }

}
