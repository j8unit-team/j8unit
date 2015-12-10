package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLPermissionClassTest
implements org.j8unit.repository.java.net.URLPermissionClassTests<java.net.URLPermission> {

    @Override
    public Class<java.net.URLPermission> createNewSUT() {
        return java.net.URLPermission.class;
    }

}
