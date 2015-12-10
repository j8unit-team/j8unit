package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NetPermissionClassTest
implements org.j8unit.repository.java.net.NetPermissionClassTests<java.net.NetPermission> {

    @Override
    public Class<java.net.NetPermission> createNewSUT() {
        return java.net.NetPermission.class;
    }

}
