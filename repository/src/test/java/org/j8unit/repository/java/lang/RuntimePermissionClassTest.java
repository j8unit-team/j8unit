package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimePermissionClassTest
implements org.j8unit.repository.java.lang.RuntimePermissionClassTests<java.lang.RuntimePermission> {

    @Override
    public Class<java.lang.RuntimePermission> createNewSUT() {
        return java.lang.RuntimePermission.class;
    }

}
