package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLPermissionClassTest
implements org.j8unit.repository.javax.net.ssl.SSLPermissionClassTests<javax.net.ssl.SSLPermission> {

    @Override
    public Class<javax.net.ssl.SSLPermission> createNewSUT() {
        return javax.net.ssl.SSLPermission.class;
    }

}
