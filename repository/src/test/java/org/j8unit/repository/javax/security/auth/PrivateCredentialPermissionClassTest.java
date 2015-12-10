package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivateCredentialPermissionClassTest
implements org.j8unit.repository.javax.security.auth.PrivateCredentialPermissionClassTests<javax.security.auth.PrivateCredentialPermission> {

    @Override
    public Class<javax.security.auth.PrivateCredentialPermission> createNewSUT() {
        return javax.security.auth.PrivateCredentialPermission.class;
    }

}
