package org.j8unit.repository.javax.security.auth.kerberos;

import javax.security.auth.kerberos.DelegationPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DelegationPermissionTest
implements org.j8unit.repository.javax.security.auth.kerberos.DelegationPermissionTests<DelegationPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.kerberos.DelegationPermission]

    @Override
    public DelegationPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.kerberos.DelegationPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.kerberos.DelegationPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.kerberos.DelegationPermission]

}
