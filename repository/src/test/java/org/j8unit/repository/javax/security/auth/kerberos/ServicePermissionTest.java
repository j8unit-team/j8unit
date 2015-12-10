package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServicePermissionTest
implements org.j8unit.repository.javax.security.auth.kerberos.ServicePermissionTests<javax.security.auth.kerberos.ServicePermission> {

    @Override
    public javax.security.auth.kerberos.ServicePermission createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.security.auth.kerberos.ServicePermission] available.");
    }

}
