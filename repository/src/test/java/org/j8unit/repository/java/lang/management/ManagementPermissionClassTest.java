package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ManagementPermissionClassTest
implements org.j8unit.repository.java.lang.management.ManagementPermissionClassTests<java.lang.management.ManagementPermission> {

    @Override
    public Class<java.lang.management.ManagementPermission> createNewSUT() {
        return java.lang.management.ManagementPermission.class;
    }

}
