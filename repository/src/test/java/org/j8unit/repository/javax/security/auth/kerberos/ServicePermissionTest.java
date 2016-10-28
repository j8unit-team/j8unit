package org.j8unit.repository.javax.security.auth.kerberos;

import javax.security.auth.kerberos.ServicePermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServicePermissionTest
implements org.j8unit.repository.javax.security.auth.kerberos.ServicePermissionTests<ServicePermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.kerberos.ServicePermission]

    @Override
    public ServicePermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.kerberos.ServicePermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.kerberos.ServicePermission]

}
