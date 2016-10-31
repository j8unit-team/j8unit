package org.j8unit.repository.javax.security.auth;

import javax.security.auth.PrivateCredentialPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivateCredentialPermissionTest
implements org.j8unit.repository.javax.security.auth.PrivateCredentialPermissionTests<PrivateCredentialPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.PrivateCredentialPermission]

    @Override
    public PrivateCredentialPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.PrivateCredentialPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.PrivateCredentialPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.PrivateCredentialPermission]

}
