package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServicePermissionClassTest
implements org.j8unit.repository.javax.security.auth.kerberos.ServicePermissionClassTests<javax.security.auth.kerberos.ServicePermission> {

    @Override
    public Class<javax.security.auth.kerberos.ServicePermission> createNewSUT() {
        return javax.security.auth.kerberos.ServicePermission.class;
    }

}
